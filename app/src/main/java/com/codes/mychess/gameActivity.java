package com.codes.mychess;

import static com.codes.mychess.isValidTurn.validDestination;
import static com.codes.mychess.isValidTurn.validSelection;
import static com.codes.mychess.storage.chessboard;
import static com.codes.mychess.storage.playerBlack;
import static com.codes.mychess.storage.playerWhite;
import static com.codes.mychess.storage.selectedField;
import static com.codes.mychess.storage.selectionStage;
import static com.codes.mychess.storage.turns;
import static com.codes.mychess.turnMethods.enemyHit;
import static com.codes.mychess.turnMethods.removeEnemy;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class gameActivity extends AppCompatActivity {

    ActionBar aB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // sets content view to the game activity
        setContentView(R.layout.activity_game);

        aB = getSupportActionBar();

        // hiding the action bar
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }

        // displays the names that the users have chosen for them
        TextView name_black = (TextView) findViewById(R.id.name_black);
        name_black.setText(playerBlack);

        TextView name_white = (TextView) findViewById(R.id.name_white);
        name_white.setText(playerWhite);


    }

    public void buttonBack(View view) {
        // creating a new intent
        Intent intent = new Intent(gameActivity.this, MainActivity.class);

        // switching to the MainActivity
        gameActivity.this.startActivity(intent);
    }
}


