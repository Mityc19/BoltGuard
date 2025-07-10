
package com.tu_usuario.boltguard.commands;

import com.tu_usuario.boltguard.BoltGuard;
import com.tu_usuario.boltguard.storage.ViolationStorage;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BGViolationsCommand implements CommandExecutor {
    private final BoltGuard plugin;

    public BGViolationsCommand(BoltGuard plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length != 1) {
            sender.sendMessage("§cUso: /bgviolations <jugador>");
            return true;
        }
        String playerName = args[0];
        ViolationStorage storage = plugin.getStorage();
        if (!storage.hasViolations(playerName)) {
            sender.sendMessage("§a[BoltGuard] §fNo hay violaciones registradas para " + playerName + ".");
        } else {
            sender.sendMessage("§a[BoltGuard] §fViolaciones de " + playerName + ":");
            storage.getViolations(playerName).forEach(v -> sender.sendMessage(" - " + v));
        }
        return true;
    }
}
