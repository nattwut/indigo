package com.indigocorp.mai.butraffic;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
        // Explicit
        private TextView detail,title;
         private ImageView trafficImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        bindWidget();
        // Receive
        receiveFromIntent();


    } // Main Method

    private void receiveFromIntent() {
        String strtitle = getIntent().getStringExtra("Title");
        title.setText(strtitle);

        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intImage);

        String[] strDetail = getResources().getStringArray(R.array.detail);
        int intIndex = getIntent().getIntExtra("Index", 0);
        detail.setText(strDetail[intIndex]);
    }

    private void bindWidget() {
        title = (TextView) findViewById(R.id.textView3);
        detail = (TextView) findViewById(R.id.textView4);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);


    }
} // Main Class
