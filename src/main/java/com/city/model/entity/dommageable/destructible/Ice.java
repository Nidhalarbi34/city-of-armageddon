package com.city.model.entity.dommageable.destructible;

import com.city.model.Element;
import com.city.model.Land;

public class Ice extends Destructible {

    public Ice(Land land, int x, int y) {
        super(land, x, y, 50, Element.ICE);
    }

}
