package edu.temple.paletteactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;
import android.graphics.Color;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    int curr = 0;
    int colortoPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
       final String[] colors = getResources().getStringArray(R.array.colors_list);

        //creates a variable, relative, and passes in the id of the background of the main layout
        final RelativeLayout relative = (RelativeLayout) findViewById(R.id.activity_main);

        ColorAdapter spinnerAdapter = new ColorAdapter(this, colors);
        spinner.setAdapter(spinnerAdapter);





        Toast.makeText(MainActivity.this, "Select a color from drop-down menu", Toast.LENGTH_LONG).show();
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> adapterView, View view, int position , long l){
                if (position == curr){
                    return;
                }
                else {
                    colortoPass = Color.parseColor(colors[position]);
                    final Intent intent = new Intent(MainActivity.this, CanvasActivity.class);

                    intent.putExtra("color", colortoPass);
                    startActivity(intent);


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                relative.setBackgroundColor(Color.WHITE);


            }
        });

    }
}