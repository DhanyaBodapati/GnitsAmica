package com.example.gnitsamica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class branches extends AppCompatActivity implements View.OnClickListener {
    public CardView card8,card9,card10,card11,card12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branches);
        card8=(CardView) findViewById(R.id.c8);
        card8.setOnClickListener(this);
        card9=(CardView) findViewById(R.id.c9);
        card9.setOnClickListener(this);
        card10=(CardView) findViewById(R.id.c10);
        card10.setOnClickListener(this);
        card11=(CardView) findViewById(R.id.c11);
        card11.setOnClickListener(this);
        card12=(CardView) findViewById(R.id.c12);
        card12.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId())
        {
            case R.id.c8:
                i=new Intent(this,year.class);
                startActivity(i);
                break;
            case R.id.c9:
                i=new Intent(this,year.class);
                startActivity(i);
                break;
            case R.id.c10:
                i=new Intent(this,year.class);
                startActivity(i);
                break;
            case R.id.c11:
                i=new Intent(this,year.class);
                startActivity(i);
                break;
            case R.id.c12:
                i=new Intent(this,year.class);
                startActivity(i);
                break;
        }
    }
}