package com.example.blackduste.dinetest1;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeDummy extends AppCompatActivity {

    TextView welcomeTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dummy);

        welcomeTxt = findViewById(R.id.welcomeTxt);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "Fonts/Filxgirl.TTF");
        welcomeTxt.setTypeface(typeface);

    }
}
