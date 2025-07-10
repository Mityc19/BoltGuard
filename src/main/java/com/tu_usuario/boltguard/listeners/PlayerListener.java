package com.tu_usuario.boltguard.listeners;

import com.tu_usuario.boltguard.BoltGuard;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListener implements Listener {

    private final BoltGuard plugin;

    public PlayerListener(BoltGuard plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if (plugin.getStorage().isFrozen(event.getPlayer().getName())) {
            // Cancel movement if player is frozen
            event.setCancelled(true);
            event.getPlayer().sendMessage("§cEstás congelado y no puedes moverte.");
        }
    }
}
