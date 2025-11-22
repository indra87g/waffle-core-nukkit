package com.indra87g.waffle.events.player;

import cn.nukkit.Player;
import cn.nukkit.math.Vector3;

public abstract class PlayerMove {
    public abstract void onPlayerMove(Player player, Vector3 from, Vector3 to);
}
