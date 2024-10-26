package com.city.controller.sprites;

import com.city.controller.Images;
import com.city.controller.ZPane;
import com.city.model.entity.dommageable.destructible.Ice;

public class IceSprite extends SpriteDommageable<Ice> {

    /**
     * Add an animation from frames to the sprite
     *
     * @param pane   Pane of sprite
     * @param entity Entity to anchor
     **/
    public IceSprite(ZPane pane, Ice entity) {
        super(pane, entity, -16, -40, Images.ICE.get());
    }

}
