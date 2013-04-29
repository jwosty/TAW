package jw.taw.common.block;

import java.util.Random;

import jw.taw.common.CommonProxy;
import jw.taw.common.item.Items;
import net.minecraft.block.BlockOre;

public class BlockTriniumOre extends BlockOre {
	public BlockTriniumOre(int id, int texture) {
		super(id, texture);
	}
	
	@Override
	public String getTextureFile() {
		return CommonProxy.TEXTURES_PNG;
	}
}