package model;

import fr.exia.insanevehicles.model.element.Permeability;
import fr.exia.insanevehicles.model.element.Sprite;

/**
 * <h1>The DitchLeft Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class Diamond extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('D', "Diamond.png");

    /**
     * Instantiates a new ditchLeft.
     */
    Diamond() {
        super(SPRITE, Permeability.BLOCKING);
    }
}