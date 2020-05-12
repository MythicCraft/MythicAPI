package net.mythiccraft.menu;

import org.bukkit.inventory.ItemStack;

/**
 * Represents a GUI item
 *
 * @since 1.0.0
 */
public abstract class Item implements Clickable {

    private ItemStack item;

    public Item(ItemStack item) {
        this.item = item;
    }

    public ItemStack getItem() {
        return item;
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }
}
