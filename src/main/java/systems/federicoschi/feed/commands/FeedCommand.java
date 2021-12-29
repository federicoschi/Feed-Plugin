package systems.federicoschi.feed.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if(sender instanceof Player) {
            Player p = (Player) sender;

            if (p.hasPermission("feed.use")) {
                p.setFoodLevel(20);
                p.sendMessage(ChatColor.YELLOW + "Sei stato saziato.");

            } else {
                p.sendMessage(ChatColor.RED + "You don't have the permission to run this command. ");
            }
        }else{
            System.out.println("You need to be a player to run this command.");
        }


        return false;
    }
}
