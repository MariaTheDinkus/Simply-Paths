package com.momnop.simplypaths.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.momnop.simplypaths.SimplyPathsCreativeTab;
import com.momnop.simplypaths.info.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Created by Mikael on 08/04/14.
 */
public class ItemConveyorWrench extends Item
{
    public ItemConveyorWrench(String unlocalizedName)
    {
        super();
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(SimplyPathsCreativeTab.INSTANCE);
        setMaxStackSize(1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        itemIcon = par1IconRegister.registerIcon(ModInfo.MODID + ":" + getUnlocalizedName().substring(5));
    }

}