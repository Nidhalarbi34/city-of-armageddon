package com.city.model.assignable.weapon;

import com.city.model.Element;
import com.city.model.entity.dommageable.fighter.Player;

public class FireAxe extends CompositeWeapon {

    public FireAxe(Player p) {
        super(p, "Hache de feu", new Axe(p, 6, 25, "melee", Element.HOT), new FireStaff(p));
    }

}