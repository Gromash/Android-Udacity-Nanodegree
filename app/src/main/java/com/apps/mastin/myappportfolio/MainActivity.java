package com.apps.mastin.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Spotify Streamer Button
        Button streamer = (Button)findViewById(R.id.button);
        streamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch the Spotify Streamer app", Toast.LENGTH_SHORT).show();
            }
        });
        //Scores App
        Button scores = (Button)findViewById(R.id.button2);
        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch the Scores app", Toast.LENGTH_SHORT).show();
            }
        });
        //Library App
        Button library = (Button)findViewById(R.id.button3);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch the Library app", Toast.LENGTH_SHORT).show();
            }
        });
        //Build it Bigger
        Button bigger = (Button)findViewById(R.id.button4);
        bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch the Build it Bigger app", Toast.LENGTH_SHORT).show();
            }
        });
        //Bacon Reader
        Button reader = (Button)findViewById(R.id.button5);
        reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch the Bacon Reader app", Toast.LENGTH_SHORT).show();
            }
        });
        //My App :D
        Button myApp = (Button)findViewById(R.id.button6);
        myApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch my capstone app", Toast.LENGTH_SHORT).show();
            }
        });

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
