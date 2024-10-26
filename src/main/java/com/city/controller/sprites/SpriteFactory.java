package com.city.controller.sprites;

import com.city.controller.ControllerConstants;
import com.city.controller.Images;
import com.city.controller.ZPane;
import com.city.model.assignable.Assignable;
import com.city.model.assignable.consumable.Booster;
import com.city.model.assignable.consumable.Potion;
import com.city.model.entity.Entity;
import com.city.model.entity.Pickable;
import com.city.model.entity.dommageable.destructible.Destructible;
import com.city.model.entity.dommageable.destructible.Fire;
import com.city.model.entity.dommageable.destructible.Hay;
import com.city.model.entity.dommageable.destructible.Ice;
import com.city.model.entity.dommageable.fighter.Fighter;
import com.city.model.entity.dommageable.fighter.enemy.BlueDragon;
import com.city.model.entity.dommageable.fighter.enemy.Bug;
import com.city.model.entity.dommageable.fighter.enemy.Hydra;
import com.city.model.entity.dommageable.fighter.enemy.RedDragon;
import com.city.model.entity.dommageable.projectile.Fireball;
import com.city.model.entity.dommageable.projectile.Iceball;
import com.city.model.entity.dommageable.projectile.Projectile;
import com.city.model.entity.dommageable.projectile.Slash;
import com.city.model.entity.interactable.Crate;
import com.city.model.entity.interactable.Interactable;
import com.city.model.entity.interactable.Npc;
import javafx.scene.image.Image;

public class SpriteFactory {

    public static Image getImageAssignable(Assignable assignable) {
        Image assignImage;
        if (assignable instanceof Potion) {
            int power = ((Potion) assignable).getHeal();
            int size = Integer.compare(power, ControllerConstants.MEDIUM_SIZE) + 1;
            assignImage = Images.POTIONS_RED.get()[size];
        } else if (assignable instanceof Booster) {
            assignImage = Images.POTIONS_BLUE.get()[0];
        } else {
            assignImage = Images.ASSIGNABLES.get(assignable.getName()).get();
        }
        return assignImage == null ? Images.ERROR.get() : assignImage;
    }

    public static Sprite<Pickable> makePickable(ZPane pane, Pickable pickable) {
        Image frame = getImageAssignable(pickable.getAssignable());
        return new Sprite<>(pane, pickable, -(int) frame.getWidth() / 2, -(int) frame.getHeight() / 2, frame);
    }

    public static Sprite<? extends Fighter> makeFighter(ZPane pane, Fighter fighter) {
        if (fighter instanceof Bug)
            return new BugSprite(pane, (Bug) fighter);
        else if (fighter instanceof RedDragon)
            return new RedDragonSprite(pane, (RedDragon) fighter);
        else if (fighter instanceof BlueDragon)
            return new BlueDragonSprite(pane, (BlueDragon) fighter);
        else if (fighter instanceof Hydra)
            return new HydraSprite(pane, (Hydra) fighter);
        return null;
    }

    public static Sprite<? extends Interactable> makeInteractable(ZPane pane, Interactable interactable) {
        if (interactable instanceof Crate)
            return new CrateSprite(pane, (Crate) interactable);
        else if (interactable instanceof Npc && interactable.getId().equals("link"))
            return new LinkSprite(pane, (Npc) interactable);
        else if (interactable instanceof Npc)
            return new NpcSprite(pane, (Npc) interactable);

        return null;
    }

    public static Sprite<? extends Destructible> makeDestructible(ZPane pane, Destructible destructible) {
        if (destructible instanceof Hay)
            return new HaySprite(pane, (Hay) destructible);
        if (destructible instanceof Fire)
            return new FireSprite(pane, (Fire) destructible);
        if (destructible instanceof Ice)
            return new IceSprite(pane, (Ice) destructible);
        return null;
    }

    public static Sprite<? extends Projectile> makeProjectile(ZPane pane, Projectile projectile) {
        if (projectile instanceof Fireball)
            return new FireballSprite(pane, (Fireball) projectile);
        else if (projectile instanceof Iceball)
            return new IceballSprite(pane, (Iceball) projectile);
        else if (projectile instanceof Slash)
            return new SlashSprite(pane, (Slash) projectile);
        return null;
    }

    public interface SpriteMaker<E extends Entity> {

        Sprite<?> make(ZPane pane, E entity);

    }

}
