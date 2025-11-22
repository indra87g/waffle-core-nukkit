package com.indra87g;

import com.indra87g.waffle.events.player.PlayerLoginEvent;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {

    @Override
    public void onEnable() {
        getLogger().info("WaffleCore activated!");
        this.getServer().getPluginManager().registerEvents(new PlayerLoginEvent(), this);
    }
}
