package edu.temple.paletteactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;
import android.graphics.Color;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] colors = {

                "WHITE",
                "BLUE",
                "LIGHTGRAY",
                "Gray",
                "DARKGRAY",
                "GREEN",
                "RED",
                "YELLOW",
                "MAGENTA",
                "CYAN"

        };




        final Spinner spinner = (Spinner) findViewById(R.id.spinner);

        //creates a variable, relative, and passes in the id of the background of the main layout
        final RelativeLayout relative = (RelativeLayout) findViewById(R.id.activity_main);

        ColorAdapter spinnerAdapter = new ColorAdapter(this, colors);
        spinner.setAdapter(spinnerAdapter);





        Toast.makeText(MainActivity.this, "Select a color from drop-down menu", Toast.LENGTH_LONG).show();
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> adapterView, View view, int position , long l){

                //changes the background of the main layout using parsecolor which takes in a string value and picks a
                //colors based on it

                relative.setBackgroundColor(Color.parseColor(colors[position]));


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                relative.setBackgroundColor(Color.WHITE);


            }
        });

    }
}