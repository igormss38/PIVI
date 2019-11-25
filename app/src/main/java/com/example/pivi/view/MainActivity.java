package com.example.pivi.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pivi.R;
import com.example.pivi.view.GraficoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.botaograf = findViewById(R.id.botaograf);

        this.mViewHolder.botaograf.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        if (v.getId() == R.id.botaograf){

            Intent intent = new Intent(this, GraficoActivity.class);
            startActivity(intent);

        }

    }

    private static class ViewHolder {

        Button botaograf;
    }
}
