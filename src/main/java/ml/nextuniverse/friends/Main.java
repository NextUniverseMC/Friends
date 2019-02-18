package ml.nextuniverse.friends;

import net.md_5.bungee.api.plugin.Plugin;

import java.util.HashMap;

/**
 * Created by TheDiamondPicks on 11/08/2017.
 */
public class Main extends Plugin {
    // Temporarily stores usernames. Helps stop the queries on Mojang API and the db
    HashMap<String, String> usernameCache = new HashMap<>();
    // Stores friends. Helps stop db quiries
}
