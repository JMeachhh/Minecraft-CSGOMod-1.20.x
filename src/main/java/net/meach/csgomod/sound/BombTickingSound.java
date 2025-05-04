package net.meach.csgomod.sound;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;

public class BombTickingSound extends AbstractTickableSoundInstance {
    private final BlockPos pos;
    private boolean stopped = false;

    public BombTickingSound(BlockPos pos) {
        super(ModSounds.BOMB_PLACED_AND_TICKING.get(), SoundSource.BLOCKS, RandomSource.create());
        this.pos = pos;
        this.x = pos.getX() + 0.5;
        this.y = pos.getY() + 0.5;
        this.z = pos.getZ() + 0.5;
        this.looping = true;
        this.delay = 0;
        this.volume = 1.0f;
        this.pitch = 1.0f;
    }

    @Override
    public void tick() {
        if (stopped) {
            this.stop();
        }
    }

    public void stopSound() {
        this.stopped = true;
    }

    @Override
    public boolean canPlaySound() {
        return true;
    }

    @Override
    public boolean isStopped() {
        return stopped;
    }
}
