package com.example.eduexpo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StallsActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView aviation, health, engineering, management, maritime, it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stalls);

        aviation = (CardView) findViewById(R.id.button1);
        health =  (CardView) findViewById(R.id.button2);
        engineering = (CardView) findViewById(R.id.button3);
        management = (CardView) findViewById(R.id.button4);
        maritime = (CardView) findViewById(R.id.button5);
        it = (CardView) findViewById(R.id.button6);

        aviation.setOnClickListener((View.OnClickListener) this);
        health.setOnClickListener((View.OnClickListener) this);
        engineering.setOnClickListener((View.OnClickListener) this);
        management.setOnClickListener((View.OnClickListener) this);
        maritime.setOnClickListener((View.OnClickListener) this);
        it.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        if (v.getId() == R.id.button1) {
            i = new Intent(this, IT.class);
            startActivity(i);
        } else if (v.getId() == R.id.button2) {
            i = new Intent(this, HealthScience.class);
            startActivity(i);
        } else if (v.getId() == R.id.button3) {
            i = new Intent(this, Maritme.class);
            startActivity(i);
        } else if (v.getId() == R.id.button4) {
            i = new Intent(this, Management.class);
            startActivity(i);
        } else if (v.getId() == R.id.button5) {
            i = new Intent(this, Engineering.class);
            startActivity(i);
        } else if (v.getId() == R.id.button6) {
            i = new Intent(this, Aviation.class);
            startActivity(i);
        }
    }
}