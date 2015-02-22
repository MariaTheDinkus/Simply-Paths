package com.momnop.simplypaths;

import java.util.List;
import java.util.Random;

import com.momnop.simplypaths.blocks.SimplyPathsBlocks;
import com.momnop.simplypaths.config.ConfigHandler;
import com.momnop.simplypaths.info.ModInfo;
import com.momnop.simplypaths.items.SimplyPathsItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SimplyPathsCreativeTab extends CreativeTabs {

	List list;
	public static SimplyPathsCreativeTab INSTANCE = new SimplyPathsCreativeTab();

	public SimplyPathsCreativeTab() {
		super(ModInfo.MODID);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(SimplyPathsBlocks.blockPath);
	}

	@Override
	public Item getTabIconItem() {
		return getIconItemStack().getItem();
	}

	@Override
	public void displayAllReleventItems(List list) {
		this.list = list;
		
		addItem(SimplyPathsItems.pathChisel);
		addBlock(SimplyPathsBlocks.asphaultBlock);
		addBlock(SimplyPathsBlocks.whiteLineBlock);
		addBlock(SimplyPathsBlocks.yellowLineBlock);
		addBlock(SimplyPathsBlocks.yellowBricksBlock);
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 0));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 1));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 2));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 3));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 4));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 5));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 6));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 7));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 8));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 9));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 10));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 11));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 12));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 13));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 14));
		list.add(new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 15));
		addBlock(SimplyPathsBlocks.blockPath);
		addBlock(SimplyPathsBlocks.blockDirtPath);
		addBlock(SimplyPathsBlocks.blockPodzolPath);
		addBlock(SimplyPathsBlocks.blockClayPath);
		addBlock(SimplyPathsBlocks.blockGravelPath);
		addBlock(SimplyPathsBlocks.blockSandPath);
		addBlock(SimplyPathsBlocks.blockSandstonePath);
		addBlock(SimplyPathsBlocks.blockCobblestonePath);
		addBlock(SimplyPathsBlocks.blockStonePath);
		addBlock(SimplyPathsBlocks.blockStoneBrickPath);
		addBlock(SimplyPathsBlocks.blockBricksPath);
		addBlock(SimplyPathsBlocks.blockYellowBricksPath);
		addBlock(SimplyPathsBlocks.blockQuartzPath);
		addBlock(SimplyPathsBlocks.blockChiselledQuartzPath);
		addBlock(SimplyPathsBlocks.blockPillarQuartzPath);
		addBlock(SimplyPathsBlocks.blockNetherrackPath);
		addBlock(SimplyPathsBlocks.blockSoulSandPath);
		addBlock(SimplyPathsBlocks.blockGlowstonePath);
		addBlock(SimplyPathsBlocks.blockOakPlankPath);
		addBlock(SimplyPathsBlocks.blockSprucePlankPath);
		addBlock(SimplyPathsBlocks.blockBirchPlankPath);
		addBlock(SimplyPathsBlocks.blockJunglePlankPath);
		addBlock(SimplyPathsBlocks.blockAcaciaPlankPath);
		addBlock(SimplyPathsBlocks.blockDarkOakPlankPath);
		addBlock(SimplyPathsBlocks.blockAsphaultPath);
		addBlock(SimplyPathsBlocks.blockAsphaultWhitePath);
		addBlock(SimplyPathsBlocks.blockAsphaultYellowPath);
		addBlock(SimplyPathsBlocks.blockAsphaultWhiteCornerPath);
	}

	private void addItem(Item item) {
		item.getSubItems(item, this, list);
	}

	private void addBlock(Block block) {
		ItemStack stack = new ItemStack(block);
		block.getSubBlocks(stack.getItem(), this, list);
	}

}