package net.mythiccraft.game;

import org.bukkit.Location;

import java.util.Set;

/**
 * An arena's pre-game lobby.
 *
 * @author Taylor Hughes
 */
public class ArenaLobby {

    private String name;
    private String arena;
    private Location spawn;
    private int playerCount;
    private int maxPlayers;
    private Set<String> players;
}
