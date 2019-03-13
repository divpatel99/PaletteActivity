package edu.temple.paletteactivity;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;

public class PaletteFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance ){
        View view = inflater.inflate(R.layout.fragment_one,container,false);
        return view;
    }
}
