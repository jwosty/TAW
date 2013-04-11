package jw.taw.common.item;

import java.lang.System;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import jw.taw.common.CommonProxy;
import jw.taw.common.block.Blocks;

public class Items {
	private Items() {}
	
	// Obsidian tools, with a harvest speed of 7.75 -- almost as fast as diamond (which is 8)
	public static int ObsidianHarvestLevel = 3;
	public static EnumToolMaterial ObsidianTools = EnumHelper.addToolMaterial("OBSIDIAN", ObsidianHarvestLevel, 1561, 8.0F, 2, 10);
	// Glass tools; basically halfway between iron and diamond but with a higher enchantability than both
	public static int GlassHarvestLevel = 3;
	public static EnumToolMaterial GlassTools = EnumHelper.addToolMaterial("GLASS", GlassHarvestLevel, 250, 7.5F, 2, 18);
	
	public static Item shovelObsidian = new ItemSpade(1551, ObsidianTools).setIconIndex(0).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("Obsidian Shovel");
	public static Item pickaxeObsidian = new ItemPickaxe(1552, ObsidianTools).setIconIndex(1).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("Obsidian Pickaxe");
	public static Item axeObsidian = new ItemAxe(1553, ObsidianTools).setIconIndex(2).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("Obsidian Axe");
	public static Item swordObsidian = new ItemSword(1554, ObsidianTools).setIconIndex(3).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("Obsidian Sword");
	public static Item hoeObsidian = new ItemHoe(1555, ObsidianTools).setIconIndex(4).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("Obsidian Hoe");
	
	public static Item hardyGlassMaterials = new Item(1556).setIconIndex(16).setTextureFile(CommonProxy.TEXTURES_PNG).setCreativeTab(CreativeTabs.tabMaterials).setItemName("hardyGlassMaterials");
	public static Item shovelGlass = new ItemSpade(1557, GlassTools).setIconIndex(5).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("Glass Shovel");
	public static Item pickaxeGlass = new ItemPickaxe(1558, GlassTools).setIconIndex(6).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("Glass Pickaxe");
	public static Item axeGlass = new ItemAxe(1559, GlassTools).setIconIndex(7).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("Glass Axe");
	public static Item swordGlass = new ItemSword(1560, GlassTools).setIconIndex(8).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("Glass Sword");
	public static Item hoeGlass = new ItemHoe(1561, GlassTools).setIconIndex(9).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("Glass Hoe");
	
	// Loads all the new items and tools
	public static void registerAllItems() {
		registerItems();
		registerTools();
	}
	
	public static void registerItems() {
		addItems();
		addItemRecipes();
	}
	
	public static void addItems() {
		LanguageRegistry.addName(hardyGlassMaterials, "Hardy Glass Materials");
	
	}
	
	public static void addItemRecipes() {
		GameRegistry.addRecipe(new ItemStack(hardyGlassMaterials, 4), "XXX", "XYX", "XXX", 'X', Block.glass, 'Y', Item.ingotIron);
	}
	
	// Register all the new tools into the game
	public static void registerTools() {
		registerToolset(Block.obsidian, "Obsidian", ObsidianHarvestLevel,
				shovelObsidian, pickaxeObsidian, axeObsidian, swordObsidian, hoeObsidian);
		registerToolset(Blocks.hardyGlass, "Glass", GlassHarvestLevel,
				shovelGlass, pickaxeGlass, axeGlass, swordGlass, hoeGlass);
	}
	
	// Register a complete tool set and its standard crafting recipes
	public static void registerToolset(Object craftingMaterial, String matName, int harvestLevel,
			Item shovel, Item pickaxe, Item axe, Item sword, Item hoe) {
		addToolsetNames(matName, harvestLevel, shovel, pickaxe, axe, sword, hoe);
		addToolsetRecipes(craftingMaterial, shovel, pickaxe, axe, sword, hoe);
	}
	
	public static void addToolsetNames(String matName, int harvestLevel, Item shovel, Item pickaxe, Item axe, Item sword, Item hoe) {
		// First, tell Forge each tool's tool type (only have to do this for pickaxe, axe, and shovel, as neither the hoe and sword are block-breaking tools)
		MinecraftForge.setToolClass(shovel, "shovel", harvestLevel);
		MinecraftForge.setToolClass(pickaxe, "pickaxe", harvestLevel);
		MinecraftForge.setToolClass(axe, "axe", harvestLevel);
		// Register the tool names
		// Not sure about the difference between this and Item.setItemName(string name)
		ModLoader.addName(shovel, matName + " Shovel");
		ModLoader.addName(pickaxe, matName + " Pickaxe");
		ModLoader.addName(axe, matName + " Axe");
		ModLoader.addName(sword, matName + " Sword");
		ModLoader.addName(hoe, matName + " Hoe");
	}
	
	
	// Create the standard recipes for the complete set of tools (shovel, pickaxe, axe, sword, and hoe) using the given material and resulting items
	public static void addToolsetRecipes(Object craftingMaterial, Item shovel, Item pickaxe, Item axe, Item sword, Item hoe) {
		Item stk = Item.stick;
		GameRegistry.addRecipe(new ItemStack(shovel),
				"#", "X", "X",
				'#', craftingMaterial,
				'X', stk);
		GameRegistry.addRecipe(new ItemStack(pickaxe),
				"###", " X ", " X ",
				'#', craftingMaterial,
				'X', stk);
		GameRegistry.addRecipe(new ItemStack(axe),
				"##", "#X", " X",
				'#', craftingMaterial,
				'X', stk);
		GameRegistry.addRecipe(new ItemStack(sword),
				"#", "#", "X",
				'#', craftingMaterial,
				'X', stk);
		GameRegistry.addRecipe(new ItemStack(hoe),
				"##", " X", " X",
				'#', craftingMaterial,
				'X', stk);
	}
}
