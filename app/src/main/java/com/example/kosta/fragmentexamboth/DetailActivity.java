package com.example.kosta.fragmentexamboth;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by kosta on 2017-04-21.
 */

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DetailFragment df = new DetailFragment();
        df.setArguments(getIntent().getExtras());
        getFragmentManager().beginTransaction().add(android.R.id.content, df).commit();
    }
}
