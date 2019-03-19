package edu.temple.paletteactivity;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.graphics.Color;



public class PaletteFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance ){
        View view = inflater.inflate(R.layout.fragment_one_layout,container,false);


        return view;
    }
}
