package com.indra87g.waffle;

import com.indra87g.waffle.events.player.*;

public class WaffleAPI {

    public static void registerPlayerLogin(PlayerLogin handler) {
        PlayerLoginEvent.getHandlers().add(handler);
    }

    public static void registerPlayerMove(PlayerMove handler) {
        PlayerMoveEvent.getHandlers().add(handler);
    }

    public static void registerPlayerTeleport(PlayerTeleport handler) {
        PlayerTeleportEvent.getHandlers().add(handler);
    }
}
