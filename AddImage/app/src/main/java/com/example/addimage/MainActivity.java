package com.example.addimage;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private boolean firstImageShown = true;
    public void picSwitch(View view){

//        EditText button = findViewById(R.id.button);
        Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show();


        ImageView image = findViewById(R.id.imageView);
//        image.setImageResource(R.drawable.politics3);

        if ((image != null) && (firstImageShown)) {
            image.setImageResource(R.drawable.politics3);
            firstImageShown = false;
        } else {
            if (image != null) image.setImageResource(R.drawable.politics2);
            firstImageShown = true;
        }

    }

//    public void clickFunction(View view) {
//
//
//        ImageView firstImage = (ImageView) findViewById(R.id.firstImage);
//
//        if ((firstImage != null) && (firstImageShown)) {
//            firstImage.setImageResource(R.drawable.sample_image2);
//            firstImageShown = false;
//        } else {
//            if (firstImage != null) firstImage.setImageResource(R.drawable.sample_image1);
//            firstImageShown = true;
//        }
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
