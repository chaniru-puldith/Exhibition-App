package com.example.eduexpo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Maritme extends AppCompatActivity implements View.OnClickListener {
    private Button btn1, btn2, btn3, btn4, btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maritme);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 =  (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);

        btn1.setOnClickListener((View.OnClickListener) this);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3.setOnClickListener((View.OnClickListener) this);
        btn4.setOnClickListener((View.OnClickListener) this);
        btn5.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        if (v.getId() == R.id.button1) {
            i = new Intent(this, Mar1.class);
            startActivity(i);
        } else if (v.getId() == R.id.button2) {
            i = new Intent(this, Mar1.class);
            startActivity(i);
        } else if (v.getId() == R.id.button3) {
            i = new Intent(this, Mar2.class);
            startActivity(i);
        } else if (v.getId() == R.id.button4) {
            i = new Intent(this, Mar4.class);
            startActivity(i);
        }else if (v.getId() == R.id.button5) {
            i = new Intent(this, Mar3.class);
            startActivity(i);
        }
    }
}