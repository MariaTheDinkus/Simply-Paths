package com.momnop.simplypaths.blocks;

import com.carpentersblocks.CarpentersBlocks;
import com.carpentersblocks.block.BlockCarpentersBlock;
import com.carpentersblocks.util.BlockProperties;
import com.momnop.simplypaths.info.BlockInfo;

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
	public static Block asphaultBlock, whiteLineBlock, yellowLineBlock, yellowBricksBlock;
	public static Block blockAsphaultWhitePath, blockAsphaultYellowPath, blockAsphaultWhiteCornerPath;
	public static Block blockPath, blockDirtPath, blockClayPath, blockGravelPath, blockSandPath, blockRedSandPath, blockSoulSandPath, blockPodzolPath;
    public static Block blockAsphaultPath, blockWhiteLinePath, blockYellowLinePath, blockSandstonePath, blockCobblestonePath, blockStonePath, blockStoneBrickPath, blockBricksPath, blockYellowBricksPath, blockQuartzPath, blockChiselledQuartzPath, blockPillarQuartzPath, blockNetherrackPath, blockGlowstonePath;
    public static Block blockOakPlankPath, blockSprucePlankPath, blockBirchPlankPath, blockJunglePlankPath, blockAcaciaPlankPath, blockDarkOakPlankPath;
    public static Block blockLaboratoryPath, blockCarpentersPath;
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
    	blockRedSandPath = new BlockVanillaPath(Material.sand, BlockInfo.RED_SAND_PATH_UNLOCALIZED_NAME, "red_sand", "sand", 0.6F, 0, "shovel", SimplyPathsBlocks.blockRedSandPath);
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
        blockLaboratoryPath = new BlockCustomPath(Material.rock, BlockInfo.LABORATORY_PATH_UNLOCALIZED_NAME, "stone", 1.5F, 0, "pickaxe", SimplyPathsBlocks.blockLaboratoryPath);
        
        if (Loader.isModLoaded("CarpentersBlocks")) {
        blockCarpentersPath = new BlockCarpentersPath(Material.wood).setBlockName("blockCarpentersPath").setHardness(0.2F).setStepSound(BlockProperties.stepSound).setCreativeTab(CarpentersBlocks.creativeTab);
        
        register(blockCarpentersPath);
        }
        
        register(asphaultBlock);
        register(whiteLineBlock);
        register(yellowLineBlock);
        register(yellowBricksBlock);
        register(blockPath);
        register(blockAsphaultPath);
        register(blockAsphaultWhitePath);
        register(blockAsphaultYellowPath);
        register(blockAsphaultWhiteCornerPath);
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