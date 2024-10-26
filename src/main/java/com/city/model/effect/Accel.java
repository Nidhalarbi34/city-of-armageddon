package com.city.model.effect;

import com.city.model.entity.dommageable.Dommageable;

public class Accel extends Effect {

    public Accel(Dommageable dommageable, int duration, int power) {
        super(dommageable, duration, power);
        dommageable.addAccel(power);
    }

    @Override
    public void consume() {
    }

    @Override
    public void endConsume() {
        getDommageable().addAccel(-getPower());
    }

}
