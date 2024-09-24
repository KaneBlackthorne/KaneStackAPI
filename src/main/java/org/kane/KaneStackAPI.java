package org.kane;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

public class KaneStackAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("KaneStackAPI in");

        KaneItemStack testBlock = new KaneItemStack(
            "TEST_BLOCK",
            Material.DIAMOND_BLOCK,
            "TEST LOREEEE",
            "DIRT", "DIRT", "DIRT",
            "DIRT", "STONE", "DIRT",
            "DIRT", "DIRT", "DIRT"
        );
        testBlock.addItemToServer(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("KaneStackAPI out");
    }
}