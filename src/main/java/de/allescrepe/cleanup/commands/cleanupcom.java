package de.allescrepe.cleanup.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class cleanupcom implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "kill @e[type=item]");
        return false;
    }
}



