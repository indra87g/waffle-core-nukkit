package com.indra87g.waffle.events.player;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class PlayerLoginEvent implements Listener {

    @Getter
    private static final List<PlayerLogin> handlers = new ArrayList<>();

    @EventHandler
    public void onPlayerLogin(cn.nukkit.event.player.PlayerLoginEvent event) {
        for (PlayerLogin handler : handlers) {
            handler.onPlayerLogin(event.getPlayer());
        }
    }
}
