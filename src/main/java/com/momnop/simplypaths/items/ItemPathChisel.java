package com.momnop.simplypaths.items;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import com.momnop.simplypaths.SimplyPathsCreativeTab;
import com.momnop.simplypaths.TooltipHelper;
import com.momnop.simplypaths.config.ConfigHandler;
import com.momnop.simplypaths.info.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPathChisel extends Item {
	private int maxDamage = 500;

	public ItemPathChisel(String unlocalizedName) {
		super();
		setUnlocalizedName(unlocalizedName);
		setCreativeTab(SimplyPathsCreativeTab.INSTANCE);
		setMaxStackSize(1);
		setMaxDamage(maxDamage);
	}

	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack,
			ItemStack par2ItemStack) {
		return false;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player,
			List info, boolean useInfo) {
		if (ConfigHandler.pathChisel == true)
			TooltipHelper.addExtraInformationTooltip(
					StatCollector.translateToLocal("item.tooltip.ableToPath")
							+ " " + EnumChatFormatting.GREEN
							+ ConfigHandler.pathChisel, info);

		if (ConfigHandler.pathChisel == false)
			TooltipHelper.addExtraInformationTooltip(
					StatCollector.translateToLocal("item.tooltip.ableToPath")
							+ " " + EnumChatFormatting.RED
							+ ConfigHandler.pathChisel, info);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(ModInfo.MODID + ":"
				+ getUnlocalizedName().substring(5));
	}
	
	@Override
    public boolean hasContainerItem()
    {
	return true;
    }

    @Override
    public boolean getShareTag()
    {
	return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
	ItemStack i = new ItemStack(itemStack.getItem(), itemStack.stackSize, itemStack.getItemDamage());
	i.setItemDamage(itemStack.getItemDamage() + 1);
	i.stackSize = 1;

	if(i.getItemDamage() == maxDamage)
	    return null;
	else
	    return i;

    }

}