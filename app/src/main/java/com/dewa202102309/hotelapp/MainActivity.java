package com.dewa202102309.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _imageView1 = (ImageView) findViewById(R.id.imagrView1);
        String imageUrl = "https://www.tripowervacationrentals.com/unitimages/2970-240842/7271470357.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}