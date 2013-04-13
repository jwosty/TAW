package jw.taw.common.block;

import jw.taw.common.tileentity.TileEntityTriniumProcessor;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTriniumProcessor extends BlockContainer {
	public BlockTriniumProcessor(int id, int textureId) {
		super(id, textureId, Material.rock);
		setHardness(2.0F);
		setResistance(5.0F);
		setBlockName("blockTiny");
		setCreativeTab(CreativeTabs.tabDecorations);
	}

	@Override
	public TileEntity createNewTileEntity(World var1) {
		return (new TileEntityTriniumProcessor());
	}
}
