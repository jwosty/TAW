package jw.taw.common.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;

public class Blocks {
	private Blocks() {}
	
	public static Block hardyGlass = (new IndustrialGlass(1551, 32, Material.glass))
			.setHardness(1.0F).setStepSound(Block.soundGlassFootstep)
			.setBlockName("industrialGlass").setCreativeTab(CreativeTabs.tabDecorations);
	
	public static void addBlocks() {
		GameRegistry.registerBlock(hardyGlass, "industrialGlass");
		LanguageRegistry.addName(hardyGlass, "Industrial Glass");
	}
}
