package e.my.splashlibrary;

import android.graphics.Point;
import android.view.Display;

import java.util.ArrayList;
import java.util.Random;

import processing.core.PApplet;
import processing.core.PImage;

public class MySplash extends PApplet {

    float hu = 0;

    public void settings() {

        fullScreen();

    }

    public void setup() {

        colorMode(HSB);
        background(255);

    }

    public void draw() {

        background(hu += 0.5, 255, 255);
        if (hu > 255)
            hu = 0;

    }



}
