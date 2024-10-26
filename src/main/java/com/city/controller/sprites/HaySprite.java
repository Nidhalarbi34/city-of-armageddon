package com.city.controller.sprites;

import com.city.controller.Images;
import com.city.controller.ZPane;
import com.city.model.entity.dommageable.destructible.Hay;

public class HaySprite extends SpriteDommageable<Hay> {

    /**
     * Creates a sprite for a crate
     *
     * @param burnable Crate to anchor
     **/
    public HaySprite(ZPane pane, Hay burnable) {
        super(pane, burnable, -16, -24, Images.HAY.get());
    }

}
