package com.example.gnitsamica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questionpapers extends AppCompatActivity implements View.OnClickListener {
    public CardView card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionpapers);
        card6=(CardView) findViewById(R.id.c6);
        card6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId())
        {
            case R.id.c6:
                i=new Intent(this,branches.class);
                startActivity(i);
                break;
        }
    }
}