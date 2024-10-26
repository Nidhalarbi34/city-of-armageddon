package com.city.controller.sprites;

import com.city.controller.Images;
import com.city.controller.ZPane;
import com.city.model.entity.dommageable.projectile.Fireball;
import com.city.model.entity.dommageable.projectile.Projectile;

public class FireballSprite extends SpriteOriented<Projectile> {

    /**
     * Creates a sprite for a projectile, a fireball
     *
     * @param fireball entity to anchor
     **/
    public FireballSprite(ZPane pane, Fireball fireball) {
        super(pane, fireball, -16, -16, Images.FIREBALL.get());
    }

    @Override
    public void changeOrientation() {
        setRotate(getEntity().orientation() * 45 - 180);
    }

}
