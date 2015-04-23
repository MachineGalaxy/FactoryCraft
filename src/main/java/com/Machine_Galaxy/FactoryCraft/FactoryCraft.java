package com.Machine_Galaxy.FactoryCraft;

import com.Machine_Galaxy.FactoryCraft.proxy.IProxy;
import com.Machine_Galaxy.FactoryCraft.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSON)
public class FactoryCraft {

    @Mod.Instance("FactoryCraft")
    public static FactoryCraft instance;


    @SidedProxy(clientSide = "com.Machine_Galaxy.FactoryCraft.proxy.ClientProxy", serverSide = "com.Machine_Galaxy.FactoryCraft.proxy.ServerProxy")
    public static IProxy proxy;



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
