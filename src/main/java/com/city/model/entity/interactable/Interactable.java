package com.city.model.entity.interactable;

import com.city.model.Land;
import com.city.model.UtilsModel;
import com.city.model.entity.Entity;
import com.city.model.entity.dommageable.fighter.Player;

public abstract class Interactable extends Entity {

    public Interactable(Land land, int x, int y) {
        super(land, x, y);
    }

    /**
     * Start of interaction
     */
    public abstract void startInteracting();

    /**
     * End of interaction
     */
    public void endInteracting() {
    }

    /**
     * Interactable distance from the player
     *
     * @return distance
     */
    public int distance() {
        Player p = getLand().getPlayer();
        return UtilsModel.distance(p.getX(), p.getY(), getX(), getY());
    }

}
