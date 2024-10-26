package com.city.controller;

import com.city.controller.sprites.Sprite;
import com.city.controller.sprites.SpriteFactory;
import com.city.model.entity.Entity;
import javafx.collections.ListChangeListener;

public class EntityListener<E extends Entity> implements ListChangeListener<E> {

    private final SpriteFactory.SpriteMaker<E> maker;
    private final ZPane pane;

    public EntityListener(ZPane pane, SpriteFactory.SpriteMaker<E> maker) {
        this.maker = maker;
        this.pane = pane;
    }

    public Sprite<?> make(E e) {
        return maker.make(pane, e);
    }

    @Override
    public void onChanged(Change<? extends E> changes) {
        while (changes.next()) {
            for (E e : changes.getAddedSubList())
                pane.add(make(e));
            for (E e : changes.getRemoved())
                pane.remove(e);
        }
    }

}
