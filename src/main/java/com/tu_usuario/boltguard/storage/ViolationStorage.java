
package com.tu_usuario.boltguard.storage;

import org.bukkit.entity.Player;
import java.util.*;

public class ViolationStorage {
    private final Map<String, List<String>> violations = new HashMap<>();

    public void recordViolation(Player player, String check) {
        violations.computeIfAbsent(player.getName(), k -> new ArrayList<>())
                  .add(check + " [" + new Date() + "]");
    }

    public List<String> getViolations(String playerName) {
        return violations.getOrDefault(playerName, Collections.emptyList());
    }

    public boolean hasViolations(String playerName) {
        return violations.containsKey(playerName);
    }
}
