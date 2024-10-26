package com.city.model.assignable.consumable;

import com.city.model.assignable.AssignableException;
import com.city.model.effect.Effect;
import com.city.model.entity.dommageable.fighter.Player;

public abstract class Affector extends Consumable {

    public Affector(Player p, String name, String description) {
        super(p, name, description);
    }

    @Override
    protected void utilization() throws AssignableException {
        getPlayer().addEffect(makeEffect());
    }

    abstract protected Effect makeEffect() throws AssignableException;

}
