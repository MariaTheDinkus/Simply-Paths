package com.momnop.simplypaths.config;

import com.momnop.simplypaths.info.ConfigInfo;
import com.momnop.simplypaths.info.ModInfo;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static Configuration configuration;
    public static boolean pathChisel = false;
    
    public static void init(File file)
    {
        if (configuration == null)
        {
            configuration = new Configuration(file);
            loadConfiguration();
        }
    }
    
    public static void loadConfiguration()
    {
        pathChisel = configuration.getBoolean(ConfigInfo.PATH_CHISEL_NAME, Configuration.CATEGORY_GENERAL, pathChisel, ConfigInfo.PATH_CHISEL_DESC);
        
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}