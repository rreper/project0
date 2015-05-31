package com.example.work.hellou;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v) {
        final int id = v.getId();
        switch (id) {
            case R.id.buttonSpotifyStreamer:

                Toast.makeText(getApplicationContext(), "Spotify Streamer selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonScoresApp:
                Toast.makeText(getApplicationContext(), "Scores App selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonLibraryApp:
                Toast.makeText(getApplicationContext(), "Library App selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonBuildItBigger:
                Toast.makeText(getApplicationContext(), "Build It Bigger selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonXyzReader:
                Toast.makeText(getApplicationContext(), "XYZ Reader selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonCapstone:
                Toast.makeText(getApplicationContext(), "Capstone Project selected", Toast.LENGTH_SHORT).show();
                break;

        }
    }

}
