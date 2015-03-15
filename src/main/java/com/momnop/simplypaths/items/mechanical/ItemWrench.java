package com.momnop.simplypaths.items.mechanical;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.momnop.simplypaths.info.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWrench extends Item
{
    public ItemWrench(String unlocalizedName)
    {
        super();
        setUnlocalizedName(unlocalizedName);
        setMaxStackSize(1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        itemIcon = par1IconRegister.registerIcon(ModInfo.MODID + ":" + getUnlocalizedName().substring(5));
    }

}