package net.mcft.copy.fancychants;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.modId,
     name = Constants.modName,
     version = "@VERSION@")
public class FancyChants {
	
	@Instance(Constants.modId)
	public static FancyChants instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
}
