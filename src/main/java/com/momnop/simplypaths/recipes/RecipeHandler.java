package com.momnop.simplypaths.recipes;

import com.momnop.simplypaths.blocks.SimplyPathsBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Handles the recipes
 */
public class RecipeHandler
{

    /**
     * Registers the mod's recipes
     */
    public static void doRecipes()
    {

    	GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.asphaultBlock, 3), new Object[]{Blocks.stone, Blocks.stone, Blocks.stone, new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.whiteLineBlock, 3), new Object[]{Blocks.stone, Blocks.stone, Blocks.stone, new ItemStack(Items.dye, 1, 15)});
		GameRegistry.addShapelessRecipe(new ItemStack(SimplyPathsBlocks.yellowLineBlock, 3), new Object[]{Blocks.stone, Blocks.stone, Blocks.stone, new ItemStack(Items.dye, 1, 11)});
		
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
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sandstone, 1), new Object[]{SimplyPathsBlocks.blockSandstonePath});

    }

}