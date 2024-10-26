package com.city.model.assignable.weapon;

import com.city.model.Element;
import com.city.model.assignable.Assignable;
import com.city.model.entity.dommageable.fighter.Player;
import com.city.model.entity.dommageable.fighter.PlayerDeadException;

public abstract class Weapon extends Assignable {

    private final int atk;
    private final int cooldown;
    private final Element element;
    private final String name;

    public Weapon(Player p, int atk, int cooldown, String name, Element element) {
        super(p);
        this.atk = atk;
        this.cooldown = cooldown;
        this.name = name;
        this.element = element;
    }

    public Element getElement() {
        return element;
    }

    public int getAtk() {
        return atk;
    }

    public String getName() {
        return name;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void assign() {
        getPlayer().pickIpWeapon(this);
    }

    public abstract void attack() throws PlayerDeadException;

}
