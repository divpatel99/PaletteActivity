package edu.temple.paletteactivity;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.View;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    Context showContent; //passes background info of an app to an component
    String[] colors;
    String[] colorName;


    public ColorAdapter(Context activity, String[] colors, String[] colorName) {
        this.showContent = activity;
        this.colors = colors;
        this.colorName = colorName;



    }

    //returns the total number of items to be displayed in a list
    public int getCount() {
        return colors.length;

    }

    //
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView rows = new TextView(showContent);


        rows.setText(colors[i]);
        rows.setBackgroundColor(Color.parseColor(colors[i]));

        return rows;
    }
}