package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView imageDetail;
    TextView titleDetail, nameDetail;
    private Modell modell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageDetail = findViewById(R.id.imageDetail);
        titleDetail = findViewById(R.id.titleDetail);
        nameDetail = findViewById(R.id.nameDetail);

        Intent intent = getIntent();
        imageDetail.setImageResource(intent.getIntExtra("image",0));
        titleDetail.setText(intent.getStringExtra("title"));
        nameDetail.setText(intent.getStringExtra("name"));

    }
}