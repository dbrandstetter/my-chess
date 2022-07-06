package com.codes.mychess;

import static com.codes.mychess.isValidTurn.getColor;
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

// this class has most of the methods used in every turn
public class turnMethods {

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

    // if the game winner is known, the winning message for the player is made visible
    public static void showWinner(String winner)
    {
        ImageView imageView = null;

        if (winner.equalsIgnoreCase("king_white"))
        {
            imageView = (ImageView) imageView.findViewById(R.id.winner_white);
        }
        else if (winner.equalsIgnoreCase("king_black"))
        {
            imageView = (ImageView) imageView.findViewById(R.id.winner_black);

        }

        imageView.setVisibility(View.VISIBLE);
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

    // if an enemy was hit, the responding figure should be deleted out of chessboard and should be overwritten
    public static void removeEnemy (String destinationField)
    {
        ImageView imageView = null;

        int row, column;
        row = 0;
        column = 0;
        
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if (chessboard[i][j].equalsIgnoreCase(destinationField))
                {
                    row = i;
                    column = j;
                }
            }
        }

        if(chessboard[row][column].equalsIgnoreCase("rook_black1"))
        {
            imageView = (ImageView) imageView.findViewById(R.id.rook_black1);
        }
        else if (chessboard[row][column].equalsIgnoreCase("knight_black1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.knight_black1));
        }
        else if (chessboard[row][column].equalsIgnoreCase("bishop_black1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.bishop_black1));
        }
        else if (chessboard[row][column].equalsIgnoreCase("queen_black"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.queen_black));
        }
        else if (chessboard[row][column].equalsIgnoreCase("king_black"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.king_black));
        }
        else if (chessboard[row][column].equalsIgnoreCase("bishop_black2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.bishop_black2));
        }
        else if (chessboard[row][column].equalsIgnoreCase("knight_black2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.knight_black2));
        }
        else if (chessboard[row][column].equalsIgnoreCase("rook_black2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.rook_black2));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_black1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black1));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_black2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black2));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_black3"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black3));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_black4"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black4));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_black5"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black5));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_black6"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black6));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_black7"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black7));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_black8"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black8));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_white1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white1));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_white2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white2));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_white3"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white3));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_white4"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white4));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_white5"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white5));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_white6"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white6));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_white7"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white7));
        }
        else if (chessboard[row][column].equalsIgnoreCase("pawn_white8"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white8));
        }
        else if (chessboard[row][column].equalsIgnoreCase("rook_white1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.rook_white1));
        }
        else if (chessboard[row][column].equalsIgnoreCase("knight_white1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.knight_white1));
        }
        else if (chessboard[row][column].equalsIgnoreCase("bishop_white1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.bishop_white1));
        }
        else if (chessboard[row][column].equalsIgnoreCase("queen_white"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.queen_white));
        }
        else if (chessboard[row][column].equalsIgnoreCase("king_white"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.king_white));
        }
        else if (chessboard[row][column].equalsIgnoreCase("bishop_white2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.bishop_white2));
        }
        else if (chessboard[row][column].equalsIgnoreCase("knight_white2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.knight_white2));
        }
        else if (chessboard[row][column].equalsIgnoreCase("rook_white2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.rook_white2));
        } else
        {
            imageView = (ImageView) imageView.findViewById((R.id.error_message));
        }

        // imageView.setVisibility(View.GONE);
        
    }

    // after every valid turn the selected figure must be moved to the destination and the starting field should be filled with the default value
    public static void moveFigure (String destinationField)
    {
        ImageView imageView = null;

        if(selectedField.equalsIgnoreCase("rook_black1"))
        {
            imageView = (ImageView) imageView.findViewById(R.id.rook_black1);
        }
        else if (selectedField.equalsIgnoreCase("knight_black1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.knight_black1));
        }
        else if (selectedField.equalsIgnoreCase("bishop_black1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.bishop_black1));
        }
        else if (selectedField.equalsIgnoreCase("queen_black"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.queen_black));
        }
        else if (selectedField.equalsIgnoreCase("king_black"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.king_black));
        }
        else if (selectedField.equalsIgnoreCase("bishop_black2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.bishop_black2));
        }
        else if (selectedField.equalsIgnoreCase("knight_black2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.knight_black2));
        }
        else if (selectedField.equalsIgnoreCase("rook_black2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.rook_black2));
        }
        else if (selectedField.equalsIgnoreCase("pawn_black1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black1));
        }
        else if (selectedField.equalsIgnoreCase("pawn_black2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black2));
        }
        else if (selectedField.equalsIgnoreCase("pawn_black3"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black3));
        }
        else if (selectedField.equalsIgnoreCase("pawn_black4"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black4));
        }
        else if (selectedField.equalsIgnoreCase("pawn_black5"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black5));
        }
        else if (selectedField.equalsIgnoreCase("pawn_black6"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black6));
        }
        else if (selectedField.equalsIgnoreCase("pawn_black7"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black7));
        }
        else if (selectedField.equalsIgnoreCase("pawn_black8"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_black8));
        }
        else if (selectedField.equalsIgnoreCase("pawn_white1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white1));
        }
        else if (selectedField.equalsIgnoreCase("pawn_white2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white2));
        }
        else if (selectedField.equalsIgnoreCase("pawn_white3"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white3));
        }
        else if (selectedField.equalsIgnoreCase("pawn_white4"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white4));
        }
        else if (selectedField.equalsIgnoreCase("pawn_white5"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white5));
        }
        else if (selectedField.equalsIgnoreCase("pawn_white6"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white6));
        }
        else if (selectedField.equalsIgnoreCase("pawn_white7"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white7));
        }
        else if (selectedField.equalsIgnoreCase("pawn_white8"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.pawn_white8));
        }
        else if (selectedField.equalsIgnoreCase("rook_white1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.rook_white1));
        }
        else if (selectedField.equalsIgnoreCase("knight_white1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.knight_white1));
        }
        else if (selectedField.equalsIgnoreCase("bishop_white1"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.bishop_white1));
        }
        else if (selectedField.equalsIgnoreCase("queen_white"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.queen_white));
        }
        else if (selectedField.equalsIgnoreCase("king_white"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.king_white));
        }
        else if (selectedField.equalsIgnoreCase("bishop_white2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.bishop_white2));
        }
        else if (selectedField.equalsIgnoreCase("knight_white2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.knight_white2));
        }
        else if (selectedField.equalsIgnoreCase("rook_white2"))
        {
            imageView = (ImageView) imageView.findViewById((R.id.rook_white2));
        }

        imageView.setX(getDestinationX(destinationField));
        imageView.setY(getDestinationY(destinationField));
        
        Button button = null;
        
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if(chessboard[i][j].equalsIgnoreCase(destinationField))
                {
                    if (i == 0 && j == 0)
                    {
                        button = (Button) button.findViewById(R.id.b00);
                    }
                    else if (i == 0 && j == 1)
                    {
                        button = (Button) button.findViewById(R.id.b01);
                    }
                    else if (i == 0 && j == 2)
                    {
                        button = (Button) button.findViewById(R.id.b02);
                    }
                    else if (i == 0 && j == 3)
                    {
                        button = (Button) button.findViewById(R.id.b03);
                    }
                    else if (i == 0 && j == 4)
                    {
                        button = (Button) button.findViewById(R.id.b04);
                    }
                    else if (i == 0 && j == 5)
                    {
                        button = (Button) button.findViewById(R.id.b05);
                    }
                    else if (i == 0 && j == 6)
                    {
                        button = (Button) button.findViewById(R.id.b06);
                    }
                    else if (i == 0 && j == 7)
                    {
                        button = (Button) button.findViewById(R.id.b07);
                    }
                    else if (i == 1 && j == 0)
                    {
                        button = (Button) button.findViewById(R.id.b10);
                    }
                    else if (i == 1 && j == 1)
                    {
                        button = (Button) button.findViewById(R.id.b11);
                    }
                    else if (i == 1 && j == 2)
                    {
                        button = (Button) button.findViewById(R.id.b12);
                    }
                    else if (i == 1 && j == 3)
                    {
                        button = (Button) button.findViewById(R.id.b13);
                    }
                    else if (i == 1 && j == 4)
                    {
                        button = (Button) button.findViewById(R.id.b14);
                    }
                    else if (i == 1 && j == 5)
                    {
                        button = (Button) button.findViewById(R.id.b15);
                    }
                    else if (i == 1 && j == 6)
                    {
                        button = (Button) button.findViewById(R.id.b16);
                    }
                    else if (i == 1 && j == 7)
                    {
                        button = (Button) button.findViewById(R.id.b17);
                    }
                    else if (i == 2 && j == 0)
                    {
                        button = (Button) button.findViewById(R.id.b20);
                    }
                    else if (i == 2 && j == 1)
                    {
                        button = (Button) button.findViewById(R.id.b21);
                    }
                    else if (i == 2 && j == 2)
                    {
                        button = (Button) button.findViewById(R.id.b22);
                    }
                    else if (i == 2 && j == 3)
                    {
                        button = (Button) button.findViewById(R.id.b23);
                    }
                    else if (i == 2 && j == 4)
                    {
                        button = (Button) button.findViewById(R.id.b24);
                    }
                    else if (i == 2 && j == 5)
                    {
                        button = (Button) button.findViewById(R.id.b25);
                    }
                    else if (i == 2 && j == 6)
                    {
                        button = (Button) button.findViewById(R.id.b26);
                    }
                    else if (i == 2 && j == 7)
                    {
                        button = (Button) button.findViewById(R.id.b27);
                    }
                    else if (i == 3 && j == 0)
                    {
                        button = (Button) button.findViewById(R.id.b30);
                    }
                    else if (i == 3 && j == 1)
                    {
                        button = (Button) button.findViewById(R.id.b31);
                    }
                    else if (i == 3 && j == 2)
                    {
                        button = (Button) button.findViewById(R.id.b32);
                    }
                    else if (i == 3 && j == 3)
                    {
                        button = (Button) button.findViewById(R.id.b33);
                    }
                    else if (i == 3 && j == 4)
                    {
                        button = (Button) button.findViewById(R.id.b34);
                    }
                    else if (i == 3 && j == 5)
                    {
                        button = (Button) button.findViewById(R.id.b35);
                    }
                    else if (i == 3 && j == 6)
                    {
                        button = (Button) button.findViewById(R.id.b36);
                    }
                    else if (i == 3 && j == 7)
                    {
                        button = (Button) button.findViewById(R.id.b37);
                    }
                    else if (i == 4 && j == 0)
                    {
                        button = (Button) button.findViewById(R.id.b40);
                    }
                    else if (i == 4 && j == 1)
                    {
                        button = (Button) button.findViewById(R.id.b41);
                    }
                    else if (i == 4 && j == 2)
                    {
                        button = (Button) button.findViewById(R.id.b42);
                    }
                    else if (i == 4 && j == 3)
                    {
                        button = (Button) button.findViewById(R.id.b43);
                    }
                    else if (i == 4 && j == 4)
                    {
                        button = (Button) button.findViewById(R.id.b44);
                    }
                    else if (i == 4 && j == 5)
                    {
                        button = (Button) button.findViewById(R.id.b45);
                    }
                    else if (i == 4 && j == 6)
                    {
                        button = (Button) button.findViewById(R.id.b46);
                    }
                    else if (i == 4 && j == 7)
                    {
                        button = (Button) button.findViewById(R.id.b47);
                    }
                    else if (i == 5 && j == 0)
                    {
                        button = (Button) button.findViewById(R.id.b50);
                    }
                    else if (i == 5 && j == 1)
                    {
                        button = (Button) button.findViewById(R.id.b51);
                    }
                    else if (i == 5 && j == 2)
                    {
                        button = (Button) button.findViewById(R.id.b52);
                    }
                    else if (i == 5 && j == 3)
                    {
                        button = (Button) button.findViewById(R.id.b53);
                    }
                    else if (i == 5 && j == 4)
                    {
                        button = (Button) button.findViewById(R.id.b54);
                    }
                    else if (i == 5 && j == 5)
                    {
                        button = (Button) button.findViewById(R.id.b55);
                    }
                    else if (i == 5 && j == 6)
                    {
                        button = (Button) button.findViewById(R.id.b56);
                    }
                    else if (i == 5 && j == 7)
                    {
                        button = (Button) button.findViewById(R.id.b57);
                    }
                    else if (i == 6 && j == 0)
                    {
                        button = (Button) button.findViewById(R.id.b60);
                    }
                    else if (i == 6 && j == 1)
                    {
                        button = (Button) button.findViewById(R.id.b61);
                    }
                    else if (i == 6 && j == 2)
                    {
                        button = (Button) button.findViewById(R.id.b62);
                    }
                    else if (i == 6 && j == 3)
                    {
                        button = (Button) button.findViewById(R.id.b63);
                    }
                    else if (i == 6 && j == 4)
                    {
                        button = (Button) button.findViewById(R.id.b64);
                    }
                    else if (i == 6 && j == 5)
                    {
                        button = (Button) button.findViewById(R.id.b65);
                    }
                    else if (i == 6 && j == 6)
                    {
                        button = (Button) button.findViewById(R.id.b66);
                    }
                    else if (i == 6 && j == 7)
                    {
                        button = (Button) button.findViewById(R.id.b67);
                    }
                    else if (i == 7 && j == 0)
                    {
                        button = (Button) button.findViewById(R.id.b70);
                    }
                    else if (i == 7 && j == 1)
                    {
                        button = (Button) button.findViewById(R.id.b71);
                    }
                    else if (i == 7 && j == 2)
                    {
                        button = (Button) button.findViewById(R.id.b72);
                    }
                    else if (i == 7 && j == 3)
                    {
                        button = (Button) button.findViewById(R.id.b73);
                    }
                    else if (i == 7 && j == 4)
                    {
                        button = (Button) button.findViewById(R.id.b74);
                    }
                    else if (i == 7 && j == 5)
                    {
                        button = (Button) button.findViewById(R.id.b75);
                    }
                    else if (i == 7 && j == 6)
                    {
                        button = (Button) button.findViewById(R.id.b76);
                    }
                    else if (i == 7 && j == 7)
                    {
                        button = (Button) button.findViewById(R.id.b77);
                    }


                    button.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                    chessboard[i][j] = selectedField;                    
                }
                else if (chessboard[i][j].equalsIgnoreCase(selectedField))
                {
                    String newName = "" + i + j;

                    chessboard[i][j] = newName;
                }
            }
        }
    }

    // returns the destination X for the turn
    private static float getDestinationX (String destinationField) {
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
    private static float getDestinationY(String destinationField) {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if (chessboard[i][j].equalsIgnoreCase(destinationField)) {
                    return 450 + 139 * i;
                }
            }
        }

        return 1;
    }
}
