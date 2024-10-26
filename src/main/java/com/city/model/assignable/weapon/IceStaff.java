package com.city.model.assignable.weapon;

import com.city.model.Element;
import com.city.model.ModelConstants;
import com.city.model.entity.dommageable.fighter.Player;
import com.city.model.entity.dommageable.projectile.Iceball;

public class IceStaff extends Staff {

    public IceStaff(Player p) {
        super(p, 3, 50, "Bâton de glace", Element.COLD);
    }

    public void attack() {
        Player p = getLand().getPlayer();
        Iceball iceball = new Iceball(getLand(), p.getX(), p.getY() + ModelConstants.PLAYER_HEAD, p.getFaceX(), p.getFaceY(), 10, 150, getAtk(), true, false);
        p.getLand().getProjectiles().add(iceball);
    }

}