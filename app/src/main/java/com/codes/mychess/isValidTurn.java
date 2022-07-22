package com.codes.mychess;

import static com.codes.mychess.storage.*;
import static com.codes.mychess.turnMethods.getColor;
import static com.codes.mychess.specificMovingRules.*;

public class isValidTurn {

    public static boolean validSelection(String figureName)
    {
        return !isEmpty(figureName) && !wrongColor(figureName);
    }

    public static boolean validDestination (String destinationField)
    {
        boolean rightColor = !getColor(destinationField).equalsIgnoreCase(playersTurn);

        return (destinationField.length() == 2 || rightColor) && rightMoveForFigure(destinationField);
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

    private static boolean rightMoveForFigure (String destinationField)
    {
        if (selectedField.equalsIgnoreCase("rook_black1")) {
            return rook(destinationField);
        } else if (selectedField.equalsIgnoreCase("knight_black1")) {
            return knight(destinationField);
        } else if (selectedField.equalsIgnoreCase("bishop_black1")) {
            return bishop(destinationField);
        } else if (selectedField.equalsIgnoreCase("queen_black")) {
            return queen(destinationField);
        } else if (selectedField.equalsIgnoreCase("king_black")) {
            return king(destinationField);
        } else if (selectedField.equalsIgnoreCase("bishop_black2")) {
            return bishop(destinationField);
        } else if (selectedField.equalsIgnoreCase("knight_black2")) {
            return knight(destinationField);
        } else if (selectedField.equalsIgnoreCase("rook_black2")) {
            return rook(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_black1")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_black2")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_black3")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_black4")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_black5")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_black6")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_black7")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_black8")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_white1")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_white2")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_white3")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_white4")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_white5")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_white6")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_white7")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("pawn_white8")) {
            return pawn(destinationField);
        } else if (selectedField.equalsIgnoreCase("rook_white1")) {
            return rook(destinationField);
        } else if (selectedField.equalsIgnoreCase("knight_white1")) {
            return knight(destinationField);
        } else if (selectedField.equalsIgnoreCase("bishop_white1")) {
            return bishop(destinationField);
        } else if (selectedField.equalsIgnoreCase("queen_white")) {
            return queen(destinationField);
        } else if (selectedField.equalsIgnoreCase("king_white")) {
            return king(destinationField);
        } else if (selectedField.equalsIgnoreCase("bishop_white2")) {
            return bishop(destinationField);
        } else if (selectedField.equalsIgnoreCase("knight_white2")) {
            return knight(destinationField);
        } else if (selectedField.equalsIgnoreCase("rook_white2")) {
            return rook(destinationField);
        }
        return false;
    }
}
