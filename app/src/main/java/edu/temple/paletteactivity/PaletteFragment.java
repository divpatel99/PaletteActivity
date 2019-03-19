package edu.temple.paletteactivity;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;




public class PaletteFragment extends Fragment {

    GridView gridView;
    PaletteInterface parentInt;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one_layout, container, false);
        gridView = (GridView) view.findViewById(R.id.spinner);
        parentInt = (PaletteInterface) getContext();

        //Used for the spanish translation part of the app
        Resources res = getResources();
        final String[] colors = res.getStringArray(R.array.colors_list);
        final String[] actualColors = res.getStringArray(R.array.colorsList);

        final ColorAdapter myAdapter = new ColorAdapter(getActivity(), colors, actualColors);

        gridView.setAdapter(myAdapter);

        AdapterView.OnItemClickListener listListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String color = actualColors[position];
                //Toast.makeText(getContext(), color, Toast.LENGTH_SHORT).show();
                parentInt.changeCanvasColor(color);
            }
        };

        gridView.setOnItemClickListener(listListener);

        return view;
    }

    public interface PaletteInterface {
        void changeCanvasColor(String color);
    }

}

