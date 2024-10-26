package com.city.controller.sprites;

import com.city.controller.Images;
import com.city.controller.UtilsController;
import com.city.controller.ZPane;
import com.city.model.entity.dommageable.fighter.enemy.RedDragon;

public class RedDragonSprite extends SpriteDragonLike<RedDragon> {

    public RedDragonSprite(ZPane pane, RedDragon enemy) {
        super(pane, enemy, -UtilsController.midleX(Images.RED_DRAGON.get()), -UtilsController.midleY(Images.RED_DRAGON.get()), Images.RED_DRAGON.get());
    }

}