package model;

import fr.exia.insanevehicles.model.element.Permeability;
import entity.Sprite;

/**
 * <h1>The DitchLeft Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class Boule extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('R', "Roche.png");

    /**
     * Instantiates a new ditchLeft.
     */
    Boule() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
