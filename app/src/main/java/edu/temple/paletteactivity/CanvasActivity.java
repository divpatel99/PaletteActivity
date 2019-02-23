package edu.temple.paletteactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.content.Intent;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Intent i = getIntent();
        int color = i.getIntExtra("color", -1);

        final RelativeLayout relative = (RelativeLayout) findViewById(R.id.activity_canvas);


           relative.setBackgroundColor(color);





    }


}
