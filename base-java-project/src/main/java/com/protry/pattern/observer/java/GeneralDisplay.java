package com.protry.pattern.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * @author bshao
 */
public class GeneralDisplay extends Observable implements Observer, DisplayElement {



    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void display() {

    }
}
