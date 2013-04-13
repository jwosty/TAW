package jw.taw.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	private Blocks() {}
	
	public static Block hardyGlass = (new IndustrialGlass(1551, 48, Material.glass))
			.setHardness(1.0F).setStepSound(Block.soundGlassFootstep)
			.setBlockName("industrialGlass").setCreativeTab(CreativeTabs.tabDecorations);
	public static Block oreTrinium = (new BlockTriniumOre(1567, 49)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("oreTrinium");
	
	public static void addBlocks() {
		GameRegistry.registerBlock(hardyGlass, "industrialGlass");
		LanguageRegistry.addName(hardyGlass, "Industrial Glass");
		GameRegistry.registerBlock(oreTrinium, "oreTrinium");
		LanguageRegistry.addName(oreTrinium, "Trinium Ore");
		
		MinecraftForge.setBlockHarvestLevel(oreTrinium, "pickaxe", 2);
	}
}