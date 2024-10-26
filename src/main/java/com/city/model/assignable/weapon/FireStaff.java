package com.city.model.assignable.weapon;

import com.city.model.Element;
import com.city.model.entity.dommageable.fighter.Player;
import com.city.model.entity.dommageable.projectile.Fireball;

import static com.city.model.ModelConstants.PLAYER_HEAD;

public class FireStaff extends Staff {

    public FireStaff(Player p) {
        super(p, 1, 40, "Bâton de feu", Element.HOT);
    }

    public void attack() {
        Player p = getLand().getPlayer();
        Fireball fireball = new Fireball(getLand(), p.getX(), p.getY() + PLAYER_HEAD, p.getFaceX(), p.getFaceY(),
            200, getAtk(), true);
        p.getLand().getProjectiles().add(fireball);
    }

}
