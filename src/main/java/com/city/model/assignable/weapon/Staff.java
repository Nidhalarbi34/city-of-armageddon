package com.city.model.assignable.weapon;

import com.city.model.Element;
import com.city.model.entity.dommageable.fighter.Player;

public abstract class Staff extends Weapon {

    public Staff(Player p, int atk, int cooldown, String name, Element element) {
        super(p, atk, cooldown, name, element);
    }

    public abstract void attack();

}