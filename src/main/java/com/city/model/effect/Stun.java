package com.city.model.effect;

import com.city.model.entity.dommageable.Dommageable;

public class Stun extends Accel {

    public Stun(Dommageable dommageable, int duration) {
        super(dommageable, duration, -100);
    }

}
