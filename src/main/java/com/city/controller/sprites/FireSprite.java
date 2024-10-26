package com.city.controller.sprites;

import com.city.controller.Images;
import com.city.controller.ZPane;
import com.city.model.ModelConstants;
import com.city.model.entity.dommageable.destructible.Fire;

import static com.city.controller.ControllerConstants.FPS;

public class FireSprite extends SpriteDommageable<Fire> {

    /**
     * Add an animation from frames to the sprite
     *
     * @param pane   Pane of sprite
     * @param entity Entity to anchor
     **/
    public FireSprite(ZPane pane, Fire entity) {
        super(pane, entity, -32, -96, Images.FIRE.get());
        int[] framesIndex = new int[Images.FIRE.get().length];
        for (int i = 0; i < Images.FIRE.get().length; i++)
            framesIndex[i] = i;
        addAnimLoop(ModelConstants.S, FPS, framesIndex);
        play(ModelConstants.S);
    }

}
