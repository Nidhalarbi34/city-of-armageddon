package com.city.model.entity.dommageable.fighter.enemy;

import com.city.model.movement.Focus;
import com.city.model.movement.Patrol;
import com.city.model.Element;
import com.city.model.Land;
import com.city.model.box.Box;
import com.city.model.effect.Stun;
import com.city.model.entity.dommageable.fighter.Fighter;
import com.city.model.entity.dommageable.fighter.PlayerDeadException;

public class Bug extends Fighter {

    private boolean focusing;

    public Bug(Land land, int x, int y, int[][] points) {
        super(land, x, y, 15, -16, -16, 32, 32, Element.NORMAL);
        setWalkbox(16, 16);
        Patrol patrol = new Patrol(this, 1);
        for (int[] point : points)
            patrol.addPoint(point);
        setMove(patrol);
    }

    public Bug(Land land, int x, int y) {
        this(land, x, y, new int[0][0]);
    }

    @Override
    public void duringAttackAvaibable() throws PlayerDeadException {
        Box hit = new Box(this, -16, -16, 32, 32);
        if (hit.intersect(getLand().getPlayer().getHitbox())) {
            getLand().getPlayer().takeDamage(1, Element.NORMAL);
            getLand().getPlayer().addEffect(new Stun(getLand().getPlayer(), 10));
            setCooldown(60);
        }
    }

    @Override
    public void act() throws PlayerDeadException {
        if (!focusing
            && getLand().getTicks() % 10 == 0
            && isNear(getLand().getPlayer(), 200)) {
            setMove(new Focus(this, 1, getLand().getPlayer()));
            focusing = true;
        }
        super.act();
    }

}
