package com.momnop.simplypaths.events;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import com.momnop.breakcancel.config.ConfigHandler;
import com.momnop.breakcancel.proxies.CommonProxy;
import com.momnop.simplypaths.blocks.SimplyPathsBlocks;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SimplyPathsEventHandler {

	EntityPlayer player;

	@SubscribeEvent
	public void onPlayerInteractShovel(PlayerInteractEvent event) {
		ItemStack getHeldItem = event.entityPlayer.getCurrentEquippedItem();
		
		if (event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK) {
			if (getHeldItem != null
					&& getHeldItem.getItem() instanceof ItemSpade) {
				if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.grass) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.dirt) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockDirtPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.dirt
						&& event.world.getBlockMetadata(event.x, event.y,
								event.z) == 2) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockPodzolPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.gravel) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockGravelPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.clay) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockClayPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.soul_sand) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockSoulSandPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.sand) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockSandPath);
				} else {

				}

			} else {

			}
		}
	}

	@SubscribeEvent
	public void onPlayerInteractPickaxe(PlayerInteractEvent event) {
		ItemStack getHeldItem = event.entityPlayer.getCurrentEquippedItem();

		if (event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK) {
			if (getHeldItem != null
					&& getHeldItem.getItem() instanceof ItemPickaxe) {
				if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.stone) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockStonePath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.stonebrick) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockStoneBrickPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == SimplyPathsBlocks.asphaultBlock) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockAsphaultPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == SimplyPathsBlocks.whiteLineBlock) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockWhiteLinePath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == SimplyPathsBlocks.yellowLineBlock) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockYellowLinePath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.cobblestone) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockCobblestonePath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.quartz_block
						&& event.world.getBlockMetadata(event.x, event.y,
								event.z) == 0) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockQuartzPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.quartz_block
						&& event.world.getBlockMetadata(event.x, event.y,
								event.z) == 1) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockChiselledQuartzPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.quartz_block
						&& event.world.getBlockMetadata(event.x, event.y,
								event.z) == 2) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockPillarQuartzPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.sandstone) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockSandstonePath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.glowstone) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockGlowstonePath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.netherrack) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockNetherrackPath);
				} else {

				}
			} else {

			}
		}
	}

	@SubscribeEvent
	public void onPlayerInteractAxe(PlayerInteractEvent event) {
		ItemStack getHeldItem = event.entityPlayer.getCurrentEquippedItem();

		if (event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK) {
			if (getHeldItem != null
					&& getHeldItem.getItem() instanceof ItemAxe) {
				if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.planks) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockOakPlankPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlockMetadata(event.x, event.y,
								event.z) == 1
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.planks) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockSprucePlankPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlockMetadata(event.x, event.y,
								event.z) == 2
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.planks) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockBirchPlankPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlockMetadata(event.x, event.y,
								event.z) == 3
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.planks) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockJunglePlankPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlockMetadata(event.x, event.y,
								event.z) == 4
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.planks) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockAcaciaPlankPath);
				} else if (event.world.blockExists(event.x, event.y, event.z)
						&& event.world.getBlockMetadata(event.x, event.y,
								event.z) == 5
						&& event.world.getBlock(event.x, event.y, event.z) == Blocks.planks) {
					getHeldItem.damageItem(1, event.entityPlayer);
					event.world.setBlock(event.x, event.y, event.z,
							SimplyPathsBlocks.blockDarkOakPlankPath);
				} else {

				}

			} else {

			}
		}
	}
}