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
	public static Block asphaultBlock, whiteLineBlock, yellowLineBlock;
	public static Block blockAsphaultWhitePath, blockAsphaultYellowPath, blockAsphaultWhiteCornerPath;
	public static Block blockPath, blockDirtPath, blockClayPath, blockGravelPath, blockSandPath, blockSoulSandPath, blockPodzolPath;
    public static Block blockAsphaultPath, blockWhiteLinePath, blockYellowLinePath, blockSandstonePath, blockCobblestonePath, blockStonePath, blockStoneBrickPath, blockQuartzPath, blockChiselledQuartzPath, blockPillarQuartzPath, blockNetherrackPath, blockGlowstonePath;
    public static Block blockOakPlankPath, blockSprucePlankPath, blockBirchPlankPath, blockJunglePlankPath, blockAcaciaPlankPath, blockDarkOakPlankPath;
    public static void load()
    {
    	asphaultBlock = new BlockNormal(BlockInfo.ASPHAULT_UNLOCALIZED_NAME, "stone", 1.5F, 0, "stone");
    	whiteLineBlock = new BlockNormal(BlockInfo.WHITE_LINE_UNLOCALIZED_NAME, "stone", 1.5F, 0, "stone");
    	yellowLineBlock = new BlockNormal(BlockInfo.YELLOW_LINE_UNLOCALIZED_NAME, "stone", 1.5F, 0, "stone");
    	blockPath = new BlockCustomPath(Material.ground, BlockInfo.PATH_UNLOCALIZED_NAME, "gravel", 0.6F, 0, "shovel");
    	blockAsphaultPath = new BlockCustomPath(Material.rock, BlockInfo.ASPHAULT_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
    	blockWhiteLinePath = new BlockCustomPath(Material.rock, BlockInfo.WHITE_LINE_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
    	blockYellowLinePath = new BlockCustomPath(Material.rock, BlockInfo.YELLOW_LINE_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe");
    	blockAsphaultWhitePath = new BlockRotatingPath(Material.rock, BlockInfo.ASPHAULT_WHITE_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", "asphaultWhite", "asphaultBlock");
    	blockAsphaultYellowPath = new BlockRotatingPath(Material.rock, BlockInfo.ASPHAULT_YELLOW_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", "asphaultYellow", "asphaultBlock");
    	blockAsphaultWhiteCornerPath = new BlockRotatingPath(Material.rock, BlockInfo.ASPHAULT_WHITE_CORNER_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", "asphaultWhiteCorner", "asphaultBlock");
    	blockDirtPath = new BlockVanillaPath(Material.ground, BlockInfo.DIRT_PATH_UNLOCALIZED_NAME, "dirt", "gravel", 0.6F, 0, "shovel");
    	blockClayPath = new BlockVanillaPath(Material.ground, BlockInfo.CLAY_PATH_UNLOCALIZED_NAME, "clay", "gravel", 0.6F, 0, "shovel");
    	blockGravelPath = new BlockVanillaPath(Material.ground, BlockInfo.GRAVEL_PATH_UNLOCALIZED_NAME, "gravel", "gravel", 0.6F, 0, "shovel");
    	blockSandPath = new BlockVanillaPath(Material.sand, BlockInfo.SAND_PATH_UNLOCALIZED_NAME, "sand", "sand", 0.6F, 0, "shovel");
    	blockSandstonePath = new BlockVanillaPath(Material.rock, BlockInfo.SANDSTONE_PATH_UNLOCALIZED_NAME, "sandstone_top", "stone", 1.5F, 0, "pickaxe");
    	blockCobblestonePath = new BlockVanillaPath(Material.rock, BlockInfo.COBBLESTONE_PATH_UNLOCALIZED_NAME, "cobblestone", "stone", 1.5F, 0, "pickaxe");
        blockStonePath = new BlockVanillaPath(Material.rock, BlockInfo.STONE_PATH_UNLOCALIZED_NAME, "stone", "stone", 1.5F, 0, "pickaxe");
        blockStoneBrickPath = new BlockVanillaPath(Material.rock, BlockInfo.STONE_BRICK_PATH_UNLOCALIZED_NAME, "stonebrick", "stone", 1.5F, 0, "pickaxe");
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
        
        GameRegistry.registerBlock(asphaultBlock, "DecorMod_asphaultBlock");
        GameRegistry.registerBlock(whiteLineBlock, "DecorMod_whiteLineBlock");
        GameRegistry.registerBlock(yellowLineBlock, "DecorMod_yellowLineBlock");
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
    }
}