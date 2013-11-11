package net.mcft.copy.fancychants;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class Config {
	
	private Configuration config;
	private List<EnchantmentSetting> settings = new ArrayList<EnchantmentSetting>();
	
	public EnchantmentSetting multimine;
	
	public Config(File file) {
		config = new Configuration(file);
		multimine = new EnchantmentSetting("multimine", 160, 1);
	}
	
	public void load() {
		config.load();
		for (EnchantmentSetting setting : settings)
			setting.load();
	}
	
	public void save() {
		for (EnchantmentSetting setting : settings)
			setting.save();
		config.save();
	}
	
	public class EnchantmentSetting {
		public final String name;
		public int id;
		public int weight;
		
		public EnchantmentSetting(String name, int defaultId, int defaultWeight) {
			this.name = name;
			id = defaultId;
			weight = defaultWeight;
			settings.add(this);
		}
		
		public void load() {
			id = config.get(name, "id", id).getInt();
			weight = config.get(name, "weight", weight).getInt();
		}
		public void save() {
			config.get(name, "id", id).set(id);
			config.get(name, "weight", weight).set(weight);
		}
	}
	
}
