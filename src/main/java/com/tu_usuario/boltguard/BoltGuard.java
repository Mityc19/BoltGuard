
package com.tu_usuario.boltguard;

import org.bukkit.plugin.java.JavaPlugin;
import com.tu_usuario.boltguard.listeners.PlayerListener;
import com.tu_usuario.boltguard.commands.*;

public class BoltGuard extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
        getCommand("bgreload").setExecutor(new BGReloaderCommand(this));
        getCommand("bginfo").setExecutor(new BGInfoCommand(this));
        getCommand("bgviolations").setExecutor(new BGViolationsCommand(this));
        getLogger().info("BoltGuard activo.");
    }

    @Override
    public void onDisable() {
        getLogger().info("BoltGuard desactivado.");
    }
}
