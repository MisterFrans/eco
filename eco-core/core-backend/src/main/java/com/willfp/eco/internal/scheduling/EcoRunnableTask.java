package com.willfp.eco.internal.scheduling;

import com.willfp.eco.core.EcoPlugin;
import com.willfp.eco.core.scheduling.RunnableTask;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public abstract class EcoRunnableTask extends BukkitRunnable implements RunnableTask {
    private final EcoPlugin plugin;

    @ApiStatus.Internal
    public EcoRunnableTask(@NotNull final EcoPlugin plugin) {
        this.plugin = plugin;
    }

    protected final EcoPlugin getPlugin() {
        return this.plugin;
    }

    @Override
    @NotNull
    public final synchronized BukkitTask runTask() {
        return super.runTask(plugin);
    }

    @Override
    @NotNull
    public final synchronized BukkitTask runTaskAsynchronously() {
        return super.runTaskAsynchronously(plugin);
    }

    @Override
    @NotNull
    public final synchronized BukkitTask runTaskLater(final long delay) {
        return super.runTaskLater(plugin, delay);
    }

    @Override
    @NotNull
    public final synchronized BukkitTask runTaskLaterAsynchronously(final long delay) {
        return super.runTaskLaterAsynchronously(plugin, delay);
    }

    @Override
    @NotNull
    public final synchronized BukkitTask runTaskTimer(final long delay, final long period) {
        return super.runTaskTimer(plugin, delay, period);
    }

    @Override
    @NotNull
    public final synchronized BukkitTask runTaskTimerAsynchronously(final long delay, final long period) {
        return super.runTaskTimerAsynchronously(plugin, delay, period);
    }
}
