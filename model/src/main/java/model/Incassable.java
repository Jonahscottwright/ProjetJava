package model;

import fr.exia.insanevehicles.model.element.Permeability;
import fr.exia.insanevehicles.model.element.Sprite;

/**
 * <h1>The DitchLeft Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class Incassable extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('U', "Incassable.png");

    /**
     * Instantiates a new ditchLeft.
     */
    Incassable() {
        super(SPRITE, Permeability.BLOCKING);
    }
}