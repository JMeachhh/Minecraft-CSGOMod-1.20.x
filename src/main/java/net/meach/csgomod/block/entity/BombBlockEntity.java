package net.meach.csgomod.block.entity;

import net.meach.csgomod.sound.BombTickingSound;
import net.meach.csgomod.sound.ModSounds;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashMap;
import java.util.Map;

public class BombBlockEntity extends BlockEntity{
    private static final int ticksBeforeExplosion = 41 * 20;
    private int ticks = 0;

    public BombBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.BOMB_BE.get(), pPos, pBlockState);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        if (level.isClientSide()) {
            BombTickingSound sound = new BombTickingSound(this.worldPosition);
            Minecraft.getInstance().getSoundManager().play(sound);
            ACTIVE_SOUNDS.put(this.worldPosition, sound);
        }
    }

    private static final Map<BlockPos, BombTickingSound> ACTIVE_SOUNDS = new HashMap<>();

    public void tick(){
        if (!level.isClientSide()) {
            ticks++;

            if (isRemoved()) {
                BombTickingSound sound = ACTIVE_SOUNDS.remove(this.worldPosition);
                if (sound != null) {
                    sound.stopSound();
                }
            }

            if (ticks >= ticksBeforeExplosion){
                bombExplode();
            }
        }
    }

    private void bombExplode(){
        level.playSeededSound(null, this.worldPosition.getX(), this.worldPosition.getY(), this.worldPosition.getZ(),
                ModSounds.BOMB_EXPLODE.get(), SoundSource.BLOCKS, 1f, 1f, 0);

        level.explode(null,this.worldPosition.getX() + 0.5, this.worldPosition.getY() + 0.5, this.worldPosition.getZ() + 0.5, 10, Level.ExplosionInteraction.NONE);
        level.removeBlock(worldPosition, false);
    }

    @Override
    public void setRemoved() {
        super.setRemoved();
        if (level != null && level.isClientSide()) {
            BombTickingSound sound = ACTIVE_SOUNDS.remove(this.worldPosition);
            if (sound != null) {
                sound.stopSound();  // Stop the sound
                System.out.println("Stopped bomb ticking sound at position " + this.worldPosition);  // Debug log
            } else {
                System.out.println("No sound found to stop at position " + this.worldPosition);  // Debug log
            }
        }
    }
}
