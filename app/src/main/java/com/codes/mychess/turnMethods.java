package com.codes.mychess;

import static com.codes.mychess.storage.*;

import android.graphics.Color;
import android.media.Image;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

import javax.xml.namespace.QName;

// this class has all of the methods used in every turn if possible (if they include a ".findViewById()" I couldn't keep them here
// because of the declaration they would have produced a NullPointerException so I moved them in the gameActivity
public class turnMethods {

    // checks after every turn if the game is over by checking ff the two kings are still there
    public static boolean isGameOver()
    {
        short kingCount = 0;

        // checks for every field...
        for (String[] row : chessboard) {
            for (String field : row) {
                // ...whether there is a king on it
                if (field.equalsIgnoreCase("king_black") || field.equalsIgnoreCase("king_white"))
                {
                    kingCount++;
                }
            }
        }

        // if there are two kings, the game isn't over, else (there is only 1) it is
        return kingCount != 2;
    }

    // if it is known, that the game is over, this returns the name of the winning king
    public static String getWinner ()
    {
        for (String[] row : chessboard) {
            for (String field : row) {
                if (field.equalsIgnoreCase("king_black") || field.equalsIgnoreCase("king_white"))
                {
                    return field;
                }
            }
        }

        return "error: no king found";
    }

    // this method tells, if by the current turn any enemy was hit
    public static boolean enemyHit (String destinationField)
    {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if (chessboard[i][j].equalsIgnoreCase(destinationField)) {
                    return !getColor(chessboard[i][j]).equalsIgnoreCase(playersTurn);
                }
            }
        }

        return false;
    }

    // after every turn the player who may make is turn is switched
    public static void switchTurns ()
    {
        if (playersTurn.equalsIgnoreCase("white"))
        {
            playersTurn = "black";
        } else {
            playersTurn = "white";
        }
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

    // returns the destination X for the turn
    public static float getDestinationX (String destinationField) {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if (chessboard[i][j].equalsIgnoreCase(destinationField)) {
                    return -10 + 137 * j;
                }
            }
        }

        return 1;
    }

    // returns the destination Y for the turn
    public static float getDestinationY(String destinationField) {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if (chessboard[i][j].equalsIgnoreCase(destinationField)) {
                    return 520 + 139 * i;
                }
            }
        }

        return 1;
    }
}
