
package com.tu_usuario.boltguard.listeners;

import com.tu_usuario.boltguard.BoltGuard;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListener implements Listener {
    private final BoltGuard plugin;

    public PlayerListener(BoltGuard plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        double yDiff = e.getTo().getY() - e.getFrom().getY();

        if (plugin.getConfig().getBoolean("checks.fly.enabled")) {
            if (!player.isFlying() && yDiff > 1.0) {
                plugin.getStorage().recordViolation(player, "FlyCheck: Movimiento vertical excesivo.");
                if (plugin.getConfig().getBoolean("alerts.enabled")) {
                    player.sendMessage("§c[BoltGuard] Movimiento sospechoso detectado (Fly).");
                }
            }
        }

        if (plugin.getConfig().getBoolean("checks.speed.enabled")) {
            double distance = e.getFrom().distance(e.getTo());
            double maxSpeed = plugin.getConfig().getDouble("checks.speed.maxBlocksPerSecond");
            if (distance > maxSpeed / 20.0) {
                plugin.getStorage().recordViolation(player, "SpeedCheck: Velocidad excesiva.");
                if (plugin.getConfig().getBoolean("alerts.enabled")) {
                    player.sendMessage("§c[BoltGuard] Velocidad sospechosa detectada (Speed).");
                }
            }
        }
    }
}
