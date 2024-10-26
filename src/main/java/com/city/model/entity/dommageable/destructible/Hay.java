package com.city.model.entity.dommageable.destructible;

import com.city.model.Element;
import com.city.model.Land;

public class Hay extends Destructible {

    public Hay(Land land, int x, int y) {
        super(land, x, y, 20, Element.ICE);
    }

}