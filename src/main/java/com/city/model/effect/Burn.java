package com.city.model.effect;

import com.city.model.entity.dommageable.Dommageable;
import com.city.model.entity.dommageable.fighter.PlayerDeadException;
import com.city.model.Element;

public class Burn extends Effect {

    public Burn(Dommageable dommageable) {
        super(dommageable, 120, 1);
    }

    @Override
    public void consume() throws PlayerDeadException {
        if (getDuration() % 40 == 0)
            getDommageable().takeDamage(getPower(), Element.HOT);
    }

    @Override
    public void endConsume() {

    }

}
