package com.city.model.assignable.weapon;

import com.city.model.Element;
import com.city.model.ModelConstants;
import com.city.model.entity.dommageable.fighter.Player;
import com.city.model.entity.dommageable.projectile.Slash;

public class SlashStaff extends Staff {

    public SlashStaff(Player p) {
        super(p, 1, 150, "Onde de choc", Element.NORMAL);

    }

    public void attack() {
        Player p = getLand().getPlayer();
        if (p.getHp() >= p.getMaxHp()) {
            Slash slash = new Slash(getLand(), p.getX(), p.getY() + ModelConstants.PLAYER_HEAD, p.getFaceX(), p.getFaceY(), getAtk());
            p.getLand().getProjectiles().add(slash);
        }
    }

}