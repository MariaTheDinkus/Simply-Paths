package com.momnop.simplypaths.items;

import com.momnop.simplypaths.blocks.SimplyPathsBlocks;
import com.momnop.simplypaths.config.ConfigHandler;
import com.momnop.simplypaths.info.ItemInfo;
import com.momnop.simplypaths.items.mechanical.ItemFanBlade;
import com.momnop.simplypaths.items.mechanical.ItemWrench;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class SimplyPathsItems {
	public static Item pathChisel;
	public static Item wrench, fanBlade;

	public static void load() {
		pathChisel = new ItemPathChisel(ItemInfo.PATH_CHISEL_UNLOCALIZED_NAME);
		wrench = new ItemWrench(ItemInfo.CONVEYOR_WRENCH_UNLOCALIZED_NAME);
		fanBlade = new ItemFanBlade(ItemInfo.FAN_BLADE_UNLOCALIZED_NAME);
		registerItems();
	}

	public static void registerItems() {
		registerItem(pathChisel);
		registerItem(wrench);
		registerItem(fanBlade);
	}

	public static void registerItem(Item i) {
		GameRegistry.registerItem(i, i.getUnlocalizedName().substring(5));
	}
}