package com.codes.mychess;

import static com.codes.mychess.storage.*;

public class specificMovingRules
{
    public static boolean knight (String destinationField)
    {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if (chessboard[i][j].equalsIgnoreCase(selectedField)) {
                    for (int k = 0; k < chessboard.length; k++) {
                        for (int l = 0; l < chessboard.length; l++) {
                            if (chessboard[k][l].equalsIgnoreCase(destinationField)) {
                                if (l == j - 2 && k == i - 1)
                                    return true;
                                else if (l == j - 2 && k == i + 1)
                                    return true;
                                else if (l == j - 1 && k == i - 2)
                                    return true;
                                else if (l == j - 1 && k == i + 2)
                                    return true;
                                else if (l == j + 1 && k == i - 2)
                                    return true;
                                else if (l == j + 1 && k == i + 2)
                                    return true;
                                else if (l == j + 2 && k == i - 1)
                                    return true;
                                else if (l == j + 2 && k == i + 1)
                                    return true;

                                return false;
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

    public static boolean bishop (String destinationField)
    {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if (chessboard[i][j].equalsIgnoreCase(selectedField)) {
                    for (int k = 0; k < chessboard.length; k++) {
                        for (int l = 0; l < chessboard.length; l++) {
                            if (chessboard[k][l].equalsIgnoreCase(destinationField)) {
                                // if the destination field is on a diagonal path
                                if (Math.abs(i - k) == Math.abs(j - l)) {
                                    // checks if the way to the destination is free (there are no figures between)
                                    // -->
                                    // the diagonal paths:
                                    // left-upper
                                    if (k < i && l < j) {
                                        for (int m = 1; m < Math.abs(i - k); m++) {
                                            if (chessboard[i - m][j - m].length() != 2) {
                                                return false;
                                            }
                                        }
                                    }
                                    // right-upper
                                    else if (k < i && l > j) {
                                        for (int m = 1; m < Math.abs(i - k); m++) {
                                            if (chessboard[i - m][j + m].length() != 2) {
                                                return false;
                                            }
                                        }
                                    }
                                    // right-lower
                                    else if (k > i && l > j) {
                                        for (int m = 1; m < Math.abs(i - k); m++) {
                                            if (chessboard[i + m][j + m].length() != 2) {
                                                return false;
                                            }
                                        }
                                    }
                                    // left-lower
                                    else if (k > i && l < j) {
                                        for (int m = 1; m < Math.abs(i - k); m++) {
                                            if (chessboard[i + m][j - m].length() != 2) {
                                                return false;
                                            }
                                        }
                                    }

                                    return true;
                                } else
                                    return false;
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

    public static boolean queen (String destinationField)
    {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if (chessboard[i][j].equalsIgnoreCase(selectedField)) {
                    for (int k = 0; k < chessboard.length; k++) {
                        for (int l = 0; l < chessboard.length; l++) {
                            if (chessboard[k][l].equalsIgnoreCase(destinationField)) {
                                // if the destination field is on a diagonal path
                                if (Math.abs(i - k) == Math.abs(j - l)) {
                                    // checks if the way to the destination is free (there are no figures between)
                                    // -->
                                    // the diagonal paths:
                                    // left-upper
                                    if (k < i && l < j) {
                                        for (int m = 1; m < Math.abs(i - k); m++) {
                                            if (chessboard[i - m][j - m].length() != 2) {
                                                return false;
                                            }
                                        }
                                    }
                                    // right-upper
                                    else if (k < i && l > j) {
                                        for (int m = 1; m < Math.abs(i - k); m++) {
                                            if (chessboard[i - m][j + m].length() != 2) {
                                                return false;
                                            }
                                        }
                                    }
                                    // right-lower
                                    else if (k > i && l > j) {
                                        for (int m = 1; m < Math.abs(i - k); m++) {
                                            if (chessboard[i + m][j + m].length() != 2) {
                                                return false;
                                            }
                                        }
                                    }
                                    // left-lower
                                    else if (k > i && l < j) {
                                        for (int m = 1; m < Math.abs(i - k); m++) {
                                            if (chessboard[i + m][j - m].length() != 2) {
                                                return false;
                                            }
                                        }
                                    }

                                    return true;
                                }

                                // else if the destination is on a straight path
                                if (i == k || j == l) {
                                    // the straight paths:
                                    // to the right
                                    if (l > j) {
                                        for (int m = j + 1; m < l; m++) {
                                            if (chessboard[k][m].length() != 2)
                                                return false;
                                        }
                                    }
                                    // the the left
                                    else if (l < j) {
                                        for (int m = j - 1; m > l; m--) {
                                            if (chessboard[k][m].length() != 2)
                                                return false;
                                        }
                                    }
                                    // under
                                    else if (k > i) {
                                        for (int m = i + 1; m < k; m++) {
                                            if (chessboard[m][j].length() != 2)
                                                return false;
                                        }
                                    }
                                    // above
                                    else if (k < i) {
                                        for (int m = i - 1; m > k; m--) {
                                            if (chessboard[m][j].length() != 2)
                                                return false;
                                        }
                                    }

                                    return true;
                                }

                                return false;
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

    public static boolean king (String destinationField)
    {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if (chessboard[i][j].equalsIgnoreCase(selectedField)) {
                    for (int k = 0; k < chessboard.length; k++) {
                        for (int l = 0; l < chessboard.length; l++) {
                            if (chessboard[k][l].equalsIgnoreCase(destinationField)) {
                                if (k == i && l == j + 1)
                                    return true;
                                else if (k == i && l == j - 1)
                                    return true;
                                else if (k == i + 1 && j == l)
                                    return true;
                                else if (k == i - 1 && j == l)
                                    return true;
                                else if (k == i + 1 && j == l + 1)
                                    return true;
                                else if (k == i + 1 && j == l - 1)
                                    return true;
                                else if (k == i - 1 && j == l + 1)
                                    return true;
                                else if (k == i - 1 && j == l - 1)
                                    return true;

                                return false;
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

    public static boolean pawn (String destinationField)
    {
        if (selectedField.substring(0,selectedField.length()-1).equalsIgnoreCase("pawn_white"))
        {
            for (int i = 0; i < chessboard.length; i++)
            {
                for (int j = 0; j < chessboard.length; j++)
                {
                    if (chessboard[i][j].equalsIgnoreCase(selectedField))
                    {
                        for (int k = 0; k < chessboard.length; k++)
                        {
                            for (int l = 0; l < chessboard.length; l++)
                            {
                                if (chessboard[k][l].equalsIgnoreCase(destinationField))
                                {
                                    // the player wants to hit an enemy
                                    if ((l == j - 1 || l == j + 1) && k == i - 1)
                                    {
                                        if (chessboard[k][l].length() != 2)
                                            return true;
                                    }
                                    // the player wants to move the pawn by two fields on the first move
                                    if (i == 6 && j == l && k == 4 && chessboard[k][l].length() == 2)
                                        return true;

                                    // the player wants to make a regular move by one field
                                    if (j == l && i == k + 1 && chessboard[k][l].length() == 2)
                                        return true;

                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        // else it is a black pawn
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if (chessboard[i][j].equalsIgnoreCase(selectedField)) {
                    for (int k = 0; k < chessboard.length; k++) {
                        for (int l = 0; l < chessboard.length; l++) {
                            if (chessboard[k][l].equalsIgnoreCase(destinationField)) {
                                // the player wants to hit an enemy
                                if ((l == j - 1 || l == j + 1) && k == i + 1) {
                                    if (chessboard[k][l].length() != 2)
                                        return true;
                                }
                                // the player wants to move the pawn by two fields on the first move
                                if (i == 1 && j == l && k == 3 && chessboard[k][l].length() == 2)
                                    return true;

                                // the player wants to make a regular move by one field
                                if (j == l && i == k - 1 && chessboard[k][l].length() == 2)
                                    return true;

                                return false;
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

    public static boolean rook (String destinationField)
    {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if (chessboard[i][j].equalsIgnoreCase(selectedField)) {
                    for (int k = 0; k < chessboard.length; k++) {
                        for (int l = 0; l < chessboard.length; l++) {
                            if (chessboard[k][l].equalsIgnoreCase(destinationField)) {
                                if (i != k && j != l)
                                    return false;

                                // checks if the way to the destination is free (there are no figures between)
                                // -->
                                // to the right
                                if (l > j)
                                {
                                    for (int m = j + 1; m < l; m++) {
                                        if (chessboard[k][m].length() != 2)
                                            return false;
                                    }
                                }
                                // the the left
                                else if (l < j)
                                {
                                    for (int m = j - 1; m > l; m--) {
                                        if (chessboard[k][m].length() != 2)
                                            return false;
                                    }
                                }
                                // under
                                else if (k > i)
                                {
                                    for (int m = i + 1; m < k; m++) {
                                        if (chessboard[m][j].length() != 2)
                                            return false;
                                    }
                                }
                                // above
                                else if (k < i)
                                {
                                    for (int m = i - 1; m > k; m--) {
                                        if (chessboard[m][j].length() != 2)
                                            return false;
                                    }
                                }

                                return true;
                            }
                        }
                    }
                }
            }
        }

        return false;
    }
}
