package com.momnop.simplypaths.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockWoolPath extends ItemBlock
{
    public ItemBlockWoolPath(Block block)
    {
        super(block);
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack)
    {
        String name;

        switch (itemstack.getItemDamage())
        {
            case 0:
            {
                name = "white";
                break;
            }

            case 1:
            {
                name = "orange";
                break;
            }

            case 2:
                name = "magenta";
                break;

            case 3:
                name = "light_blue";
                break;

            case 4:
                name = "yellow";
                break;

            case 5:
                name = "lime";
                break;

            case 6:
                name = "pink";
                break;
                
            case 7:
                name = "gray";
                break;
                
            case 8:
                name = "light_gray";
                break;
                
            case 9:
                name = "cyan";
                break;
                
            case 10:
                name = "purple";
                break;
                
            case 11:
                name = "blue";
                break;
                
            case 12:
                name = "brown";
                break;
                
            case 13:
                name = "green";
                break;
                
            case 14:
                name = "red";
                break;
                
            case 15:
                name = "black";
                break;

            default:
                name = "congratsyoubrokethemod";
        }

        return getUnlocalizedName() + "_" + name;
    }

    public int getMetadata(int meta)
    {
        return meta;
    }
}