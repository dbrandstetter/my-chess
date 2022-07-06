package com.codes.mychess;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static com.codes.mychess.isValidTurn.*;
import static com.codes.mychess.storage.*;
import static com.codes.mychess.turnMethods.*;

public class startGame {

    // checks after every turn if the game is over by checking of the two kings are still there
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
}


