package org.kane;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class KaneStackAPI extends JavaPlugin implements {

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