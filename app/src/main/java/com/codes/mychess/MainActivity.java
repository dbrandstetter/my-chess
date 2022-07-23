package com.codes.mychess;

import static com.codes.mychess.storage.*;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ActionBar aB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // start screen
        setContentView(R.layout.activity_start);

        aB = getSupportActionBar();

        // hiding the action bar
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }

    }

    public void buttonClickName(View view)
    {
        Intent nameIntent = new Intent(MainActivity.this, nameActivity.class);
        MainActivity.this.startActivity(nameIntent);
    }

    public void buttonClickGame(View view)
    {
        chessboard = new String[][]{
                {"rook_black1", "knight_black1", "bishop_black1", "queen_black", "king_black", "bishop_black2", "knight_black2", "rook_black2"},
                {"pawn_black1", "pawn_black2", "pawn_black3", "pawn_black4", "pawn_black5", "pawn_black6", "pawn_black7", "pawn_black8"},
                {"20", "21", "22", "23", "24", "25", "26", "27",},
                {"30", "31", "32", "33", "34", "35", "36", "37",},
                {"40", "41", "42", "43", "44", "45", "46", "47",},
                {"50", "51", "52", "53", "54", "55", "56", "57",},
                {"pawn_white1", "pawn_white2", "pawn_white3", "pawn_white4", "pawn_white5", "pawn_white6", "pawn_white7", "pawn_white8"},
                {"rook_white1", "knight_white1", "bishop_white1", "king_white", "queen_white", "bishop_white2", "knight_white2", "rook_white2"}
        };
        playersTurn = "white";
        selectedField = "";
        selectionStage = 0;
        turns = 0;

        Intent gameIntent = new Intent(MainActivity.this, gameActivity.class);
        MainActivity.this.startActivity(gameIntent);
    }

    public void buttonClickAbout(View view)
    {
        Intent aboutIntent = new Intent(MainActivity.this, aboutActivity.class);
        MainActivity.this.startActivity(aboutIntent);
    }

    public void buttonClickGameRules (View view)
    {
        Uri uri = Uri.parse("https://www.officialgamerules.org/chess");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}