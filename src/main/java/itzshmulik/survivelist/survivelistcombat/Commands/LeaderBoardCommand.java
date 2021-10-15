package itzshmulik.survivelist.survivelistcombat.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class LeaderBoardCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if(command.getName().equalsIgnoreCase("LeaderBoard") || command.getName().equalsIgnoreCase("Leaderboards")){
            Player player = (Player) sender;

            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e&lLeaderBoard"));
        }
        return false;
    }
}
