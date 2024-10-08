package net.jake.csgomod.item.custom;

import net.jake.csgomod.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DefuseKitItem extends Item {

    private BlockPos positionClicked;
    private BlockState state;
    private Player player;

    public DefuseKitItem(Properties pProperties) {
        super(pProperties);
    }

    /**
     * Make defuse last 4 seconds
     */
    @Override
    public int getUseDuration(ItemStack pStack) {
        return 80;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        return InteractionResultHolder.consume(pPlayer.getItemInHand(pHand));
    }

    @Override
    public void releaseUsing(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity, int pTimeCharged) {
        super.releaseUsing(pStack, pLevel, pLivingEntity, pTimeCharged);
        if (!pLevel.isClientSide){
            player.sendSystemMessage(Component.literal("Defuse Failed!"));
        }
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level pLevel = pContext.getLevel();
        positionClicked = pContext.getClickedPos();
        player = pContext.getPlayer();
        state = pLevel.getBlockState(positionClicked);

        if (!pLevel.isClientSide() && isBomb(state)) {
            player.startUsingItem(pContext.getHand());
            player.sendSystemMessage(Component.literal("Defusing!"));

        }
        return InteractionResult.SUCCESS;
    }

    /**
     * Destroy bomb after defuse kit used
     */
    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        if (!pLevel.isClientSide) {
            pLivingEntity.sendSystemMessage(Component.literal(player.getScoreboardName() + " defused the bomb."));
            pLevel.destroyBlock(positionClicked, false);
            pLevel.playSound(null, positionClicked, SoundEvents.AMETHYST_BLOCK_PLACE, SoundSource.BLOCKS,1.0f,1.0f);
        }
        return pStack;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.csgomod.defuse_kit.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    /**
     * Check if block is a bomb
     */
    private boolean isBomb(BlockState state) {
        return state.is(ModBlocks.BOMB.get());
    }
}
