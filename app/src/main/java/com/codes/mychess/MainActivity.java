package com.codes.mychess;

import static com.codes.mychess.turnMethods.enemyHit;
import static com.codes.mychess.storage.*;
import static com.codes.mychess.isValidTurn.*;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
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

    public void buttonClickGameRules (View view)
    {
        Uri uri = Uri.parse("https://www.officialgamerules.org/chess");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}