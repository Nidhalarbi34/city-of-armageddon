package com.city.controller.sprites;

import com.city.controller.Images;
import com.city.controller.ZPane;
import com.city.model.entity.interactable.Crate;

public class CrateSprite extends Sprite<Crate> {

    /**
     * Creates a sprite for a crate
     *
     * @param crate Crate to anchor
     **/
    public CrateSprite(ZPane pane, Crate crate) {
        super(pane, crate, -16, -40, Images.CRATE.get());
    }

}
