package com.codes.mychess;

import android.net.IpSecManager;

public class returnColor {

    // returns the color of any gives figure name
    public static String whatColor(String id) {
        String color;

        // splits the name (f.e. rook_black4) at the "_" -> [rook, black4]
        String[] parts = id.split("_");

        // any number the name could possibly end with
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8"};

        for (String number : numbers)
        {
            if (parts[1].endsWith(number))
            {
                // if the name ends with a number, it cuts the color name out
                parts[1] = parts[1].substring(0, parts.length-2);
                break;
            }
        }

        color = parts[1];

        return color;
    }
}
