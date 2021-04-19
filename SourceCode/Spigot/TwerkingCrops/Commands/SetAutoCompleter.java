package Spigot.TwerkingCrops.Commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import Spigot.TwerkingCrops.Core;

public class SetAutoCompleter implements TabCompleter {

	@Override
	  public List<String> onTabComplete (CommandSender sender, Command cmd, String label, String[] args){
		  if (!sender.hasPermission("Twerk.Staff"))
	      return new ArrayList<String>();
		  
	      if(cmd.getName().equalsIgnoreCase("set") && args.length == 1){
	          return Core.getInstance().Functions;
	      } else if(cmd.getName().equalsIgnoreCase("set") && args.length == 2 && args[1].equalsIgnoreCase("language")) {
	    	  return Core.getInstance().GetLanguageManager().GetAllLanguages();
	      } else if(cmd.getName().equalsIgnoreCase("set") && args.length == 2){
	    	  List<String> l = new ArrayList<String>();
	    	  l.add("false");
	    	  l.add("true");
	          return l;
	      }
	      
	      return new ArrayList<String>();
	  }
	
}
