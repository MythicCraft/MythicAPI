package net.mythiccraft.party;

import net.mythiccraft.util.Text;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;

/**
 * A party class (typically for minigames)
 *
 * @author Taylor Hughes
 */
public class Party {

    private Player leader;
    private Set<Player> players;

    public Party(Player leader) {
        this.leader = leader;
        this.players = new HashSet<>();
    }

    public void setLeader(Player player) {
        if (this.leader != null) {
            this.players.add(leader);
        }
        this.leader = player;
    }

    public void addPlayer(Player player) {
        if (!isInParty(player.getName())) {
            this.players.add(player);
        }
    }

    public boolean isInParty(String playername) {
        return players.stream().anyMatch(p -> p.getName().equalsIgnoreCase(playername));
    }

    public void messageAll(String msg) {
        players.forEach(p -> p.sendMessage(Text.colorize(msg)));
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public Player getLeader() {
        return leader;
    }

    public Player getPlayer(String playername) {
        return players.stream().filter(p -> p.getName().equalsIgnoreCase(playername)).findFirst().orElse(null);
    }

    public void remove(String playername) {
        if (!isInParty(playername)) players.remove(getPlayer(playername));
    }
}
