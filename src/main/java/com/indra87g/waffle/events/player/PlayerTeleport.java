package com.indra87g.waffle.events.player;

import cn.nukkit.Player;
import cn.nukkit.level.Location;

public abstract class PlayerTeleport {
    public abstract void onPlayerTeleport(Player player, Location from, Location to);
}
