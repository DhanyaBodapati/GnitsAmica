package com.example.gnitsamica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class semester extends AppCompatActivity implements View.OnClickListener {
    public CardView card17,card18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);
        card17=(CardView) findViewById(R.id.c17);
        card17.setOnClickListener(this);
        card18=(CardView) findViewById(R.id.c18);
        card18.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.c17:
                i = new Intent(this, qp1_1.class);
                startActivity(i);
                break;
        }
    }
}