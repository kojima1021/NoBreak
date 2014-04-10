package net.bukkit_plugin.kojima1021.NoBreak.Event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Break implements Listener {

	@EventHandler
    public void BreakEvent(BlockBreakEvent e) {
		Player p = e.getPlayer();
        if(!p.hasPermission("nobreak.use")){
            p.sendMessage(ChatColor.GOLD + "[NoBreak]"
            + ChatColor.RED + " あなたがブロックを破壊する権限はありません /There is no authority that you destroy the block(nobreak.use)");
            e.setCancelled(true);
        }
    }

}