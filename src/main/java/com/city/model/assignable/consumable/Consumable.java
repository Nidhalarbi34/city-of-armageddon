package com.city.model.assignable.consumable;

import com.city.model.assignable.Assignable;
import com.city.model.assignable.AssignableException;
import com.city.model.entity.dommageable.fighter.Player;

public abstract class Consumable extends Assignable {

    private final String name, description;

    public Consumable(Player p, String name, String description) {
        super(p);
        this.name = name;
        this.description = description;
    }

    // used in tableView
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void assign() {
        getPlayer().getConsumables().add(this);
    }

    protected abstract void utilization() throws AssignableException;

    public void use() throws AssignableException {
        if (getPlayer() != null) {
            utilization();
            getPlayer().getConsumables().remove(this);
        } else {
            throw new AssignableException(getName() + " n'est pas à vous !");
        }
    }

}
