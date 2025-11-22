package com.indra87g.waffle.events.player;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;

import java.util.ArrayList;
import java.util.List;

public class PlayerLoginEvent implements Listener {

    private static final List<PlayerLogin> handlers = new ArrayList<>();

    public static void addHandler(PlayerLogin handler) {
        handlers.add(handler);
    }

    @EventHandler
    public void onPlayerLogin(cn.nukkit.event.player.PlayerLoginEvent event) {
        for (PlayerLogin handler : handlers) {
            handler.onPlayerLogin(event.getPlayer());
        }
    }
}
