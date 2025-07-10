package com.boltguard;

import org.bukkit.plugin.java.JavaPlugin;

public class BoltGuard extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("BoltGuard activado.");
    }

    @Override
    public void onDisable() {
        getLogger().info("BoltGuard desactivado.");
    }
}