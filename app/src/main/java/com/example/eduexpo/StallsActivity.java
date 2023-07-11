package com.example.eduexpo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StallsActivity extends AppCompatActivity implements View.OnClickListener {
    private Button aviation, health, engineering, management, maritime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stalls);

        aviation = (Button) findViewById(R.id.button1);
        health =  (Button) findViewById(R.id.button2);
        engineering = (Button) findViewById(R.id.button3);
        management = (Button) findViewById(R.id.button4);
        maritime = (Button) findViewById(R.id.button5);

        aviation.setOnClickListener((View.OnClickListener) this);
        health.setOnClickListener((View.OnClickListener) this);
        engineering.setOnClickListener((View.OnClickListener) this);
        management.setOnClickListener((View.OnClickListener) this);
        maritime.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        if (v.getId() == R.id.button1) {
            i = new Intent(this, Aviation.class);
            startActivity(i);
        } else if (v.getId() == R.id.button2) {
            i = new Intent(this, HealthScience.class);
            startActivity(i);
        } else if (v.getId() == R.id.button3) {
            i = new Intent(this, Maritme.class);
            startActivity(i);
        } else if (v.getId() == R.id.button4) {
            i = new Intent(this, Engineering.class);
            startActivity(i);
        }else if (v.getId() == R.id.button5) {
            i = new Intent(this, Management.class);
            startActivity(i);
        }
    }
}