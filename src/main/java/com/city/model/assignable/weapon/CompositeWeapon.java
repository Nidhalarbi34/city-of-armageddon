package com.city.model.assignable.weapon;

import com.city.model.entity.dommageable.fighter.Player;
import com.city.model.entity.dommageable.fighter.PlayerDeadException;

public abstract class CompositeWeapon extends Weapon {

    private final Weapon[] weapons;

    public CompositeWeapon(Player p, String name, Weapon... weapons) {
        super(p, weapons[0].getAtk(), weapons[0].getCooldown(), name, weapons[0].getElement());
        this.weapons = weapons;
    }

    public void attack() throws PlayerDeadException {
        for (Weapon w : weapons) {
            w.attack();
        }
    }

}



