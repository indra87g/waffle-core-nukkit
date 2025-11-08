package com.indra87g.waffle;

import com.indra87g.waffle.events.player.PlayerLogin;
import com.indra87g.waffle.events.player.PlayerLoginEvent;

public class WaffleAPI {

    public static void registerPlayerLogin(PlayerLogin handler) {
        PlayerLoginEvent.addHandler(handler);
    }

}
