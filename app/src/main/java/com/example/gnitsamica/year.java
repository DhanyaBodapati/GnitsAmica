package com.example.gnitsamica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class year extends AppCompatActivity implements View.OnClickListener {
    public CardView card13,card14,card15,card16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);
        card13=(CardView) findViewById(R.id.c13);
        card13.setOnClickListener(this);
        card14=(CardView) findViewById(R.id.c14);
        card14.setOnClickListener(this);
        card15=(CardView) findViewById(R.id.c15);
        card15.setOnClickListener(this);
        card16=(CardView) findViewById(R.id.c16);
        card16.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId())
        {
            case R.id.c13:
                i=new Intent(this,semester.class);
                startActivity(i);
                break;
            case R.id.c14:
                i=new Intent(this,semester.class);
                startActivity(i);
                break;
            case R.id.c15:
                i=new Intent(this,semester.class);
                startActivity(i);
                break;
            case R.id.c16:
                i=new Intent(this,semester.class);
                startActivity(i);
                break;
        }
    }
}