package com.city.model.entity.dommageable.destructible;

import com.city.model.Element;
import com.city.model.Land;

public class Fire extends Destructible {

    public Fire(Land land, int x, int y) {
        super(land, x, y, 1, Element.FIRE);
    }

}
