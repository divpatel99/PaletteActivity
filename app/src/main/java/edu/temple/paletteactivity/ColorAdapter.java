package edu.temple.paletteactivity;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    Context showContent; //passes background info of an app to an component
    String[] colors;
    LayoutInflater inflater;

    public ColorAdapter(Context activity, String[] colors) {
        this.showContent = activity;

        this.colors = colors;

        // used to get the View object which you define in a layout xml (the root object like RelativeLayout)
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

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

        if (view != null) {
            rows = (TextView) view;

        } else {
            rows = new TextView(showContent);
        }


        rows.setText(colors[i]);


        return rows;
    }
}