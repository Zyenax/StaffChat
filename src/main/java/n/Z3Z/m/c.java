package n.Z3Z.m;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

public class c extends BukkitCommand{
	
	public c(String string, String description) {
		super(string);
		this.description = description;
	}
	
	/*public boolean execute(CommandSender v, Command q, String o, String[] n){
	    Player p = (Player)v;
	    String msg;
	    if (q.getName().equalsIgnoreCase("staffchat") || q.getName().equalsIgnoreCase("sc")){
	      if (!p.hasPermission("staffchat.chat")){
	        p.sendMessage(z.f("&b&lSTAFFCHAT &e&l> &cYou do not have the permission &astaffchat.chat"));
	      }else{
	        if (n.length == 0){
	          p.sendMessage(z.f("&b&lSTAFFCHAT &e&l> &cUsage: &e/sc [message]"));
	          }
	        if (n.length == 1){
	          msg = n[0];
	          for (Player s : Bukkit.getOnlinePlayers()) {
	            if (s.hasPermission("staffchat.chat")) {
	              s.sendMessage(ChatColor.RED + "STAFF > " + ChatColor.GRAY + msg);
	            }
	          }
	        }
	      }
	    }
	    return true;
	  }*/
	
	
	public boolean execute(CommandSender sender, String alias, String[] args) {
		if(sender instanceof Player){
			Player p = (Player) sender;
			if (alias.equalsIgnoreCase("sc") || alias.equalsIgnoreCase("staffchat")) {
				if(p.hasPermission("staffchat.chat")){
					if(args.length >= 1){
						String msg = "";
			            String[] arrayOfString;
			            int j = (arrayOfString = args).length;
			            for (int i = 0; i < j; i++)
			            {
			              String str = arrayOfString[i];
			              msg = msg + str + " ";
			            }
				          for (Player s : Bukkit.getOnlinePlayers()) {
				            if (s.hasPermission("staffchat.chat")) {
				              s.sendMessage(z.f("&b[&eStaffChat&b] &a" + p.getName() + "&6: &c" + msg));
				            }
				          }
					}else{
						p.sendMessage(z.f("&b&lSTAFFCHAT &e&l> &cUsage: &e/sc [message]"));
					}
				}else{
					p.sendMessage(z.f("&b&lSTAFFCHAT &e&l> &cYou do not have the permission &astaffchat.chat"));
				}
			}
		}
		return true;
	}
}
