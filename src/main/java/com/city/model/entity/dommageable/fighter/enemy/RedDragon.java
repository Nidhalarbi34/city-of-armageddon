package com.city.model.entity.dommageable.fighter.enemy;

import com.city.model.entity.dommageable.projectile.Fireball;
import com.city.model.Element;
import com.city.model.Land;

import static com.city.model.ModelConstants.PLAYER_HEAD;

public class RedDragon extends Dragon {

    public RedDragon(Land land, int x, int y, int pv, int atk) {
        super(land, x, y, pv, atk, Element.HOT);
    }

    @Override
    public void attack() {
        Fireball f;
        //Shoots several fireballs
        int[] fireballDirections = super.getProjectilesDirections();
        for (int nbFireball = 0; nbFireball < 3; nbFireball++) {
            f = new Fireball(
                getLand(),
                getX(),
                getY() + PLAYER_HEAD,
                fireballDirections[nbFireball],
                fireballDirections[nbFireball + 3],
                300, getAtk(),
                false);
            getLand().getProjectiles().add(f);
        }
    }

}
