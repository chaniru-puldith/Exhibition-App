package com.example.eduexpo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class NavigateCampusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate_campus);

        Button gMapBtn = findViewById(R.id.gMap);

        gMapBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("google.navigation:q=6.9157, 79.9605&mode=d"));
                    startActivity(intent);
        });
    }
}