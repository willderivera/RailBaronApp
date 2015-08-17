package com.willderivera.railbaronhelper;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shay on 8/16/2015.
 */
public class Game {

    private Map<String, Player> players = new HashMap<>();

    public Game(Player[] players) {
        for (Player player: players) {
            this.players.put(player.getName(), player);
        }
    }

    public Player getPlayer(String playerName) {
        return this.players.get(playerName);
    }
}
