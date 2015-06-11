package com.apps.mastin.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *BUTTONS ON MAIN ACTIVITY
     **/
    //Spotify Streamer Button
    public void clickOnStreamerButton(View view){
        ToastText(getResources().getString(R.string.toast_mediaStreamer));
    }
    //Scores App
    public void clickOnScoresAppButton(View view){
        ToastText(getResources().getString(R.string.toast_duo1));
    }
    //Library App
    public void  clickOnLibraryAppButton(View view){
        ToastText(getResources().getString(R.string.toast_duo2));
    }
    //Build it Bigger
    public void clickOnBiggerAppButon(View view){
        ToastText(getResources().getString(R.string.toast_terminator));
    }
    //Bacon Reader
    public void clickOnBaconReaderAppButton(View view){
        ToastText(getResources().getString(R.string.toast_baconReader));
    }
    //My App :D
    public void clickOnCapstoneAppButton(View view){
        ToastText(getResources().getString(R.string.toast_capstone));
    }

    void ToastText(String s){
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
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
}
