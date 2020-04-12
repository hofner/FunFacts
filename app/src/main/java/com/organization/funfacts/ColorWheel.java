package com.organization.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Hofner76 on 22/03/2020.
 */

public class ColorWheel {
    Random randomGenerator;
    private final int[] colorsOfMine = new int[]{
            Color.CYAN,
            Color.LTGRAY,
            Color.YELLOW,
            Color.RED,
            Color.WHITE,
            Color.GREEN
    };
    public String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public ColorWheel(){

        randomGenerator=new Random();
    }

    public int getColor(){
        return colorsOfMine[randomGenerator.nextInt(colorsOfMine.length)];

    }
    public String getColorStr(){
        return colors[randomGenerator.nextInt(colors.length)];

    }
}
