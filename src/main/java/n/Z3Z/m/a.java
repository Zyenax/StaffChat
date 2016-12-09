package n.Z3Z.m;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.craftbukkit.v1_10_R1.CraftServer;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class a extends JavaPlugin implements Listener{
	
	String e = "&e[&cStaffChat&e] &aHas been enabled!";
	public void onEnable(){
		t();
		c();
		ConsoleCommandSender u = Bukkit.getConsoleSender();
		u.sendMessage(z.f(e));
	}
	
	String b = "&e[&cStaffChat&e] &cHas been disabled!";
	public void onDisable(){
		ConsoleCommandSender v = Bukkit.getConsoleSender();
		v.sendMessage(z.f(b));
	}
	
	public void t(){
		PluginManager m = Bukkit.getPluginManager();
		m.registerEvents(new z(this), this);
	}
	
	public void c(){
		((CraftServer) this.getServer()).getCommandMap().register("sc", new c("sc", "Used to talk to staff!"));
		((CraftServer) this.getServer()).getCommandMap().register("staffchat", new c("staffchat", "Used to talk to staff!"));
	}

}