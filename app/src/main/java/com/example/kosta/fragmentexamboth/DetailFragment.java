package com.example.kosta.fragmentexamboth;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by kosta on 2017-04-21.
 */

public class DetailFragment extends Fragment {

    public static DetailFragment newInstance(int position) {
        DetailFragment df = new DetailFragment();

        Bundle args = new Bundle();
        args.putInt("position", position);
        df.setArguments(args);
        return df;
    }

    public int getPosition() {
        return getArguments().getInt("position", 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.detail_view, container, false);
        ImageView image = (ImageView)view.findViewById(R.id.image);
        image.setImageResource(ImageInfo.DETAILS[getPosition()]);

        return view;
    }
}
