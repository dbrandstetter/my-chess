package com.codes.mychess;

// this class is just a storage for some values that should be globally accessible
public class storage {

    // the starting layout of the chessboard which gets updated after every turn
    public static String[][] chessboard = {
            {"rook_black1", "knight_black1", "bishop_black1", "queen_black", "king_black", "bishop_black2", "knight_black2", "rook_black2"},
            {"pawn_black1", "pawn_black2", "pawn_black3", "pawn_black4", "pawn_black5", "pawn_black6", "pawn_black7", "pawn_black8"},
            {"20", "21", "22", "23", "24", "25", "26", "27",},
            {"30", "31", "32", "33", "34", "35", "36", "37",},
            {"40", "41", "42", "43", "44", "45", "46", "47",},
            {"50", "51", "52", "53", "54", "55", "56", "57",},
            {"pawn_white1", "pawn_white2", "pawn_white3", "pawn_white4", "pawn_white5", "pawn_white6", "pawn_white7", "pawn_white8"},
            {"rook_white1", "knight_white1", "bishop_white1", "king_white", "queen_white", "bishop_white2", "knight_white2", "rook_white2"}
    };

    // some important values
    public static String playersTurn = "white";
    public static String selectedField = "";
    public static String playerWhite = "Player 1";
    public static String playerBlack = "Player 2";
    public static short selectionStage = 0;
    public static int turns = 0;
}
