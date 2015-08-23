package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Button mSpotify;
    private Button mScoreApp;
    private Button mLibraryApp;
    private Button mBuildItBigger;
    private Button mXyzReader;
    private Button mCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        mSpotify = (Button) findViewById(R.id.spotify_btn_id);
        mScoreApp = (Button) findViewById(R.id.score_btn_id);
        mLibraryApp = (Button) findViewById(R.id.library_btn_id);
        mBuildItBigger = (Button) findViewById(R.id.build_it_bigger_btn_id);
        mXyzReader = (Button) findViewById(R.id.xyz_reader_btn_id);
        mCapstone = (Button) findViewById(R.id.capstone_btn_id);

        if(mSpotify.isPressed()){
            Toast.makeText(MainActivity.this, getString(R.string.spotify_message), Toast.LENGTH_LONG).show();
        }else if(mScoreApp.isPressed()){
            Toast.makeText(MainActivity.this, getString(R.string.score_message), Toast.LENGTH_LONG).show();
        }else if(mLibraryApp.isPressed()){
            Toast.makeText(MainActivity.this, getString(R.string.library_message), Toast.LENGTH_LONG).show();
        }else if(mBuildItBigger.isPressed()){
            Toast.makeText(MainActivity.this, getString(R.string.build_it_bigger_message), Toast.LENGTH_LONG).show();
        }else if(mXyzReader.isPressed()){
            Toast.makeText(MainActivity.this, getString(R.string.xyz_reader_message), Toast.LENGTH_LONG).show();
        }else if(mCapstone.isPressed()){
            Toast.makeText(MainActivity.this, getString(R.string.capstone_message), Toast.LENGTH_LONG).show();
        }

    }
}
