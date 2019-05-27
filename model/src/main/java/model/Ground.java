package model;

import fr.exia.insanevehicles.model.element.Permeability;
import fr.exia.insanevehicles.model.element.Sprite;

/**
 * <h1>The DitchLeft Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class Ground extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('M', "Ground.png");

    /**
     * Instantiates a new ditchLeft.
     */
    Ground() {
        super(SPRITE, Permeability.BLOCKING);
    }
}