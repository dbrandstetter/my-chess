package com.codes.mychess;

import static com.codes.mychess.storage.*;

public class specificMovingRules
{
    public static boolean knight (String destinationField)
    {
        return true;
    }

    public static boolean bishop (String destinationField)
    {
        return true;
    }

    public static boolean queen (String destinationField)
    {
        return true;
    }

    public static boolean king (String destinationField)
    {
        return true;
    }

    public static boolean pawn (String destinationField)
    {
        if (selectedField.substring(0,selectedField.length()-1).equalsIgnoreCase("pawn_white"))
        {
            return true;
        }
        // else it is a black pawn
        return true;
    }

    public static boolean rook (String destinationField)
    {
        return true;
    }
}
