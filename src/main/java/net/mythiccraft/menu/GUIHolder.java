package net.mythiccraft.menu;

import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

/**
 * A GUI inventory holder, for easy inventory event detection.
 *
 * @author Taylor Hughes
 * @since 1.0.0
 */
public interface GUIHolder extends InventoryHolder {

    /**
     * Get the GUI held in this GUIHolder.
     *
     * @return The GUI
     */
    @NotNull GUI getGUI();
}
