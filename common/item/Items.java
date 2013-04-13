package jw.taw.common.item;

import jw.taw.common.CommonProxy;
import jw.taw.common.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	private Items() {}
	
	// Obsidian tools, with a harvest speed of 7.75 -- almost as fast as diamond (which is 8)
	public static int ObsidianHarvestLevel = 3;
	public static EnumToolMaterial ObsidianTools = EnumHelper.addToolMaterial("OBSIDIAN", ObsidianHarvestLevel, 1561, 8.0F, 2, 10);
	// Glass tools; basically halfway between iron and diamond but with a higher enchantability than both, and with uses between iron and diamond
	public static int GlassHarvestLevel = 2;
	public static EnumToolMaterial GlassTools = EnumHelper.addToolMaterial("GLASS", GlassHarvestLevel, 512, 7.5F, 2, 18);
	// Ender tools
	public static int EnderHarvestLevel = 3;
	public static EnumToolMaterial EnderTools = EnumHelper.addToolMaterial("ENDER", EnderHarvestLevel, 512, 8.0F, 3, 22);
	// Trinium tools
	public static int TriniumHarvestLevel = 3;
	public static EnumToolMaterial TriniumTools = EnumHelper.addToolMaterial("TRINIUM", TriniumHarvestLevel, 1024, 8.0F, 3, 10);
	
	public static Item shovelObsidian = new ItemSpade(1551, ObsidianTools).setIconIndex(0).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("obsidianShovel");
	public static Item pickaxeObsidian = new ItemPickaxe(1552, ObsidianTools).setIconIndex(1).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("obsidianPickaxe");
	public static Item axeObsidian = new ItemAxe(1553, ObsidianTools).setIconIndex(2).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("obsidianAxe");
	public static Item swordObsidian = new ItemSword(1554, ObsidianTools).setIconIndex(3).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("obsidianSword");
	public static Item hoeObsidian = new ItemHoe(1555, ObsidianTools).setIconIndex(4).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("obsidianHoe");
	
	public static Item industrialGlassMaterials = new Item(1556).setIconCoord(0, 2).setTextureFile(CommonProxy.TEXTURES_PNG).setCreativeTab(CreativeTabs.tabMaterials).setItemName("industrialGlassMaterials");
	public static Item shovelGlass = new ItemSpade(1557, GlassTools).setIconIndex(5).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("glassShovel");
	public static Item pickaxeGlass = new ItemPickaxe(1558, GlassTools).setIconIndex(6).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("glassPickaxe");
	public static Item axeGlass = new ItemAxe(1559, GlassTools).setIconIndex(7).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("glassAxe");
	public static Item swordGlass = new ItemSword(1560, GlassTools).setIconIndex(8).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("glassSword");
	public static Item hoeGlass = new ItemHoe(1561, GlassTools).setIconIndex(9).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("glassHoe");
	
	public static Item shovelEnder = new ItemSpade(1562, EnderTools).setIconIndex(10).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("enderShovel");
	public static Item pickaxeEnder = new ItemPickaxe(1563, EnderTools).setIconIndex(11).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("enderPickaxe");
	public static Item axeEnder = new ItemAxe(1564, EnderTools).setIconIndex(12).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("enderAxe");
	public static Item swordEnder = new ItemSword(1565, EnderTools).setIconIndex(13).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("enderSword");
	public static Item hoeEnder = new ItemSword(1566, EnderTools).setIconIndex(14).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("enderHoe");
	
	public static Item rawTrinium = new Item(1568).setIconCoord(1, 2).setTextureFile(CommonProxy.TEXTURES_PNG).setCreativeTab(CreativeTabs.tabMaterials).setItemName("rawTrinium");
	public static Item ingotTrinium = new Item(1569).setIconCoord(2, 2).setTextureFile(CommonProxy.TEXTURES_PNG).setCreativeTab(CreativeTabs.tabMaterials).setItemName("ingotTrinium");
	public static Item shovelTrinium = new ItemSpade(1570, TriniumTools).setIconCoord(0, 1).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("triniumShovel");
	public static Item pickaxeTrinium = new ItemPickaxe(1571, GlassTools).setIconCoord(1, 1).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("triniumPickaxe");
	public static Item axeTrinium = new ItemAxe(1572, GlassTools).setIconCoord(2, 1).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("triniumAxe");
	public static Item swordTrinium = new ItemSword(1573, GlassTools).setIconCoord(3, 1).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("triniumSword");
	public static Item hoeTrinium = new ItemHoe(1574, GlassTools).setIconCoord(4, 1).setTextureFile(CommonProxy.TEXTURES_PNG).setItemName("triniumHoe");
	
	
	
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
		LanguageRegistry.addName(industrialGlassMaterials, "Industrial Glass Materials");
		LanguageRegistry.addName(rawTrinium, "Unprocessed Trinium");
		LanguageRegistry.addName(ingotTrinium, "Trinium Ingot");
	}
	
	public static void addItemRecipes() {
		GameRegistry.addRecipe(new ItemStack(industrialGlassMaterials, 4), "XXX", "XYX", "XXX", 'X', Block.glass, 'Y', Item.ingotIron);
		// Temporary trinium ingot recipe (will later use custom machine)
		GameRegistry.addShapelessRecipe(new ItemStack(ingotTrinium),
				new ItemStack(rawTrinium), new ItemStack(Item.bucketWater));
	}
	
	// Register all the new tools into the game
	public static void registerTools() {
		registerToolset(Block.obsidian, "Obsidian", ObsidianHarvestLevel,
				shovelObsidian, pickaxeObsidian, axeObsidian, swordObsidian, hoeObsidian);
		registerToolset(Blocks.hardyGlass, "Glass", GlassHarvestLevel,
				shovelGlass, pickaxeGlass, axeGlass, swordGlass, hoeGlass);
		registerToolset(Item.eyeOfEnder, "Ender", EnderHarvestLevel,
				shovelEnder, pickaxeEnder, axeEnder, swordEnder, hoeEnder);
		registerToolset(ingotTrinium, "Trinium", TriniumHarvestLevel,
				shovelTrinium, pickaxeTrinium, axeTrinium, swordTrinium, hoeTrinium);
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
