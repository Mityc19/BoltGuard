
package com.tu_usuario.boltguard.commands;

import com.tu_usuario.boltguard.BoltGuard;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BGReloaderCommand implements CommandExecutor {
    private final BoltGuard plugin;

    public BGReloaderCommand(BoltGuard plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        plugin.reloadConfig();
        sender.sendMessage("§a[BoltGuard] Configuración recargada correctamente.");
        return true;
    }
}
