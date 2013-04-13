package jw.taw.common.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityTriniumProcessor extends TileEntity {
	// The item stacks being used in the processor (fuel, water, input, and output)
	private ItemStack[] processorItemStacks = new ItemStack[4];
	// The number of ticks left until the machine finish processing the trinium
	private int processingTime = 0;
	
	public TileEntityTriniumProcessor() {}
}
