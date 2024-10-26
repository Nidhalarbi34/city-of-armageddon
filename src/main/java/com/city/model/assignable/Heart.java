package com.city.model.assignable;

import com.city.model.entity.dommageable.fighter.Player;

public class Heart extends Assignable {

    public Heart(Player player) {
        super(player);
    }

    @Override
    public void assign() {
        getPlayer().addMaxHP(2);
    }

    @Override
    public String getName() {
        return "Coeur";
    }

}
