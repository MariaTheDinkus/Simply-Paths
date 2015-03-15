package com.momnop.simplypaths;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import com.momnop.simplypaths.config.ConfigHandler;
import com.momnop.simplypaths.blocks.SimplyPathsBlocks;
import com.momnop.simplypaths.events.SimplyPathsEventHandler;
import com.momnop.simplypaths.info.ModInfo;
import com.momnop.simplypaths.items.SimplyPathsItems;
import com.momnop.simplypaths.proxies.CommonProxy;
import com.momnop.simplypaths.recipes.RecipeHandler;
import com.momnop.simplypaths.blocks.tiles.TileEntityHighRangeItemPropeller;
import com.momnop.simplypaths.blocks.tiles.TileEntityLowRangeItemPropeller;
import com.momnop.simplypaths.blocks.tiles.TileEntityMidRangeItemPropeller;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(name = ModInfo.NAME, modid = ModInfo.MODID, version = ModInfo.VERSION, dependencies = "after:CarpentersBlocks")
public class SimplyPaths
{
    @SidedProxy(clientSide = "com.momnop.simplypaths.proxies.ClientProxy", serverSide = "com.momnop.simplypaths.proxies.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ConfigHandler.init(event.getSuggestedConfigurationFile());
        SimplyPathsBlocks.load();
        SimplyPathsItems.load();
        proxy.initRenders();
        RecipeHandler.doRecipes();
        GameRegistry.registerTileEntity(TileEntityLowRangeItemPropeller.class, "tileEntityLowRangeItemPropeller");
        GameRegistry.registerTileEntity(TileEntityMidRangeItemPropeller.class, "tileEntityMidRangeItemPropeller");
        GameRegistry.registerTileEntity(TileEntityHighRangeItemPropeller.class, "tileEntityHighRangeItemPropeller");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	FMLCommonHandler.instance().bus().register(new SimplyPathsEventHandler());
        MinecraftForge.EVENT_BUS.register(new SimplyPathsEventHandler());
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
    
    /**
     * @param event
     *        The event that triggered the method
     */
    @EventHandler
    public static void serverLoad(FMLServerStartingEvent event)
    {
    	
    }
}
