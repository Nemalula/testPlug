package io.github.something;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Citah extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("plugin haz bean enabelt");
    }

    @Override
    public void onDisable() {
        getLogger().info("plugin haz bean dissevelad");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (label.equalsIgnoreCase("msg")) {
            if (args.length != 0) {
                if (Bukkit.getPlayer(args[0]) instanceof Player) {
                    Bukkit.getPlayer(args[0]).sendMessage("hi");
                    return true;
                } else {
                    player.sendMessage("failed to recognizre your existance");
                    return true;
                }
            } else {
                player.sendMessage("pls enter a nem");
                return true;
            }
        }
        return false;
    }
}


