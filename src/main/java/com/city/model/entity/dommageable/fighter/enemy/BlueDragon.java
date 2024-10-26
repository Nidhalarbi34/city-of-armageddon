package com.city.model.entity.dommageable.fighter.enemy;

import com.city.model.entity.dommageable.projectile.Iceball;
import com.city.model.Element;
import com.city.model.Land;

public class BlueDragon extends Dragon {

    public BlueDragon(Land land, int x, int y, int pv, int atk) {
        super(land, x, y, pv, atk, Element.COLD);
    }

    @Override
    public void duringAttackAvaibable() {
        //Enables the dragon to ice_fire only if it is near the player
        if (isInRadius(500))
            attack();
        setCooldown(240);
    }

    @Override
    public void attack() {
        Iceball f;
        //Shoots several fireballs
        int[] projectilesDirections = super.getProjectilesDirections();
        for (int nbProjectiles = 0; nbProjectiles < 3; nbProjectiles++) {
            f = new Iceball(
                getLand(),
                getX(),
                getY(),
                projectilesDirections[nbProjectiles],
                projectilesDirections[nbProjectiles + 3],
                300, getAtk(),
                false
            );
            getLand().getProjectiles().add(f);
        }
    }

}
