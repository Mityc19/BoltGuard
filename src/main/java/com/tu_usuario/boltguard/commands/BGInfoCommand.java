
package com.tu_usuario.boltguard.commands;

import com.tu_usuario.boltguard.BoltGuard;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BGInfoCommand implements CommandExecutor {
    private final BoltGuard plugin;

    public BGInfoCommand(BoltGuard plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage("§b⚡ BoltGuard v1.0");
        sender.sendMessage("§7Anticheat moderno y ligero para Minecraft 1.8 - 1.20");
        sender.sendMessage("§7Autor: tu_usuario");
        return true;
    }
}
