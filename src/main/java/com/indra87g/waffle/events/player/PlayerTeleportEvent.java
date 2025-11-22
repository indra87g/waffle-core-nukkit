package com.indra87g.waffle.events.player;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class PlayerTeleportEvent implements Listener {

    @Getter
    private static final List<PlayerTeleport> handlers = new ArrayList<>();

    @EventHandler
    public void onPlayerTeleport(cn.nukkit.event.player.PlayerTeleportEvent event) {
        for (PlayerTeleport handler : handlers) {
            handler.onPlayerTeleport(event.getPlayer(), event.getFrom(), event.getTo());
        }
    }
}
