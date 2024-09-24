package org.kane;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class KaneItemStack {

    private String name;
    private Material material;
    private String lore;
    private String[] craftingRecipe;

    public KaneItemStack(String name, Material material, String lore, String... craftingRecipe) {
        this.name = name;
        this.material = material;
        this.lore = lore;
        this.craftingRecipe = craftingRecipe;
    }

    public void addItemToServer(JavaPlugin plugin) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(name);
            meta.setLore(Arrays.asList(lore.split("\n")));
            item.setItemMeta(meta);
        }

        ShapedRecipe recipe = new ShapedRecipe(item);
        recipe.shape("ABC", "DEF", "GHI");

        char[] keys = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        for (int i = 0; i < craftingRecipe.length; i++) {
            recipe.setIngredient(keys[i], Material.valueOf(craftingRecipe[i]));
        }

        Bukkit.addRecipe(recipe);
    }
}