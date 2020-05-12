package net.mythiccraft;

import net.mythiccraft.plugin.MythicPlugin;

import org.bukkit.event.HandlerList;

/**
 * The main class of the MthyicCraft API.
 *
 * @author Taylor Hughes
 * @since 1.0.0
 */
public final class MythicCore extends MythicPlugin {

    private static MythicCore instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        setPrefix("&b[MythicAPI]");

        if (!getDataFolder().exists() && !getDataFolder().mkdir()) {
            severe("Failed to create plugin directory! The plugin will now be disabled.");
            setEnabled(false);
        }

        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        HandlerList.unregisterAll(instance);

        // Just to be safe, set the instance to null
        instance = null;

        HandlerList.unregisterAll(this);
    }

    /**
     * Get the instance of the plugin.
     *
     * @return The plugin's static instance.
     */
    public static MythicCore getInstance() {
        return instance;
    }
}
