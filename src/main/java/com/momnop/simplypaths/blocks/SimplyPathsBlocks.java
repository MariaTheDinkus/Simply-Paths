package com.momnop.simplypaths.blocks;

import com.carpentersblocks.CarpentersBlocks;
import com.carpentersblocks.block.BlockCarpentersBlock;
import com.carpentersblocks.util.BlockProperties;
import com.momnop.simplypaths.info.BlockInfo;
import com.momnop.simplypaths.blocks.mechanical.BlockHighRangeItemPropeller;
import com.momnop.simplypaths.blocks.mechanical.BlockLowRangeItemPropeller;
import com.momnop.simplypaths.blocks.mechanical.BlockMidRangeItemPropeller;
import com.momnop.simplypaths.blocks.mechanical.BlockMovingFastDownStairPath;
import com.momnop.simplypaths.blocks.mechanical.BlockMovingFastPath;
import com.momnop.simplypaths.blocks.mechanical.BlockMovingFastStairPath;
import com.momnop.simplypaths.blocks.mechanical.BlockMovingFastestDownStairPath;
import com.momnop.simplypaths.blocks.mechanical.BlockMovingFastestPath;
import com.momnop.simplypaths.blocks.mechanical.BlockMovingFastestStairPath;
import com.momnop.simplypaths.blocks.mechanical.BlockMovingSlowDownStairPath;
import com.momnop.simplypaths.blocks.mechanical.BlockMovingSlowPath;
import com.momnop.simplypaths.blocks.mechanical.BlockMovingSlowStairPath;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SimplyPathsBlocks
{
	public static Block blockSlowMovingPath, blockFastMovingPath, blockFastestMovingPath, blockSlowMovingStairPath, blockFastMovingStairPath, blockFastestMovingStairPath, blockSlowDownMovingStairPath, blockFastDownMovingStairPath, blockFastestDownMovingStairPath;
	public static Block blockLowRangeItemPropeller, blockMidRangeItemPropeller, blockHighRangeItemPropeller;
	public static Block asphaultBlock, whiteLineBlock, yellowLineBlock, yellowBricksBlock, blackBricksBlock;
	public static Block blockAsphaultFullWhitePath, blockAsphaultBrokenWhitePath, blockAsphaultFullYellowPath, blockAsphaultBrokenYellowPath, blockAsphaultWhiteIntersectionPath;
	public static Block blockPath, blockDarkPath, blockDirtPath, blockClayPath, blockGravelPath, blockSandPath, blockRedSandPath, blockSoulSandPath, blockPodzolPath;
    public static Block blockAsphaultPath, blockWhiteLinePath, blockYellowLinePath, blockSandstonePath, blockCobblestonePath, blockStonePath, blockStoneBrickPath, blockBricksPath, blockYellowBricksPath, blockBlackBricksPath, blockQuartzPath, blockChiselledQuartzPath, blockPillarQuartzPath, blockNetherrackPath, blockGlowstonePath;
    public static Block blockOakPlankPath, blockSprucePlankPath, blockBirchPlankPath, blockJunglePlankPath, blockAcaciaPlankPath, blockDarkOakPlankPath;
    public static Block blockLaboratoryPath, blockCarpentersPath;
    public static Block blockWoolPath;
    public static void load()
    {
    	blockSlowMovingPath = new BlockMovingSlowPath(Material.rock, BlockInfo.SLOW_MOVING_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
        blockFastMovingPath = new BlockMovingFastPath(Material.rock, BlockInfo.FAST_MOVING_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
        blockFastestMovingPath = new BlockMovingFastestPath(Material.rock, BlockInfo.FASTEST_MOVING_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
              
        blockSlowMovingStairPath = new BlockMovingSlowStairPath(Material.rock, BlockInfo.SLOW_MOVING_STAIR_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
        blockFastMovingStairPath = new BlockMovingFastStairPath(Material.rock, BlockInfo.FAST_MOVING_STAIR_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
        blockFastestMovingStairPath = new BlockMovingFastestStairPath(Material.rock, BlockInfo.FASTEST_MOVING_STAIR_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
        
        blockSlowDownMovingStairPath = new BlockMovingSlowDownStairPath(Material.rock, BlockInfo.SLOW_DOWN_MOVING_STAIR_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
        blockFastDownMovingStairPath = new BlockMovingFastDownStairPath(Material.rock, BlockInfo.FAST_DOWN_MOVING_STAIR_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
        blockFastestDownMovingStairPath = new BlockMovingFastestDownStairPath(Material.rock, BlockInfo.FASTEST_DOWN_MOVING_STAIR_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
        
        blockLowRangeItemPropeller = new BlockLowRangeItemPropeller(Material.rock, BlockInfo.BLOCK_LOW_RANGE_ITEM_PROPELLER_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
        blockMidRangeItemPropeller = new BlockMidRangeItemPropeller(Material.rock, BlockInfo.BLOCK_MID_RANGE_ITEM_PROPELLER_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
        blockHighRangeItemPropeller = new BlockHighRangeItemPropeller(Material.rock, BlockInfo.BLOCK_HIGH_RANGE_ITEM_PROPELLER_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
    	
    	asphaultBlock = new BlockNormal(BlockInfo.ASPHAULT_UNLOCALIZED_NAME, "stone", 1.5F, 0, "stone");
    	whiteLineBlock = new BlockNormal(BlockInfo.WHITE_LINE_UNLOCALIZED_NAME, "stone", 1.5F, 0, "stone");
    	yellowLineBlock = new BlockNormal(BlockInfo.YELLOW_LINE_UNLOCALIZED_NAME, "stone", 1.5F, 0, "stone");
    	yellowBricksBlock = new BlockNormal(BlockInfo.YELLOW_BRICKS_UNLOCALIZED_NAME, "stone", 1.5F, 0, "stone");
    	blackBricksBlock = new BlockNormal(BlockInfo.BLACK_BRICKS_UNLOCALIZED_NAME, "stone", 1.5F, 0, "stone");
    	blockPath = new BlockCustomPath(Material.ground, BlockInfo.PATH_UNLOCALIZED_NAME, "gravel", 0.6F, 0, "shovel");
    	blockDarkPath = new BlockCustomPath(Material.ground, BlockInfo.DARK_PATH_UNLOCALIZED_NAME, "gravel", 0.6F, 0, "shovel");
    	blockAsphaultPath = new BlockCustomPath(Material.rock, BlockInfo.ASPHAULT_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
    	blockWhiteLinePath = new BlockCustomPath(Material.rock, BlockInfo.WHITE_LINE_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
    	blockYellowLinePath = new BlockCustomPath(Material.rock, BlockInfo.YELLOW_LINE_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
    	blockAsphaultFullWhitePath = new BlockRotatingPath(Material.rock, BlockInfo.ASPHAULT_FULL_WHITE_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", "asphaultFullWhite", "asphaultBlock");
    	blockAsphaultBrokenWhitePath = new BlockRotatingPath(Material.rock, BlockInfo.ASPHAULT_BROKEN_WHITE_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", "asphaultBrokenWhite", "asphaultBlock");
    	blockAsphaultFullYellowPath = new BlockRotatingPath(Material.rock, BlockInfo.ASPHAULT_FULL_YELLOW_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", "asphaultFullYellow", "asphaultBlock");
    	blockAsphaultBrokenYellowPath = new BlockRotatingPath(Material.rock, BlockInfo.ASPHAULT_BROKEN_YELLOW_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", "asphaultBrokenYellow", "asphaultBlock");
    	blockAsphaultWhiteIntersectionPath = new BlockRotatingPath(Material.rock, BlockInfo.ASPHAULT_WHITE_INTERSECTION_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", "asphaultWhiteCorner", "asphaultBlock");
    	blockDirtPath = new BlockVanillaPath(Material.ground, BlockInfo.DIRT_PATH_UNLOCALIZED_NAME, "dirt", "gravel", 0.6F, 0, "shovel");
    	blockClayPath = new BlockVanillaPath(Material.ground, BlockInfo.CLAY_PATH_UNLOCALIZED_NAME, "clay", "gravel", 0.6F, 0, "shovel");
    	blockGravelPath = new BlockVanillaPath(Material.ground, BlockInfo.GRAVEL_PATH_UNLOCALIZED_NAME, "gravel", "gravel", 0.6F, 0, "shovel");
    	blockSandPath = new BlockVanillaPath(Material.sand, BlockInfo.SAND_PATH_UNLOCALIZED_NAME, "sand", "sand", 0.6F, 0, "shovel");
    	blockRedSandPath = new BlockVanillaPath(Material.sand, BlockInfo.RED_SAND_PATH_UNLOCALIZED_NAME, "red_sand", "sand", 0.6F, 0, "shovel");
    	blockSandstonePath = new BlockVanillaPath(Material.rock, BlockInfo.SANDSTONE_PATH_UNLOCALIZED_NAME, "sandstone_top", "stone", 1.5F, 0, "pickaxe");
    	blockCobblestonePath = new BlockVanillaPath(Material.rock, BlockInfo.COBBLESTONE_PATH_UNLOCALIZED_NAME, "cobblestone", "stone", 1.5F, 0, "pickaxe");
        blockStonePath = new BlockVanillaPath(Material.rock, BlockInfo.STONE_PATH_UNLOCALIZED_NAME, "stone", "stone", 1.5F, 0, "pickaxe");
        blockStoneBrickPath = new BlockVanillaPath(Material.rock, BlockInfo.STONE_BRICK_PATH_UNLOCALIZED_NAME, "stonebrick", "stone", 1.5F, 0, "pickaxe");
        blockBricksPath = new BlockVanillaPath(Material.rock, BlockInfo.BRICKS_PATH_UNLOCALIZED_NAME, "brick", "stone", 1.5F, 0, "pickaxe");
        blockYellowBricksPath = new BlockCustomPath(Material.rock, BlockInfo.YELLOW_BRICKS_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
        blockBlackBricksPath = new BlockCustomPath(Material.rock, BlockInfo.BLACK_BRICKS_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
        blockQuartzPath = new BlockVanillaPath(Material.rock, BlockInfo.QUARTZ_PATH_UNLOCALIZED_NAME, "quartz_block_side", "stone", 1.5F, 0, "pickaxe");
        blockChiselledQuartzPath = new BlockVanillaPath(Material.rock, BlockInfo.CHISELLED_QUARTZ_PATH_UNLOCALIZED_NAME, "quartz_block_chiseled_top", "stone", 1.5F, 0, "pickaxe");
        blockPillarQuartzPath = new BlockVanillaPath(Material.rock, BlockInfo.PILLAR_QUARTZ_PATH_UNLOCALIZED_NAME, "quartz_block_lines", "stone", 1.5F, 0, "pickaxe");
        blockNetherrackPath = new BlockVanillaPath(Material.rock, BlockInfo.NETHERRACK_PATH_UNLOCALIZED_NAME, "netherrack", "stone", 0.4F, 0, "pickaxe");
        blockSoulSandPath = new BlockVanillaSlowPath(Material.ground, BlockInfo.SOUL_SAND_PATH_UNLOCALIZED_NAME, "soul_sand", "sand", 0.6F, 0, "shovel");
        blockGlowstonePath = new BlockVanillaPath(Material.glass, BlockInfo.GLOWSTONE_PATH_UNLOCALIZED_NAME, "glowstone", "glass", 0.3F, 0, "pickaxe").setLightLevel(1.0F);
        blockPodzolPath = new BlockVanillaPath(Material.ground, BlockInfo.PODZOL_PATH_UNLOCALIZED_NAME, "dirt_podzol_top", "grass", 0.6F, 0, "shovel");
        blockOakPlankPath = new BlockVanillaPath(Material.wood, BlockInfo.OAK_PLANK_PATH_UNLOCALIZED_NAME, "planks_oak", "wood", 2.0F, 0, "axe");
        blockSprucePlankPath = new BlockVanillaPath(Material.wood, BlockInfo.SPRUCE_PLANK_PATH_UNLOCALIZED_NAME, "planks_spruce", "wood", 2.0F, 0, "axe");
        blockBirchPlankPath = new BlockVanillaPath(Material.wood, BlockInfo.BIRCH_PLANK_PATH_UNLOCALIZED_NAME, "planks_birch", "wood", 2.0F, 0, "axe");
        blockJunglePlankPath = new BlockVanillaPath(Material.wood, BlockInfo.JUNGLE_PLANK_PATH_UNLOCALIZED_NAME, "planks_jungle", "wood", 2.0F, 0, "axe");
        blockAcaciaPlankPath = new BlockVanillaPath(Material.wood,BlockInfo.ACACIA_PLANK_PATH_UNLOCALIZED_NAME, "planks_acacia", "wood", 2.0F, 0, "axe");
        blockDarkOakPlankPath = new BlockVanillaPath(Material.wood, BlockInfo.DARK_OAK_PLANK_PATH_UNLOCALIZED_NAME, "planks_big_oak", "wood", 2.0F, 0, "axe");
        blockWoolPath = new BlockWoolPath(Material.cloth, BlockInfo.WOOL_PATH_UNLOCALIZED_NAME, "wool", 0.8F);
        blockLaboratoryPath = new BlockCustomPath(Material.rock, BlockInfo.LABORATORY_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
        
        if (Loader.isModLoaded("CarpentersBlocks")) {
        blockCarpentersPath = new BlockCarpentersPath(Material.wood).setBlockName("blockCarpentersPath").setHardness(0.2F).setStepSound(BlockProperties.stepSound).setCreativeTab(CarpentersBlocks.creativeTab);
        
        register(blockCarpentersPath);
        }
        
        register(blockSlowMovingPath);
        register(blockFastMovingPath);
        register(blockFastestMovingPath);
        
        register(blockSlowMovingStairPath);
        register(blockFastMovingStairPath);
        register(blockFastestMovingStairPath);
        
        register(blockSlowDownMovingStairPath);
        register(blockFastDownMovingStairPath);
        register(blockFastestDownMovingStairPath);
        
        register(blockLowRangeItemPropeller);
        register(blockMidRangeItemPropeller);
        register(blockHighRangeItemPropeller);
        
        register(asphaultBlock);
        register(whiteLineBlock);
        register(yellowLineBlock);
        register(yellowBricksBlock);
        register(blackBricksBlock);
        register(blockPath);
        register(blockDarkPath);
        register(blockAsphaultPath);
        register(blockAsphaultFullWhitePath);
        register(blockAsphaultFullYellowPath);
        register(blockAsphaultBrokenWhitePath);
        register(blockAsphaultBrokenYellowPath);
        register(blockAsphaultWhiteIntersectionPath);
        register(blockWhiteLinePath);
        register(blockYellowLinePath);
        register(blockDirtPath);
        register(blockClayPath);
        register(blockGravelPath);
        register(blockSandPath);
        register(blockRedSandPath);
        register(blockSandstonePath);
        register(blockCobblestonePath);
        register(blockStonePath);
        register(blockStoneBrickPath);
        register(blockBricksPath);
        register(blockYellowBricksPath);
        register(blockBlackBricksPath);
        register(blockQuartzPath);
        register(blockChiselledQuartzPath);
        register(blockPillarQuartzPath);
        register(blockNetherrackPath);
        register(blockSoulSandPath);
        register(blockGlowstonePath);
        register(blockPodzolPath);
        register(blockOakPlankPath);
        register(blockSprucePlankPath);
        register(blockBirchPlankPath);
        register(blockJunglePlankPath);
        register(blockAcaciaPlankPath);
        register(blockDarkOakPlankPath);
        register(blockLaboratoryPath);
        GameRegistry.registerBlock(SimplyPathsBlocks.blockWoolPath, ItemBlockWoolPath.class, SimplyPathsBlocks.blockWoolPath.getUnlocalizedName().substring(5));
    }
    
    public static void register(Block b) {
		GameRegistry.registerBlock(b, b.getUnlocalizedName().substring(5));
	}
}