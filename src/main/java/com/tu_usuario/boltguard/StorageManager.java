package com.tu_usuario.boltguard;

import java.util.HashMap;
import java.util.Map;

public class StorageManager {

    private final BoltGuard plugin;

    private final Map<String, Integer> violations = new HashMap<>();
    private final Map<String, Boolean> frozenPlayers = new HashMap<>();

    public StorageManager(BoltGuard plugin) {
        this.plugin = plugin;
    }

    public int getViolations(String playerName) {
        return violations.getOrDefault(playerName, 0);
    }

    public void addViolation(String playerName) {
        int current = getViolations(playerName);
        violations.put(playerName, current + 1);
    }

    public void setFrozen(String playerName, boolean frozen) {
        frozenPlayers.put(playerName, frozen);
    }

    public boolean isFrozen(String playerName) {
        return frozenPlayers.getOrDefault(playerName, false);
    }
}
