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

public class SimplyPathsMechanicalCreativeTab extends CreativeTabs {

	List list;
	public static SimplyPathsMechanicalCreativeTab INSTANCE = new SimplyPathsMechanicalCreativeTab();

	public SimplyPathsMechanicalCreativeTab() {
		super(ModInfo.MODID + "mechanical");
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(SimplyPathsBlocks.blockSlowMovingPath);
	}

	@Override
	public Item getTabIconItem() {
		return getIconItemStack().getItem();
	}

	@Override
	public void displayAllReleventItems(List list) {
		this.list = list;
		
		addItem(SimplyPathsItems.wrench);
		addItem(SimplyPathsItems.fanBlade);
		
		addBlock(SimplyPathsBlocks.blockSlowMovingPath);
		addBlock(SimplyPathsBlocks.blockFastMovingPath);
		addBlock(SimplyPathsBlocks.blockFastestMovingPath);
		addBlock(SimplyPathsBlocks.blockSlowMovingStairPath);
		addBlock(SimplyPathsBlocks.blockFastMovingStairPath);
		addBlock(SimplyPathsBlocks.blockFastestMovingStairPath);
		addBlock(SimplyPathsBlocks.blockLowRangeItemPropeller);
		addBlock(SimplyPathsBlocks.blockMidRangeItemPropeller);
		addBlock(SimplyPathsBlocks.blockHighRangeItemPropeller);
	}

	private void addItem(Item item) {
		item.getSubItems(item, this, list);
	}

	private void addBlock(Block block) {
		ItemStack stack = new ItemStack(block);
		block.getSubBlocks(stack.getItem(), this, list);
	}

}