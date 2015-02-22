package com.momnop.simplypaths.blocks;

import com.momnop.simplypaths.info.BlockInfo;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SimplyPathsBlocks
{
	public static Block asphaultBlock, whiteLineBlock, yellowLineBlock, yellowBricksBlock;
	public static Block blockAsphaultWhitePath, blockAsphaultYellowPath, blockAsphaultWhiteCornerPath;
	public static Block blockPath, blockDirtPath, blockClayPath, blockGravelPath, blockSandPath, blockSoulSandPath, blockPodzolPath;
    public static Block blockAsphaultPath, blockWhiteLinePath, blockYellowLinePath, blockSandstonePath, blockCobblestonePath, blockStonePath, blockStoneBrickPath, blockBricksPath, blockYellowBricksPath, blockQuartzPath, blockChiselledQuartzPath, blockPillarQuartzPath, blockNetherrackPath, blockGlowstonePath;
    public static Block blockOakPlankPath, blockSprucePlankPath, blockBirchPlankPath, blockJunglePlankPath, blockAcaciaPlankPath, blockDarkOakPlankPath;
    public static Block blockWoolPath;
    public static void load()
    {
    	asphaultBlock = new BlockNormal(BlockInfo.ASPHAULT_UNLOCALIZED_NAME, "stone", 1.5F, 0, "stone");
    	whiteLineBlock = new BlockNormal(BlockInfo.WHITE_LINE_UNLOCALIZED_NAME, "stone", 1.5F, 0, "stone");
    	yellowLineBlock = new BlockNormal(BlockInfo.YELLOW_LINE_UNLOCALIZED_NAME, "stone", 1.5F, 0, "stone");
    	yellowBricksBlock = new BlockNormal(BlockInfo.YELLOW_BRICKS_UNLOCALIZED_NAME, "stone", 1.5F, 0, "stone");
    	blockPath = new BlockCustomPath(Material.ground, BlockInfo.PATH_UNLOCALIZED_NAME, "gravel", 0.6F, 0, "shovel", SimplyPathsBlocks.blockPath);
    	blockAsphaultPath = new BlockCustomPath(Material.rock, BlockInfo.ASPHAULT_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", SimplyPathsBlocks.blockAsphaultPath);
    	blockWhiteLinePath = new BlockCustomPath(Material.rock, BlockInfo.WHITE_LINE_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", SimplyPathsBlocks.blockWhiteLinePath);
    	blockYellowLinePath = new BlockCustomPath(Material.rock, BlockInfo.YELLOW_LINE_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", SimplyPathsBlocks.blockYellowLinePath);
    	blockAsphaultWhitePath = new BlockRotatingPath(Material.rock, BlockInfo.ASPHAULT_WHITE_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", "asphaultWhite", "asphaultBlock");
    	blockAsphaultYellowPath = new BlockRotatingPath(Material.rock, BlockInfo.ASPHAULT_YELLOW_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", "asphaultYellow", "asphaultBlock");
    	blockAsphaultWhiteCornerPath = new BlockRotatingPath(Material.rock, BlockInfo.ASPHAULT_WHITE_CORNER_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", "asphaultWhiteCorner", "asphaultBlock");
    	blockDirtPath = new BlockVanillaPath(Material.ground, BlockInfo.DIRT_PATH_UNLOCALIZED_NAME, "dirt", "gravel", 0.6F, 0, "shovel", SimplyPathsBlocks.blockDirtPath);
    	blockClayPath = new BlockVanillaPath(Material.ground, BlockInfo.CLAY_PATH_UNLOCALIZED_NAME, "clay", "gravel", 0.6F, 0, "shovel", SimplyPathsBlocks.blockClayPath);
    	blockGravelPath = new BlockVanillaPath(Material.ground, BlockInfo.GRAVEL_PATH_UNLOCALIZED_NAME, "gravel", "gravel", 0.6F, 0, "shovel", SimplyPathsBlocks.blockGravelPath);
    	blockSandPath = new BlockVanillaPath(Material.sand, BlockInfo.SAND_PATH_UNLOCALIZED_NAME, "sand", "sand", 0.6F, 0, "shovel", SimplyPathsBlocks.blockSandPath);
    	blockSandstonePath = new BlockVanillaPath(Material.rock, BlockInfo.SANDSTONE_PATH_UNLOCALIZED_NAME, "sandstone_top", "stone", 1.5F, 0, "pickaxe", SimplyPathsBlocks.blockSandstonePath);
    	blockCobblestonePath = new BlockVanillaPath(Material.rock, BlockInfo.COBBLESTONE_PATH_UNLOCALIZED_NAME, "cobblestone", "stone", 1.5F, 0, "pickaxe", SimplyPathsBlocks.blockCobblestonePath);
        blockStonePath = new BlockVanillaPath(Material.rock, BlockInfo.STONE_PATH_UNLOCALIZED_NAME, "stone", "stone", 1.5F, 0, "pickaxe", SimplyPathsBlocks.blockCobblestonePath);
        blockStoneBrickPath = new BlockVanillaPath(Material.rock, BlockInfo.STONE_BRICK_PATH_UNLOCALIZED_NAME, "stonebrick", "stone", 1.5F, 0, "pickaxe", SimplyPathsBlocks.blockStoneBrickPath);
        blockBricksPath = new BlockVanillaPath(Material.rock, BlockInfo.BRICKS_PATH_UNLOCALIZED_NAME, "brick", "stone", 1.5F, 0, "pickaxe", SimplyPathsBlocks.blockBricksPath);
        blockYellowBricksPath = new BlockCustomPath(Material.rock, BlockInfo.YELLOW_BRICKS_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", SimplyPathsBlocks.blockYellowBricksPath);
        blockQuartzPath = new BlockVanillaPath(Material.rock, BlockInfo.QUARTZ_PATH_UNLOCALIZED_NAME, "quartz_block_side", "stone", 1.5F, 0, "pickaxe", SimplyPathsBlocks.blockQuartzPath);
        blockChiselledQuartzPath = new BlockVanillaPath(Material.rock, BlockInfo.CHISELLED_QUARTZ_PATH_UNLOCALIZED_NAME, "quartz_block_chiseled_top", "stone", 1.5F, 0, "pickaxe", SimplyPathsBlocks.blockChiselledQuartzPath);
        blockPillarQuartzPath = new BlockVanillaPath(Material.rock, BlockInfo.PILLAR_QUARTZ_PATH_UNLOCALIZED_NAME, "quartz_block_lines", "stone", 1.5F, 0, "pickaxe", SimplyPathsBlocks.blockPillarQuartzPath);
        blockNetherrackPath = new BlockVanillaPath(Material.rock, BlockInfo.NETHERRACK_PATH_UNLOCALIZED_NAME, "netherrack", "stone", 0.4F, 0, "pickaxe", SimplyPathsBlocks.blockNetherrackPath);
        blockSoulSandPath = new BlockVanillaSlowPath(Material.ground, BlockInfo.SOUL_SAND_PATH_UNLOCALIZED_NAME, "soul_sand", "sand", 0.6F, 0, "shovel");
        blockGlowstonePath = new BlockVanillaPath(Material.glass, BlockInfo.GLOWSTONE_PATH_UNLOCALIZED_NAME, "glowstone", "glass", 0.3F, 0, "pickaxe", SimplyPathsBlocks.blockGlowstonePath).setLightLevel(1.0F);
        blockPodzolPath = new BlockVanillaPath(Material.ground, BlockInfo.PODZOL_PATH_UNLOCALIZED_NAME, "dirt_podzol_top", "grass", 0.6F, 0, "shovel", SimplyPathsBlocks.blockDirtPath);
        blockOakPlankPath = new BlockVanillaPath(Material.wood, BlockInfo.OAK_PLANK_PATH_UNLOCALIZED_NAME, "planks_oak", "wood", 2.0F, 0, "axe", SimplyPathsBlocks.blockOakPlankPath);
        blockSprucePlankPath = new BlockVanillaPath(Material.wood, BlockInfo.SPRUCE_PLANK_PATH_UNLOCALIZED_NAME, "planks_spruce", "wood", 2.0F, 0, "axe", SimplyPathsBlocks.blockSprucePlankPath);
        blockBirchPlankPath = new BlockVanillaPath(Material.wood, BlockInfo.BIRCH_PLANK_PATH_UNLOCALIZED_NAME, "planks_birch", "wood", 2.0F, 0, "axe", SimplyPathsBlocks.blockBirchPlankPath);
        blockJunglePlankPath = new BlockVanillaPath(Material.wood, BlockInfo.JUNGLE_PLANK_PATH_UNLOCALIZED_NAME, "planks_jungle", "wood", 2.0F, 0, "axe", SimplyPathsBlocks.blockJunglePlankPath);
        blockAcaciaPlankPath = new BlockVanillaPath(Material.wood,BlockInfo.ACACIA_PLANK_PATH_UNLOCALIZED_NAME, "planks_acacia", "wood", 2.0F, 0, "axe", SimplyPathsBlocks.blockAcaciaPlankPath);
        blockDarkOakPlankPath = new BlockVanillaPath(Material.wood, BlockInfo.DARK_OAK_PLANK_PATH_UNLOCALIZED_NAME, "planks_big_oak", "wood", 2.0F, 0, "axe", SimplyPathsBlocks.blockDarkOakPlankPath);
        blockWoolPath = new BlockWoolPath(Material.cloth, BlockInfo.WOOL_PATH_UNLOCALIZED_NAME, "wool", 0.8F);
        
        GameRegistry.registerBlock(asphaultBlock, "DecorMod_asphaultBlock");
        GameRegistry.registerBlock(whiteLineBlock, "DecorMod_whiteLineBlock");
        GameRegistry.registerBlock(yellowLineBlock, "DecorMod_yellowLineBlock");
        GameRegistry.registerBlock(yellowBricksBlock, "DecorMod_yellowBricksBlock");
        GameRegistry.registerBlock(blockPath, "DecorMod_blockPath");
        GameRegistry.registerBlock(blockAsphaultPath, "DecorMod_blockAsphaultPath");
        GameRegistry.registerBlock(blockAsphaultWhitePath, "DecorMod_blockAsphaultWhitePath");
        GameRegistry.registerBlock(blockAsphaultYellowPath, "DecorMod_blockAsphaultYellowPath");
        GameRegistry.registerBlock(blockAsphaultWhiteCornerPath, "DecorMod_blockAsphaultWhiteCornerPath");
        GameRegistry.registerBlock(blockWhiteLinePath, "DecorMod_blockWhiteLinePath");
        GameRegistry.registerBlock(blockYellowLinePath, "DecorMod_blockYellowLinePath");
        GameRegistry.registerBlock(blockDirtPath, "DecorMod_blockDirtPath");
        GameRegistry.registerBlock(blockClayPath, "DecorMod_blockClayPath");
        GameRegistry.registerBlock(blockGravelPath, "DecorMod_blockGravelPath");
        GameRegistry.registerBlock(blockSandPath, "DecorMod_blockSandPath");
        GameRegistry.registerBlock(blockSandstonePath, "DecorMod_blockSandstonePath");
        GameRegistry.registerBlock(blockCobblestonePath, "DecorMod_blockCobblestonePath");
        GameRegistry.registerBlock(blockStonePath, "DecorMod_blockStonePath");
        GameRegistry.registerBlock(blockStoneBrickPath, "DecorMod_blockStoneBrickPath");
        GameRegistry.registerBlock(blockBricksPath, "DecorMod_blockBricksPath");
        GameRegistry.registerBlock(blockYellowBricksPath, "DecorMod_blockYellowBricksPath");
        GameRegistry.registerBlock(blockQuartzPath, "DecorMod_blockQuartzPath");
        GameRegistry.registerBlock(blockChiselledQuartzPath, "DecorMod_blockChiselledQuartzPath");
        GameRegistry.registerBlock(blockPillarQuartzPath, "DecorMod_blockPillarQuartzPath");
        GameRegistry.registerBlock(blockNetherrackPath, "DecorMod_blockNetherrackPath");
        GameRegistry.registerBlock(blockSoulSandPath, "DecorMod_blockSoulSandPath");
        GameRegistry.registerBlock(blockGlowstonePath, "DecorMod_blockGlowstonePath");
        GameRegistry.registerBlock(blockPodzolPath, "DecorMod_blockPodzolPath");
        GameRegistry.registerBlock(blockOakPlankPath, "DecorMod_blockOakPlankPath");
        GameRegistry.registerBlock(blockSprucePlankPath, "DecorMod_blockSprucePlankPath");
        GameRegistry.registerBlock(blockBirchPlankPath, "DecorMod_blockBirchPlankPath");
        GameRegistry.registerBlock(blockJunglePlankPath, "DecorMod_blockJunglePlankPath");
        GameRegistry.registerBlock(blockAcaciaPlankPath, "DecorMod_blockAcaicaPlankPath");
        GameRegistry.registerBlock(blockDarkOakPlankPath, "DecorMod_blockDarkOakPlankPath");
        GameRegistry.registerBlock(SimplyPathsBlocks.blockWoolPath, ItemBlockWoolPath.class, "DecorMod_" + (SimplyPathsBlocks.blockWoolPath.getUnlocalizedName().substring(5)));
    }
}