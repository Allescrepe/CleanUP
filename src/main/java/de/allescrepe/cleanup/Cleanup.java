package de.allescrepe.cleanup;

import de.allescrepe.cleanup.commands.cleanupcom;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Cleanup extends JavaPlugin {

    public Cleanup(Cleanup cleanup) {
    }

    public Cleanup() {

    }

    @Override
    public void onEnable() {
        int Cleanupwait = 0;
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "CleanUP Loaded");

        PluginManager manager = Bukkit.getPluginManager();


        getCommand("cleanup").setExecutor(new cleanupcom());

    }

    @Override
    public void onDisable() {

    }
}
