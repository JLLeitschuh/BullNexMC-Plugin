package com.nsoft.bullnexmc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class WriteFile extends MyComandExecutor{

	public WriteFile(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// TODO Auto-generated method stub
		if(!super.onCommand(sender, command, label, args)) return false;
		
		
		try {
			
			FileOutputStream salida = new FileOutputStream("test.writing");
			salida.write(new byte[]{32,41,5,31,3,43,76,53,21,12,32});
			salida.flush();
			salida.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			sender.sendMessage("Error: " + e.getMessage());
		}
		
		
		return true;
	}
}
