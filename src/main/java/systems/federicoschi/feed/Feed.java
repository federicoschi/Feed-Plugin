package systems.federicoschi.feed;

import org.bukkit.plugin.java.JavaPlugin;
import systems.federicoschi.feed.commands.FeedCommand;

public final class Feed extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Enabled plugin");
        getCommand("feed").setExecutor(new FeedCommand());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
