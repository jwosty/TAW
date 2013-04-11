package jw.taw.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.src.ModLoader;
import net.minecraft.item.*;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import jw.taw.common.CommonProxy;
import jw.taw.common.block.Blocks;
import jw.taw.common.item.Items;

@Mod(modid="TAW", name="Tools and Weapons Mod", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class TAW {
	// The instance of this mod that Forge uses
	@Instance("TAW")
	public static TAW instance;
	
	@SidedProxy(clientSide="jw.taw.client.ClientProxy", serverSide="jw.taw.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		// Stub method
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		//ItemsOld.addItems();
		Blocks.addBlocks();
		Items.registerAllItems();
		//Items.addToolsetRecipes(Block.obsidian, Items.shovelObsidian, Items.pickaxeObsidian, Items.axeObsidian, Items.swordObsidian, Items.hoeObsidian);
		addRecipes();
	}
	
	// Adds all the tool recipes to the game
	private void addRecipes() {
		Block obs = Block.obsidian;
		Item stk = Item.stick;
		//Item hdm = ItemsOld.hardyGlassMaterials;
		
		//GameRegistry.addRecipe(new ItemStack(hdm, 4), "XXX", "XYX", "XXX", 'X', Block.glass, 'Y', Item.ingotIron);
		GameRegistry.addSmelting(Items.hardyGlassMaterials.itemID, new ItemStack(Blocks.hardyGlass), 0.1f);
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub method
	}
}