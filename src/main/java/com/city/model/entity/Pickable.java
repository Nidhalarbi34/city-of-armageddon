package com.city.model.entity;

import com.city.model.assignable.Assignable;
import com.city.model.entity.dommageable.fighter.Player;
import com.city.model.Land;
import com.city.model.UtilsModel;

import java.util.Objects;

public class Pickable extends Entity {

    private Assignable assignable;

    public Pickable(Land land, int x, int y, Assignable assignable) {
        super(land, x, y);
        this.assignable = Objects.requireNonNull(assignable);
    }

    public Assignable getAssignable() {
        return assignable;
    }

    public boolean isTaken() {
        return assignable == null;
    }

    @Override
    public void act() {
        Player p = getLand().getPlayer();
        if (UtilsModel.distance(getX(), getY(), p.getX(), p.getY()) < 48 && assignable != null) {
            assignable.assign();
            assignable = null;
        }
    }

}
