package com.indra87g.waffle.events.player;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class PlayerMoveEvent implements Listener {

    @Getter
    private static final List<PlayerMove> handlers = new ArrayList<>();

    @EventHandler
    public void onPlayerMove(cn.nukkit.event.player.PlayerMoveEvent event) {
        for (PlayerMove handler : handlers) {
            handler.onPlayerMove(event.getPlayer(), event.getFrom(), event.getTo());
        }
    }
}
