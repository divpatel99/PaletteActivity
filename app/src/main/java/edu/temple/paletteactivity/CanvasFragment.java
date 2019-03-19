package edu.temple.paletteactivity;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


public class CanvasFragment extends Fragment {

    FrameLayout frameLayout;
    FrameLayout canFrame;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two_layout, container, false);

        //frameLayout = (FrameLayout) view.findViewById(R.id.canvas_fragment);
        canFrame = (FrameLayout) view.findViewById(R.id.canvas_frame);

        return view;
    }

    public void changeBackgroundColor(String color) {
        canFrame.setBackgroundColor(Color.parseColor(color));
    }
}