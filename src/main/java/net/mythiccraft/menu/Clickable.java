package net.mythiccraft.menu;

import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Represents an item that can be clicked.
 *
 * @since 1.0.0
 */
public interface Clickable {

    /**
     * Called when the item is clicked
     *
     * @param e The click event
     */
    void onClick(InventoryClickEvent e);
}
