package net.mythiccraft.plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * An extension of a JavaPlugin that has more functions and customizations.
 *
 * @author Taylor Hughes
 * @since 1.0.0
 */
public class MythicPlugin extends JavaPlugin {

    private String prefix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix.replaceAll("&", "§");
    }

    public void log(String msg) {
        Bukkit.getConsoleSender().sendMessage(getPrefix() + " §f" + msg.replaceAll("&", "§"));
    }

    public void warn(String msg) {
        Bukkit.getConsoleSender().sendMessage(getPrefix() + " §cWARN: §f" + msg.replaceAll("&", "§"));
    }

    public void severe(String msg) {
        Bukkit.getConsoleSender().sendMessage(getPrefix() + " §4SEVERE: §f" + msg.replaceAll("&", "§"));
    }
}
