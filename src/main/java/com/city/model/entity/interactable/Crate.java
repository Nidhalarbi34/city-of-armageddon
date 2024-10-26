package com.city.model.entity.interactable;

import com.city.model.movement.MoveException;
import com.city.model.movement.OrthogonalMove;
import com.city.model.movement.Push;
import com.city.model.Land;
import com.city.model.ModelConstants;
import com.city.model.entity.dommageable.fighter.Player;
import com.city.model.movement.Move;

public class Crate extends Interactable {

    private Move stealedMove;

    /**
     * Constructor of a movable crate
     *
     * @param x X position of the crate
     * @param y Y position of the crate
     */
    public Crate(Land land, int x, int y) {
        super(land, x, y);
        setWalkbox(32, 16);
        setMove(null);
    }

    @Override
    public void startInteracting() {
        Player p = getLand().getPlayer();
        stealedMove = p.getMove();
        OrthogonalMove move = new OrthogonalMove(this, 1, canMoveVertically());
        setMove(move);
        try {
            Push push = new Push(p, move);
            p.setMove(push);
        } catch (MoveException err) {
            p.setInteracting(false);
        }
    }

    private boolean canMoveHorizontally() {
        Player p = getLand().getPlayer();
        return getWalkbox().y1() <= p.getY() && p.getY() < getWalkbox().y2();
    }

    private boolean canMoveVertically() {
        Player p = getLand().getPlayer();
        return getWalkbox().x1() <= p.getX() && p.getX() < getWalkbox().x2();
    }

    @Override
    public void endInteracting() {
        getLand().getPlayer().setMove(stealedMove);
        stealedMove = null;
    }

    @Override
    public int distance() {
        Player p = getLand().getPlayer();
        if (canMoveHorizontally())
            return Math.abs(p.getX() - getX());
        else if (canMoveVertically())
            return Math.abs(p.getY() - getY());
        else
            return ModelConstants.TOO_FAR;
    }

}
