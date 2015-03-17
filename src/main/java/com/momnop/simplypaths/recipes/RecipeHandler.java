package com.momnop.simplypaths.recipes;

import com.carpentersblocks.util.registry.BlockRegistry;
import com.momnop.simplypaths.blocks.SimplyPathsBlocks;
import com.momnop.simplypaths.config.ConfigHandler;
import com.momnop.simplypaths.items.SimplyPathsItems;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Handles the recipes
 */
public class RecipeHandler
{
	public int woolMeta[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    /**
     * Registers the mod's recipes
     */
    public static void doRecipes()
    {
    	GameRegistry.addRecipe(new ItemStack(SimplyPathsItems.pathChisel, 1), new Object[] {"  I", " I ", "  S", 'S', Items.stick, 'I', Items.iron_ingot});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.asphaultBlock, 3), new Object[]{Blocks.stone, Blocks.stone, Blocks.stone, new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.whiteLineBlock, 3), new Object[]{Blocks.stone, Blocks.stone, Blocks.stone, new ItemStack(Items.dye, 1, 15)});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.yellowLineBlock, 3), new Object[]{Blocks.stone, Blocks.stone, Blocks.stone, new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.yellowBricksBlock, 3), new Object[]{Blocks.brick_block, Blocks.brick_block, Blocks.brick_block, new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.blackBricksBlock, 3), new Object[]{Blocks.brick_block, Blocks.brick_block, Blocks.brick_block, new ItemStack(Items.dye, 1, 0)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.blockAsphaultPath, 1), new Object[]{SimplyPathsBlocks.blockAsphaultFullWhitePath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.blockAsphaultPath, 1), new Object[]{SimplyPathsBlocks.blockAsphaultFullYellowPath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.blockAsphaultPath, 1), new Object[]{SimplyPathsBlocks.blockAsphaultBrokenWhitePath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.blockAsphaultPath, 1), new Object[]{SimplyPathsBlocks.blockAsphaultBrokenYellowPath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.blockAsphaultPath, 1), new Object[]{SimplyPathsBlocks.blockAsphaultWhiteIntersectionPath});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt, 1), new Object[]{SimplyPathsBlocks.blockDirtPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt, 1, 2), new Object[]{SimplyPathsBlocks.blockPodzolPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gravel, 1), new Object[]{SimplyPathsBlocks.blockGravelPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 1), new Object[]{SimplyPathsBlocks.blockCobblestonePath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 1), new Object[]{SimplyPathsBlocks.blockStonePath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stonebrick, 1), new Object[]{SimplyPathsBlocks.blockStoneBrickPath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.asphaultBlock, 1), new Object[]{SimplyPathsBlocks.blockAsphaultPath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.whiteLineBlock, 1), new Object[]{SimplyPathsBlocks.blockWhiteLinePath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.yellowLineBlock, 1), new Object[]{SimplyPathsBlocks.blockYellowLinePath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1, 0), new Object[]{SimplyPathsBlocks.blockOakPlankPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1, 1), new Object[]{SimplyPathsBlocks.blockSprucePlankPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1, 2), new Object[]{SimplyPathsBlocks.blockBirchPlankPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1, 3), new Object[]{SimplyPathsBlocks.blockJunglePlankPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1, 4), new Object[]{SimplyPathsBlocks.blockAcaciaPlankPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1, 5), new Object[]{SimplyPathsBlocks.blockDarkOakPlankPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.quartz_block, 1, 0), new Object[]{SimplyPathsBlocks.blockQuartzPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.quartz_block, 1, 1), new Object[]{SimplyPathsBlocks.blockChiselledQuartzPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.quartz_block, 1, 2), new Object[]{SimplyPathsBlocks.blockPillarQuartzPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.soul_sand, 1), new Object[]{SimplyPathsBlocks.blockSoulSandPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.netherrack, 1), new Object[]{SimplyPathsBlocks.blockNetherrackPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.glowstone, 1), new Object[]{SimplyPathsBlocks.blockGlowstonePath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.clay, 1), new Object[]{SimplyPathsBlocks.blockClayPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand, 1), new Object[]{SimplyPathsBlocks.blockSandPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand, 1, 1), new Object[]{SimplyPathsBlocks.blockRedSandPath});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sandstone, 1), new Object[]{SimplyPathsBlocks.blockSandstonePath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.blockAsphaultBrokenWhitePath, 3), new Object[]{SimplyPathsBlocks.blockAsphaultPath, SimplyPathsBlocks.blockAsphaultPath, SimplyPathsBlocks.blockAsphaultPath, new ItemStack(Items.dye, 1, 15)});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.blockAsphaultBrokenYellowPath, 3), new Object[]{SimplyPathsBlocks.blockAsphaultPath, SimplyPathsBlocks.blockAsphaultPath, SimplyPathsBlocks.blockAsphaultPath, new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.blockAsphaultFullWhitePath, 3), new Object[]{SimplyPathsBlocks.blockAsphaultBrokenWhitePath, SimplyPathsBlocks.blockAsphaultBrokenWhitePath, SimplyPathsBlocks.blockAsphaultBrokenWhitePath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.blockAsphaultFullYellowPath, 3), new Object[]{SimplyPathsBlocks.blockAsphaultBrokenYellowPath, SimplyPathsBlocks.blockAsphaultBrokenYellowPath, SimplyPathsBlocks.blockAsphaultBrokenYellowPath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.blockAsphaultWhiteIntersectionPath, 3), new Object[]{SimplyPathsBlocks.blockAsphaultFullWhitePath, SimplyPathsBlocks.blockAsphaultFullWhitePath, SimplyPathsBlocks.blockAsphaultFullWhitePath, new ItemStack(Items.dye, 1, 15)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.brick_block, 1), new Object[]{SimplyPathsBlocks.blockBricksPath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.yellowBricksBlock, 1), new Object[]{SimplyPathsBlocks.blockYellowBricksPath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.blackBricksBlock, 1), new Object[]{SimplyPathsBlocks.blockBlackBricksPath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.metalBlock, 1), new Object[]{SimplyPathsBlocks.blockMetalPath});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.laboratoryBlock, 1), new Object[]{SimplyPathsBlocks.blockLaboratoryPath});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 0), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 1), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 2), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 3), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 3)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 4), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 5), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 5)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 6), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 6)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 7), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 7)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 8), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 8)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 9), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 9)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 10), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 10)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 11), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 11)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 12), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 12)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 13), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 13)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 14), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 14)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 15), new Object[]{new ItemStack(SimplyPathsBlocks.blockWoolPath, 1, 15)});
		
		GameRegistry.addRecipe(new ItemStack(SimplyPathsBlocks.metalBlock, 8), new Object[] {" X ", "XIX", " X ", 'I', Items.iron_ingot, 'X', Blocks.stone});
		
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.laboratoryBlock, 1), new Object[]{SimplyPathsBlocks.metalBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.metalBlock, 1), new Object[]{SimplyPathsBlocks.laboratoryBlock});
		
		GameRegistry.addRecipe(new ItemStack(SimplyPathsItems.wrench, 1), new Object[] {" X ", " XX", "X  ", 'X', Items.iron_ingot});
    	
    	GameRegistry.addRecipe(new ItemStack(SimplyPathsBlocks.blockSlowMovingPath, 6), new Object[] {"XXX", "GSG", 'X', Blocks.rail, 'G', Items.iron_ingot, 'S', Blocks.stone});
    	GameRegistry.addRecipe(new ItemStack(SimplyPathsBlocks.blockFastMovingPath, 6), new Object[] {"XXX", "GSG", 'X', Blocks.rail, 'G', Items.gold_ingot, 'S', Blocks.stone});
    	GameRegistry.addRecipe(new ItemStack(SimplyPathsBlocks.blockFastestMovingPath, 6), new Object[] {"XXX", "GSG", 'X', Blocks.rail, 'G', Items.diamond, 'S', Blocks.stone});
    	
    	GameRegistry.addRecipe(new ItemStack(SimplyPathsBlocks.blockSlowMovingStairPath, 6), new Object[] {"X  ", "XX ", "XXX", 'X', SimplyPathsBlocks.blockSlowMovingPath});
    	GameRegistry.addRecipe(new ItemStack(SimplyPathsBlocks.blockFastMovingStairPath, 6), new Object[] {"X  ", "XX ", "XXX", 'X', SimplyPathsBlocks.blockFastMovingPath});
    	GameRegistry.addRecipe(new ItemStack(SimplyPathsBlocks.blockFastestMovingStairPath, 6), new Object[] {"X  ", "XX ", "XXX", 'X', SimplyPathsBlocks.blockFastestMovingPath});

    	GameRegistry.addRecipe(new ItemStack(SimplyPathsItems.fanBlade, 2), new Object[] {"X  ", " X ", "  X", 'X', Items.iron_ingot});
    	
    	GameRegistry.addRecipe(new ItemStack(SimplyPathsBlocks.blockLowRangeItemPropeller, 1), new Object[] {"SIS", "IGI", "SIS", 'I', SimplyPathsItems.fanBlade, 'G', Items.iron_ingot, 'S', Blocks.stone});
    	GameRegistry.addRecipe(new ItemStack(SimplyPathsBlocks.blockMidRangeItemPropeller, 1), new Object[] {"SIS", "IGI", "SIS", 'I', SimplyPathsItems.fanBlade, 'G', Items.gold_ingot, 'S', Blocks.stone});
    	GameRegistry.addRecipe(new ItemStack(SimplyPathsBlocks.blockHighRangeItemPropeller, 1), new Object[] {"SIS", "IGI", "SIS", 'I', SimplyPathsItems.fanBlade, 'G', Items.diamond, 'S', Blocks.stone});
		
		if (Loader.isModLoaded("CarpentersBlocks")) {
			GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.blockCarpentersPath, 1), new Object[]{new ItemStack(SimplyPathsItems.pathChisel, 1, OreDictionary.WILDCARD_VALUE), BlockRegistry.blockCarpentersBlock});
			
			GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.blockCarpentersBlock, 1), new Object[]{SimplyPathsBlocks.blockCarpentersPath});
		}
    }

}