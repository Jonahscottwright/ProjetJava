package model;

import fr.exia.insanevehicles.model.element.Permeability;
import fr.exia.insanevehicles.model.element.Sprite;

/**
 * <h1>The DitchLeft Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
public class Vide extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('B', "Vide.png");

    /**
     * Instantiates a new ditchLeft.
     */
    public Vide() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}