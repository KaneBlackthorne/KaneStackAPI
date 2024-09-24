package org.kane;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class KaneStackAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("KaneStackAPI in");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("KaneStackAPI out");
    }
}