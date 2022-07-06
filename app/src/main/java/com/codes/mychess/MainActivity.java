package com.codes.mychess;

import static com.codes.mychess.turnMethods.enemyHit;
import static com.codes.mychess.turnMethods.removeEnemy;
import static com.codes.mychess.storage.*;
import static com.codes.mychess.isValidTurn.*;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

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

        // game screen
        /*
        final Button new_game = (Button) findViewById(R.id.new_game);
        new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView name_black = (TextView) findViewById(R.id.name_black);
                name_black.setText(playerBlack);
                TextView name_white = (TextView) findViewById(R.id.name_white);
                name_white.setText(playerWhite);

                final Button b00 = (Button) findViewById(R.id.b00);
                b00.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[0][0];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b00 = (Button) findViewById(R.id.b00);
                            b00.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver()
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b01 = (Button) findViewById(R.id.b01);
                b01.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[0][1];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b01 = (Button) findViewById(R.id.b01);
                            b01.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b02 = (Button) findViewById(R.id.b02);
                b02.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[0][2];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b02 = (Button) findViewById(R.id.b02);
                            b02.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b03 = (Button) findViewById(R.id.b03);
                b03.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[0][3];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b03 = (Button) findViewById(R.id.b03);
                            b03.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b04 = (Button) findViewById(R.id.b04);
                b04.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[0][4];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b04 = (Button) findViewById(R.id.b04);
                            b04.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b05 = (Button) findViewById(R.id.b05);
                b05.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[0][5];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b05 = (Button) findViewById(R.id.b05);
                            b05.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b06 = (Button) findViewById(R.id.b06);
                b06.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[0][6];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b06 = (Button) findViewById(R.id.b06);
                            b06.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b07 = (Button) findViewById(R.id.b07);
                b07.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[0][7];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b07 = (Button) findViewById(R.id.b07);
                            b07.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b10 = (Button) findViewById(R.id.b10);
                b10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[1][0];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b10 = (Button) findViewById(R.id.b10);
                            b10.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b11 = (Button) findViewById(R.id.b11);
                b11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[1][1];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b11 = (Button) findViewById(R.id.b11);
                            b11.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b12 = (Button) findViewById(R.id.b12);
                b12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[1][2];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b12 = (Button) findViewById(R.id.b12);
                            b12.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b13 = (Button) findViewById(R.id.b13);
                b13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[1][3];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b13 = (Button) findViewById(R.id.b13);
                            b13.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b14 = (Button) findViewById(R.id.b14);
                b14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[1][4];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b14 = (Button) findViewById(R.id.b14);
                            b14.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b15 = (Button) findViewById(R.id.b15);
                b15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[1][5];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b15 = (Button) findViewById(R.id.b15);
                            b15.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b16 = (Button) findViewById(R.id.b16);
                b16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[1][6];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b16 = (Button) findViewById(R.id.b16);
                            b16.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b17 = (Button) findViewById(R.id.b17);
                b17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[1][7];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b17 = (Button) findViewById(R.id.b17);
                            b17.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b20 = (Button) findViewById(R.id.b20);
                b20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[2][0];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b20 = (Button) findViewById(R.id.b20);
                            b20.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b21 = (Button) findViewById(R.id.b21);
                b21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[2][1];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b21 = (Button) findViewById(R.id.b21);
                            b21.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b22 = (Button) findViewById(R.id.b22);
                b22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[2][2];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b22 = (Button) findViewById(R.id.b22);
                            b22.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b23 = (Button) findViewById(R.id.b23);
                b23.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[2][3];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b23 = (Button) findViewById(R.id.b23);
                            b23.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b24 = (Button) findViewById(R.id.b24);
                b24.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[2][4];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b24 = (Button) findViewById(R.id.b24);
                            b24.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b25 = (Button) findViewById(R.id.b25);
                b25.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[2][5];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b25 = (Button) findViewById(R.id.b25);
                            b25.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b26 = (Button) findViewById(R.id.b26);
                b26.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[2][6];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b26 = (Button) findViewById(R.id.b26);
                            b26.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b27 = (Button) findViewById(R.id.b27);
                b27.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[2][7];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b27 = (Button) findViewById(R.id.b27);
                            b27.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b30 = (Button) findViewById(R.id.b30);
                b30.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[3][0];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b30 = (Button) findViewById(R.id.b30);
                            b30.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b31 = (Button) findViewById(R.id.b31);
                b31.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[3][1];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b31 = (Button) findViewById(R.id.b31);
                            b31.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b32 = (Button) findViewById(R.id.b32);
                b32.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[3][2];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b32 = (Button) findViewById(R.id.b32);
                            b32.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b33 = (Button) findViewById(R.id.b33);
                b33.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[3][3];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b33 = (Button) findViewById(R.id.b33);
                            b33.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b34 = (Button) findViewById(R.id.b34);
                b34.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[3][4];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b34 = (Button) findViewById(R.id.b34);
                            b34.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b35 = (Button) findViewById(R.id.b35);
                b35.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[3][5];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b35 = (Button) findViewById(R.id.b35);
                            b35.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b36 = (Button) findViewById(R.id.b36);
                b36.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[3][6];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b36 = (Button) findViewById(R.id.b36);
                            b36.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b37 = (Button) findViewById(R.id.b37);
                b37.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[3][7];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b37 = (Button) findViewById(R.id.b37);
                            b37.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b40 = (Button) findViewById(R.id.b40);
                b40.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[4][0];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b40 = (Button) findViewById(R.id.b40);
                            b40.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b41 = (Button) findViewById(R.id.b41);
                b41.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[4][1];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b41 = (Button) findViewById(R.id.b41);
                            b41.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b42 = (Button) findViewById(R.id.b42);
                b42.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[4][2];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b42 = (Button) findViewById(R.id.b42);
                            b42.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b43 = (Button) findViewById(R.id.b43);
                b43.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[4][3];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b43 = (Button) findViewById(R.id.b43);
                            b43.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b44 = (Button) findViewById(R.id.b44);
                b44.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[4][4];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b44 = (Button) findViewById(R.id.b44);
                            b44.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b45 = (Button) findViewById(R.id.b45);
                b45.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[4][5];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b45 = (Button) findViewById(R.id.b45);
                            b45.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b46 = (Button) findViewById(R.id.b46);
                b46.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[4][6];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b46 = (Button) findViewById(R.id.b46);
                            b46.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b47 = (Button) findViewById(R.id.b47);
                b47.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[4][7];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b47 = (Button) findViewById(R.id.b47);
                            b47.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b50 = (Button) findViewById(R.id.b50);
                b50.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[5][0];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b50 = (Button) findViewById(R.id.b50);
                            b50.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b51 = (Button) findViewById(R.id.b51);
                b51.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[5][1];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b51 = (Button) findViewById(R.id.b51);
                            b51.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b52 = (Button) findViewById(R.id.b52);
                b52.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[5][2];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b52 = (Button) findViewById(R.id.b52);
                            b52.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b53 = (Button) findViewById(R.id.b53);
                b53.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[5][3];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b53 = (Button) findViewById(R.id.b53);
                            b53.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b54 = (Button) findViewById(R.id.b54);
                b54.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[5][4];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b54 = (Button) findViewById(R.id.b54);
                            b54.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b55 = (Button) findViewById(R.id.b55);
                b55.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[5][5];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b55 = (Button) findViewById(R.id.b55);
                            b55.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b56 = (Button) findViewById(R.id.b56);
                b56.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[5][6];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b56 = (Button) findViewById(R.id.b56);
                            b56.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b57 = (Button) findViewById(R.id.b57);
                b57.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[5][7];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b57 = (Button) findViewById(R.id.b57);
                            b57.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b60 = (Button) findViewById(R.id.b60);
                b60.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[6][0];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b60 = (Button) findViewById(R.id.b60);
                            b60.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b61 = (Button) findViewById(R.id.b61);
                b61.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[6][1];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b61 = (Button) findViewById(R.id.b61);
                            b61.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b62 = (Button) findViewById(R.id.b62);
                b62.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[6][2];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b62 = (Button) findViewById(R.id.b62);
                            b62.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b63 = (Button) findViewById(R.id.b63);
                b63.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[6][3];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b63 = (Button) findViewById(R.id.b63);
                            b63.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b64 = (Button) findViewById(R.id.b64);
                b64.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[6][4];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b64 = (Button) findViewById(R.id.b64);
                            b64.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b65 = (Button) findViewById(R.id.b65);
                b65.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[6][5];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b65 = (Button) findViewById(R.id.b65);
                            b65.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b66 = (Button) findViewById(R.id.b66);
                b66.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[6][6];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b66 = (Button) findViewById(R.id.b66);
                            b66.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b67 = (Button) findViewById(R.id.b67);
                b67.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[6][7];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b67 = (Button) findViewById(R.id.b67);
                            b67.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b70 = (Button) findViewById(R.id.b70);
                b70.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[7][0];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b70 = (Button) findViewById(R.id.b70);
                            b70.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b71 = (Button) findViewById(R.id.b71);
                b71.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[7][1];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b71 = (Button) findViewById(R.id.b71);
                            b71.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b72 = (Button) findViewById(R.id.b72);
                b72.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[7][2];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b72 = (Button) findViewById(R.id.b72);
                            b72.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b73 = (Button) findViewById(R.id.b73);
                b73.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[7][3];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b73 = (Button) findViewById(R.id.b73);
                            b73.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b74 = (Button) findViewById(R.id.b74);
                b74.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[7][4];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b74 = (Button) findViewById(R.id.b74);
                            b74.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b75 = (Button) findViewById(R.id.b75);
                b75.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[7][5];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b75 = (Button) findViewById(R.id.b75);
                            b75.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b76 = (Button) findViewById(R.id.b76);
                b76.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[7][6];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b76 = (Button) findViewById(R.id.b76);
                            b76.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });

                final Button b77 = (Button) findViewById(R.id.b77);
                b77.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // make the error message from the previous move invisible again
                        ImageView error_message = (ImageView) findViewById(R.id.error_message);
                        error_message.setVisibility(View.INVISIBLE);

                        // get name of the chess figure or field clicked
                        String nameOfField = chessboard[7][7];

                        // if the player only wants to select a figure
                        if (selectionStage == 0 && validSelection(nameOfField)) {
                            // the previous turn is done so all fields must not be highlighted green again
                            Button b00 = (Button) findViewById(R.id.b00);
                            Button b01 = (Button) findViewById(R.id.b01);
                            Button b02 = (Button) findViewById(R.id.b02);
                            Button b03 = (Button) findViewById(R.id.b03);
                            Button b04 = (Button) findViewById(R.id.b04);
                            Button b05 = (Button) findViewById(R.id.b05);
                            Button b06 = (Button) findViewById(R.id.b06);
                            Button b07 = (Button) findViewById(R.id.b07);
                            Button b10 = (Button) findViewById(R.id.b10);
                            Button b11 = (Button) findViewById(R.id.b11);
                            Button b12 = (Button) findViewById(R.id.b12);
                            Button b13 = (Button) findViewById(R.id.b13);
                            Button b14 = (Button) findViewById(R.id.b14);
                            Button b15 = (Button) findViewById(R.id.b15);
                            Button b16 = (Button) findViewById(R.id.b16);
                            Button b17 = (Button) findViewById(R.id.b17);
                            Button b20 = (Button) findViewById(R.id.b20);
                            Button b21 = (Button) findViewById(R.id.b21);
                            Button b22 = (Button) findViewById(R.id.b22);
                            Button b23 = (Button) findViewById(R.id.b23);
                            Button b24 = (Button) findViewById(R.id.b24);
                            Button b25 = (Button) findViewById(R.id.b25);
                            Button b26 = (Button) findViewById(R.id.b26);
                            Button b27 = (Button) findViewById(R.id.b27);
                            Button b30 = (Button) findViewById(R.id.b30);
                            Button b31 = (Button) findViewById(R.id.b31);
                            Button b32 = (Button) findViewById(R.id.b32);
                            Button b33 = (Button) findViewById(R.id.b33);
                            Button b34 = (Button) findViewById(R.id.b34);
                            Button b35 = (Button) findViewById(R.id.b35);
                            Button b36 = (Button) findViewById(R.id.b36);
                            Button b37 = (Button) findViewById(R.id.b37);
                            Button b40 = (Button) findViewById(R.id.b40);
                            Button b41 = (Button) findViewById(R.id.b41);
                            Button b42 = (Button) findViewById(R.id.b42);
                            Button b43 = (Button) findViewById(R.id.b43);
                            Button b44 = (Button) findViewById(R.id.b44);
                            Button b45 = (Button) findViewById(R.id.b45);
                            Button b46 = (Button) findViewById(R.id.b46);
                            Button b47 = (Button) findViewById(R.id.b47);
                            Button b50 = (Button) findViewById(R.id.b50);
                            Button b51 = (Button) findViewById(R.id.b51);
                            Button b52 = (Button) findViewById(R.id.b52);
                            Button b53 = (Button) findViewById(R.id.b53);
                            Button b54 = (Button) findViewById(R.id.b54);
                            Button b55 = (Button) findViewById(R.id.b55);
                            Button b56 = (Button) findViewById(R.id.b56);
                            Button b57 = (Button) findViewById(R.id.b57);
                            Button b60 = (Button) findViewById(R.id.b60);
                            Button b61 = (Button) findViewById(R.id.b61);
                            Button b62 = (Button) findViewById(R.id.b62);
                            Button b63 = (Button) findViewById(R.id.b63);
                            Button b64 = (Button) findViewById(R.id.b64);
                            Button b65 = (Button) findViewById(R.id.b65);
                            Button b66 = (Button) findViewById(R.id.b66);
                            Button b67 = (Button) findViewById(R.id.b67);
                            Button b70 = (Button) findViewById(R.id.b70);
                            Button b71 = (Button) findViewById(R.id.b71);
                            Button b72 = (Button) findViewById(R.id.b72);
                            Button b73 = (Button) findViewById(R.id.b73);
                            Button b74 = (Button) findViewById(R.id.b74);
                            Button b75 = (Button) findViewById(R.id.b75);
                            Button b76 = (Button) findViewById(R.id.b76);
                            Button b77 = (Button) findViewById(R.id.b77);

                            b00.setBackgroundColor(Color.parseColor("#00000000"));
                            b01.setBackgroundColor(Color.parseColor("#00000000"));
                            b02.setBackgroundColor(Color.parseColor("#00000000"));
                            b03.setBackgroundColor(Color.parseColor("#00000000"));
                            b04.setBackgroundColor(Color.parseColor("#00000000"));
                            b05.setBackgroundColor(Color.parseColor("#00000000"));
                            b06.setBackgroundColor(Color.parseColor("#00000000"));
                            b07.setBackgroundColor(Color.parseColor("#00000000"));
                            b10.setBackgroundColor(Color.parseColor("#00000000"));
                            b11.setBackgroundColor(Color.parseColor("#00000000"));
                            b12.setBackgroundColor(Color.parseColor("#00000000"));
                            b13.setBackgroundColor(Color.parseColor("#00000000"));
                            b14.setBackgroundColor(Color.parseColor("#00000000"));
                            b15.setBackgroundColor(Color.parseColor("#00000000"));
                            b16.setBackgroundColor(Color.parseColor("#00000000"));
                            b17.setBackgroundColor(Color.parseColor("#00000000"));
                            b20.setBackgroundColor(Color.parseColor("#00000000"));
                            b21.setBackgroundColor(Color.parseColor("#00000000"));
                            b22.setBackgroundColor(Color.parseColor("#00000000"));
                            b23.setBackgroundColor(Color.parseColor("#00000000"));
                            b24.setBackgroundColor(Color.parseColor("#00000000"));
                            b25.setBackgroundColor(Color.parseColor("#00000000"));
                            b26.setBackgroundColor(Color.parseColor("#00000000"));
                            b27.setBackgroundColor(Color.parseColor("#00000000"));
                            b30.setBackgroundColor(Color.parseColor("#00000000"));
                            b31.setBackgroundColor(Color.parseColor("#00000000"));
                            b32.setBackgroundColor(Color.parseColor("#00000000"));
                            b33.setBackgroundColor(Color.parseColor("#00000000"));
                            b34.setBackgroundColor(Color.parseColor("#00000000"));
                            b35.setBackgroundColor(Color.parseColor("#00000000"));
                            b36.setBackgroundColor(Color.parseColor("#00000000"));
                            b37.setBackgroundColor(Color.parseColor("#00000000"));
                            b40.setBackgroundColor(Color.parseColor("#00000000"));
                            b41.setBackgroundColor(Color.parseColor("#00000000"));
                            b42.setBackgroundColor(Color.parseColor("#00000000"));
                            b43.setBackgroundColor(Color.parseColor("#00000000"));
                            b44.setBackgroundColor(Color.parseColor("#00000000"));
                            b45.setBackgroundColor(Color.parseColor("#00000000"));
                            b46.setBackgroundColor(Color.parseColor("#00000000"));
                            b47.setBackgroundColor(Color.parseColor("#00000000"));
                            b50.setBackgroundColor(Color.parseColor("#00000000"));
                            b51.setBackgroundColor(Color.parseColor("#00000000"));
                            b52.setBackgroundColor(Color.parseColor("#00000000"));
                            b53.setBackgroundColor(Color.parseColor("#00000000"));
                            b54.setBackgroundColor(Color.parseColor("#00000000"));
                            b55.setBackgroundColor(Color.parseColor("#00000000"));
                            b56.setBackgroundColor(Color.parseColor("#00000000"));
                            b57.setBackgroundColor(Color.parseColor("#00000000"));
                            b60.setBackgroundColor(Color.parseColor("#00000000"));
                            b61.setBackgroundColor(Color.parseColor("#00000000"));
                            b62.setBackgroundColor(Color.parseColor("#00000000"));
                            b63.setBackgroundColor(Color.parseColor("#00000000"));
                            b64.setBackgroundColor(Color.parseColor("#00000000"));
                            b65.setBackgroundColor(Color.parseColor("#00000000"));
                            b66.setBackgroundColor(Color.parseColor("#00000000"));
                            b67.setBackgroundColor(Color.parseColor("#00000000"));
                            b70.setBackgroundColor(Color.parseColor("#00000000"));
                            b71.setBackgroundColor(Color.parseColor("#00000000"));
                            b72.setBackgroundColor(Color.parseColor("#00000000"));
                            b73.setBackgroundColor(Color.parseColor("#00000000"));
                            b74.setBackgroundColor(Color.parseColor("#00000000"));
                            b75.setBackgroundColor(Color.parseColor("#00000000"));
                            b76.setBackgroundColor(Color.parseColor("#00000000"));
                            b77.setBackgroundColor(Color.parseColor("#00000000"));

                            // the background is turned light green and the selected field is stored
                            b77 = (Button) findViewById(R.id.b77);
                            b77.setBackgroundColor(Color.parseColor("#A9B3FC86"));

                            selectedField = nameOfField;
                            selectionStage = 1;
                        }
                        // or when he wants to set the destination of his selected figure
                        else if (selectionStage == 1 && validDestination(nameOfField)) {
                            // checks whether an enemy was hit and removes its image if necessary
                            if (enemyHit(nameOfField)) {
                                removeEnemy(nameOfField);
                            }

                            // moves the figure from one field to another
                            // moveFigure(nameOfField);

                            // checks if the game is over by looking up the kings
                            // if (isGameOver())
                            // {
                            // gets the player who won and displays a win message
                            // String victorious = getWinner();
                            // showWinner(victorious);
                            // }

                            // marks that a new turn can start
                            selectionStage = 0;
                            // switchTurns();

                            // increments the turns
                            turns++;

                            // increments the turns
                            turns++;
                        }
                        // when the selected field isn't a valid option
                        else {
                            error_message.setVisibility(View.VISIBLE);
                        }
                    }
                });
            }
        });
        */

    }

    public void buttonClickName(View view)
    {
        Intent nameIntent = new Intent(MainActivity.this, nameActivity.class);
        MainActivity.this.startActivity(nameIntent);
    }

    public void buttonClickGame(View view)
    {
        Intent gameIntent = new Intent(MainActivity.this, gameActivity.class);
        MainActivity.this.startActivity(gameIntent);
    }

    public void buttonClickAbout(View view)
    {
        Intent aboutIntent = new Intent(MainActivity.this, aboutActivity.class);
        MainActivity.this.startActivity(aboutIntent);
    }
}