package net.meach.csgomod.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class KnifeItem extends Item {

    public KnifeItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public Component getName(ItemStack pStack) {
        Component originalName = super.getName(pStack);
        return originalName.copy().setStyle(Style.EMPTY.withColor(ChatFormatting.GOLD));
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }
}
