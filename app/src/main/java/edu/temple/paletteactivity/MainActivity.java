package edu.temple.paletteactivity;

import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import android.graphics.Color;



public class MainActivity extends AppCompatActivity {
    int curr = 0;
    int colortoPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final String[] colors = getResources().getStringArray(R.array.colorsList);
       String[] colorList = getResources().getStringArray(R.array.colors_list);



        //creates a variable, relative, and passes in the id of the background of the main layout
         final ConstraintLayout cons = (ConstraintLayout) findViewById(R.id.fragment_second);

        ColorAdapter spinnerAdapter = new ColorAdapter(this, colors,colorList);
        spinner.setAdapter(spinnerAdapter);


 

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == curr) {
                   cons.setBackgroundColor(Color.WHITE);
                    return;
                } else {
                    cons.setBackgroundColor(Color.parseColor(colors[position]));
                 //   colortoPass = Color.parseColor(colors[position]);


                  //  final Intent intent = new Intent(MainActivity.this, CanvasActivity.class);

                  //  intent.putExtra("color", colortoPass);
                 //   startActivity(intent);


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                cons.setBackgroundColor(Color.WHITE);

            }
        });



   }
}