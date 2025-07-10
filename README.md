<h1 align="center">
⚡ BoltGuard
</h1>

<p align="center">
Anticheat moderno, ligero y modular compatible con Minecraft 1.8 - 1.20<br>
Impulsado por el ecosistema <b>Bolt IA</b> 🔐
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Minecraft-1.8--1.20-blue.svg" />
  <img src="https://img.shields.io/badge/Estado-Desarrollo-orange.svg" />
  <img src="https://img.shields.io/badge/Licencia-MIT-brightgreen.svg" />
  <img src="https://img.shields.io/github/repo-size/TU_USUARIO/BoltGuard" />
</p>

---

## 🛡️ ¿Qué es BoltGuard?

**BoltGuard** es un sistema de defensa inteligente para servidores Minecraft basado en **detección de trampas en tiempo real**, construido para ser **extremadamente liviano, flexible y extensible**.

> Diseñado para proteger sin afectar el rendimiento.

---

## 🔍 Funcionalidades actuales

✅ Compatibilidad total con **Spigot & Paper 1.8 a 1.20**  
✅ Detección de:
- Movimiento ilegal (`Fly`, `Speed`, `Glide`)
- AutoClickers y clicks anormales (`CPS`)
- KillAura y comportamiento de combate antinatural

✅ Sistema de alertas para staff (acción inmediata o silenciosa)  
✅ Modular: cada "check" es independiente y configurable  
✅ Fácil integración con otros plugins y sistemas de staff

---

## 💻 Comandos disponibles

| Comando | Permiso | Descripción |
|--------|---------|-------------|
| `/bgreload` | `boltguard.admin` | Recarga configuración y checks |
| `/bginfo`   | `boltguard.admin` | Muestra info del plugin |
| `/bgviolations <jugador>` | `boltguard.staff` | Muestra el historial de detecciones |

---

## ⚙️ Variables del sistema (`config.yml`)

```yaml
debug: false
alerts:
  enabled: true
  sound: true
  staff-only: true

checks:
  fly:
    enabled: true
    maxAirTime: 500
  speed:
    enabled: true
    maxBlocksPerSecond: 6.5
  autoclicker:
    enabled: true
    maxCPS: 20
