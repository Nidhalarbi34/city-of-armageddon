package com.city.model.assignable.consumable;

import com.city.model.effect.Accel;
import com.city.model.effect.Effect;
import com.city.model.entity.dommageable.fighter.Player;

public class Booster extends Affector {

    public Booster(Player p) {
        super(p, "Booster", "Vitesse x2 pendant 5s");
    }

    @Override
    protected Effect makeEffect() {
        return new Accel(getPlayer(), 360, 1);
    }

}
