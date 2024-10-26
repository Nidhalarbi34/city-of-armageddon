package com.city.model.assignable;

import com.city.model.Land;
import com.city.model.entity.dommageable.fighter.Player;

import java.util.Objects;

public abstract class Assignable {

    private final Player player;

    public Assignable(Player player) {
        this.player = Objects.requireNonNull(player);
    }

    public Player getPlayer() {
        return player;
    }

    public Land getLand() {
        return player.getLand();
    }

    public abstract void assign();

    public abstract String getName();

}
