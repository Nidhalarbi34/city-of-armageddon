package com.city.controller.sprites;

import com.city.controller.Images;
import com.city.controller.UtilsController;
import com.city.controller.ZPane;
import com.city.model.entity.dommageable.fighter.enemy.BlueDragon;

public class BlueDragonSprite extends SpriteDragonLike<BlueDragon> {

    public BlueDragonSprite(ZPane pane, BlueDragon enemy) {
        super(pane, enemy, -UtilsController.midleX(Images.BLUE_DRAGON.get()), -UtilsController.midleY(Images.BLUE_DRAGON.get()), Images.BLUE_DRAGON.get());
    }

}