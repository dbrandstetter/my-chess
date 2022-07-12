package com.codes.mychess;

import static com.codes.mychess.storage.*;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.net.InetSocketAddress;

public class aboutActivity extends AppCompatActivity {

    ActionBar aB;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // sets content view to the about activity
        setContentView(R.layout.activity_about);

        aB = getSupportActionBar();

        // hiding the action bar
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
    }

    public void back (View view)
    {
        // creating a new intent
        Intent intent = new Intent(aboutActivity.this, MainActivity.class);

        // switching to the MainActivity
        aboutActivity.this.startActivity(intent);
    }

    public void buttonClickGitHub (View view)
    {
        Uri uri = Uri.parse("https://github.com/dbrandstetter/MyChess.git");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
