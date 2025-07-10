package com.tu_usuario.boltguard;

import org.bukkit.plugin.java.JavaPlugin;

public class BoltGuard extends JavaPlugin {

    private StorageManager storage;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        storage = new StorageManager(this);

        getServer().getPluginManager().registerEvents(new PlayerListener(this), this);

        this.getCommand("bgreload").setExecutor(new ReloadCommand(this));
        this.getCommand("bginfo").setExecutor(new InfoCommand(this));
        this.getCommand("bgviolations").setExecutor(new BGViolationsCommand(this));
        this.getCommand("freeze").setExecutor(new FreezeCommand(this));

        getLogger().info("BoltGuard activado.");
    }

    @Override
    public void onDisable() {
        getLogger().info("BoltGuard desactivado.");
    }

    public StorageManager getStorage() {
        return storage;
    }
}
