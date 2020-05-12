/*
 * Copyright (c) 2020 taylorhughes719.
 */

package net.mythiccraft.util;

import net.mythiccraft.plugin.MythicPlugin;

/**
 * A class used to manage data and unload it all at the end.
 *
 * @since 1.0.0
 */
public abstract class Manager {

    public MythicPlugin plugin;

    public Manager(MythicPlugin plugin) {
        this.plugin = plugin;
    }

    public MythicPlugin getPlugin() {
        return this.plugin;
    }

    public abstract void shutdown();
}
