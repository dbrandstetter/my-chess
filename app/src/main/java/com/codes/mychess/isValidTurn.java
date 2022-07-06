package com.codes.mychess;

import static com.codes.mychess.returnColor.*;
import static com.codes.mychess.storage.*;

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

    public static String getColor(String name)
    {
        String storage;

        if (name.equalsIgnoreCase("rook_black1") || name.equalsIgnoreCase("knight_black1") || name.equalsIgnoreCase("bishop_black1") || name.equalsIgnoreCase("queen_black") || name.equalsIgnoreCase("king_black") || name.equalsIgnoreCase("bishop_black2") || name.equalsIgnoreCase("knight_black2") || name.equalsIgnoreCase("rook_black2") || name.equalsIgnoreCase(
    "pawn_black1") || name.equalsIgnoreCase("pawn_black2") || name.equalsIgnoreCase("pawn_black3") || name.equalsIgnoreCase("pawn_black4") || name.equalsIgnoreCase("pawn_black5") || name.equalsIgnoreCase("pawn_black6") || name.equalsIgnoreCase("pawn_black7") || name.equalsIgnoreCase("pawn_black8"))
        {
            storage = "black";
        } else
        {
            storage = "white";
        }

        return storage;
    }
}
