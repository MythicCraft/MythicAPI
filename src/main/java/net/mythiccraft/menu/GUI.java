package net.mythiccraft.menu;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import net.mythiccraft.plugin.MythicPlugin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * An inventory GUI class. Extend this class and implement the clicks.
 *
 * @author Taylor Hughes
 * @since 1.0.0
 */
public abstract class GUI implements GUIHolder {

    private MythicPlugin plugin;
    private String name;
    private Inventory inventory;
    private Map<Integer, Item> items;
    private List<String> viewers;

    public GUI(MythicPlugin plugin) {
        this.plugin = plugin;
        this.items = new HashMap<>();
        this.viewers = new ArrayList<>();
    }

    public MythicPlugin getPlugin() {
        return plugin;
    }

    public Map<Integer, Item> getItems() {
        return items;
    }

    @Nullable
    public Item getItem(int slot) {
        return items.get(slot);
    }

    public void onClick(InventoryClickEvent e) {
        if (e.getCurrentItem() != null && getItem(e.getSlot()) != null) {
            Objects.requireNonNull(getItem(e.getSlot())).onClick(e);
        }
    }

    @Override
    @NotNull
    public GUI getGUI() {
        return this;
    }

    @NotNull
    @Override
    public Inventory getInventory() {
        return inventory;
    }

    public List<String> getViewers() {
        return viewers;
    }

    public boolean isViewing(Player player) {
        return viewers.contains(player.getName().toLowerCase());
    }

    public void open(Player player) {
        if (isViewing(player)) {
            return;
        }
        viewers.add(player.getName().toLowerCase());
        player.openInventory(inventory);
    }

    public void close(Player player) {
        if (isViewing(player)) {
            player.closeInventory();
            viewers.remove(player.getName().toLowerCase());
        }
    }
}
