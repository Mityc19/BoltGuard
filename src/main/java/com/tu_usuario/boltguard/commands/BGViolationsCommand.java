package com.tu_usuario.boltguard.commands;

import com.tu_usuario.boltguard.BoltGuard;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BGViolationsCommand implements CommandExecutor {

    private final BoltGuard plugin;

    public BGViolationsCommand(BoltGuard plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("boltguard.staff")) {
            sender.sendMessage("§cNo tienes permiso para usar este comando.");
            return true;
        }

        if (args.length != 1) {
            sender.sendMessage("§cUso: /bgviolations <jugador>");
            return true;
        }

        Player target = Bukkit.getPlayerExact(args[0]);
        if (target == null) {
            sender.sendMessage("§cJugador no encontrado.");
            return true;
        }

        int violations = plugin.getStorage().getViolations(target.getName());
        sender.sendMessage("§a" + target.getName() + " tiene " + violations + " violaciones detectadas.");

        return true;
    }
}
package com.tu_usuario.boltguard.commands;

import com.tu_usuario.boltguard.BoltGuard;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BGViolationsCommand implements CommandExecutor {

    private final BoltGuard plugin;

    public BGViolationsCommand(BoltGuard plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("boltguard.staff")) {
            sender.sendMessage("§cNo tienes permiso para usar este comando.");
            return true;
        }

        if (args.length != 1) {
            sender.sendMessage("§cUso: /bgviolations <jugador>");
            return true;
        }

        Player target = Bukkit.getPlayerExact(args[0]);
        if (target == null) {
            sender.sendMessage("§cJugador no encontrado.");
            return true;
        }

        int violations = plugin.getStorage().getViolations(target.getName());
        sender.sendMessage("§a" + target.getName() + " tiene " + violations + " violaciones detectadas.");

        return true;
    }
}
