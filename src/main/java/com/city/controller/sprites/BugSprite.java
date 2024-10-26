package com.city.controller.sprites;

import com.city.controller.Images;
import com.city.controller.ZPane;
import com.city.model.entity.dommageable.fighter.enemy.Bug;

import static com.city.controller.ControllerConstants.FPS;
import static com.city.model.ModelConstants.*;

public class BugSprite extends SpriteDommageable<Bug> {

    public BugSprite(ZPane pane, Bug enemy) {
        super(pane, enemy, -20, -16, Images.BUG.get());
        addAnimLoop(S, FPS / 20, 4, 1, 3, 1);
        addAnimLoop(N, FPS / 20, 4, 1, 3, 1);
        addAnimLoop(W, FPS / 20, 4, 1, 3, 1);
        addAnimLoop(E, FPS / 20, 4, 1, 3, 1);
        addAnimLoop(S + MOVING, FPS / 10, 4, 0, 1, 2, 3, 0, 1, 2);
        addAnimLoop(N + MOVING, FPS / 10, 9, 5, 6, 7, 8, 5, 6, 7);
        addAnimLoop(W + MOVING, FPS / 10, 14, 10, 11, 12, 13, 10, 11, 12);
        addAnimLoop(E + MOVING, FPS / 10, 19, 15, 16, 17, 18, 15, 16, 17);
        changeOrientation();
    }

}
