package com.example.gnitsamica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class qp1_1 extends AppCompatActivity implements View.OnClickListener {
    public CardView card19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qp11);
        card19=(CardView) findViewById(R.id.c19);
        card19.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}