package jw.taw.common.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import jw.taw.common.CommonProxy;

public class IndustrialGlass extends Block {
	public IndustrialGlass(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);
	}
	
	@Override
	public String getTextureFile() {
		return CommonProxy.TEXTURES_PNG;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	public int idDropped(int par1, Random random, int zero) {
		return Block.glass.blockID;
	}
}