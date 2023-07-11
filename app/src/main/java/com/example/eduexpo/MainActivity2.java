package com.example.eduexpo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Build;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private CardView  gMap, qr, stalls, about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Setting up slideshow on main menu
        ImageSlider imageSlider = findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.first, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.second, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.third, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.fourth, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        gMap = (CardView) findViewById(R.id.Map);
        qr =  (CardView) findViewById(R.id.qrscaner);
        stalls = (CardView) findViewById(R.id.stalls);
        about = (CardView) findViewById(R.id.about);
        gMap.setOnClickListener((View.OnClickListener) this);
        stalls.setOnClickListener((View.OnClickListener) this);
        qr.setOnClickListener((View.OnClickListener) this);
        about.setOnClickListener((View.OnClickListener) this);

    }


    @Override
    public void onClick(View v) {
        Intent i;
        if (v.getId() == R.id.Map) {
            i = new Intent(this, NavigateCampusActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.qrscaner) {
            i = new Intent(this, QRScannerActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.about) {
            i = new Intent(this, aboutus.class);
            startActivity(i);
        } else if (v.getId() == R.id.stalls) {
            i = new Intent(this, StallsActivity.class);
            startActivity(i);
        }
    }
}