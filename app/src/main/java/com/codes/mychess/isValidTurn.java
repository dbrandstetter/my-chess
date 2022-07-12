package com.codes.mychess;

import static com.codes.mychess.returnColor.*;
import static com.codes.mychess.storage.*;
import static com.codes.mychess.turnMethods.getColor;

public class isValidTurn {

    public static boolean validSelection(String figureName)
    {
        if (isEmpty(figureName))
        {
            return false;
        }
        else return !wrongColor(figureName);
    }

    public static boolean validDestination (String destinationField)
    {
        if(destinationField.length() == 2)
        {
            return true;
        }
        else return !getColor(destinationField).equalsIgnoreCase(playersTurn);
    }

    private static boolean isEmpty(String figureName)
    {
        return figureName.length() == 2;
    }

    private static boolean wrongColor (String figureName)
    {
        String color = getColor(figureName);

        return !color.equalsIgnoreCase(playersTurn);
    }
}
