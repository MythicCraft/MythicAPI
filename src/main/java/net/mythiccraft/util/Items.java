/*
 * Copyright (c) 2020 Taylor Hughes (taylorhughes719).
 */

package net.mythiccraft.util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Items {

    public static boolean verify(ItemStack item) {
        return item != null && item.getType() != Material.AIR;
    }

    public static boolean loreContains(@NotNull ItemStack item, String text) {
        return item.getItemMeta().hasLore() && item.getItemMeta().getLore().stream().anyMatch(line -> Text.decolorize(line).equalsIgnoreCase(text) || Text.decolorize(line).toLowerCase().contains(text.toLowerCase()));
    }
}
