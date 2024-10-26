package com.city.model.entity.dommageable.destructible;

import com.city.model.Element;
import com.city.model.Land;
import com.city.model.entity.dommageable.Dommageable;

public abstract class Destructible extends Dommageable {

    public Destructible(Land land, int x, int y, int pv, Element weakness) {
        super(land, x, y, pv, -16, -8, 32, 16, weakness);
        setWalkbox(32, 16);
        setMove(null);
    }

}