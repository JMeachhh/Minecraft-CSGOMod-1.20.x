package net.meach.csgomod.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class GunItem extends Item {

    private int rarity;
    public GunItem(Properties pProperties, int rarity) {
        super(pProperties);
        this.rarity = rarity;
    }


    @Override
    public Component getName(ItemStack pStack) {
        Component originalName = super.getName(pStack);
        if (rarity == 1){
            return originalName.copy().setStyle(Style.EMPTY.withColor(ChatFormatting.BLUE));
        }
        if (rarity == 2){
            return originalName.copy().setStyle(Style.EMPTY.withColor(ChatFormatting.DARK_PURPLE));
        }
        if (rarity == 3){
            return originalName.copy().setStyle(Style.EMPTY.withColor(ChatFormatting.RED));
        }
        return originalName.copy().setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY));
    }


    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }


    // Gun Holding Animation
    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            @Override
            public HumanoidModel.@Nullable ArmPose getArmPose(LivingEntity entityLiving, InteractionHand hand, ItemStack itemStack) {
                // Check if the item is in the main hand or offhand
                if (hand == InteractionHand.MAIN_HAND){
                    return HumanoidModel.ArmPose.CROSSBOW_HOLD; // Apply the pose to the main hand if holding item
                } else if (hand == InteractionHand.OFF_HAND){
                    return HumanoidModel.ArmPose.ITEM; // Apply the pose to the offhand if holding item
                } else {
                    return HumanoidModel.ArmPose.EMPTY; // Default pose for other scenarios
                }
            }
        });
    }
}
