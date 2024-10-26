package com.city.model.assignable.weapon;

import com.city.model.Element;
import com.city.model.entity.dommageable.fighter.Player;

public class MasterAxe extends CompositeWeapon {

    public MasterAxe(Player p) {
        super(p, "Hache Ultime", new Axe(p, 5, 35, "melee", Element.NORMAL), new SlashStaff(p));
    }

}
