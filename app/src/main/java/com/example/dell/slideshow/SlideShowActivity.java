package com.example.dell.slideshow;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class SlideShowActivity extends Activity {

    private ViewFlipper myViewFlipper;
    private float initialXPoint;
    int[] image = { R.drawable.a, R.drawable.b,
            R.drawable.c };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        MediaPlayer mp = MediaPlayer.create(getBaseContext(), R.raw.ocean_waves_1); /*Gets your
soundfile from res/raw/sound.ogg */
        mp.start(); //Starts your sound

        setContentView(R.layout.slide_show);
        myViewFlipper = (ViewFlipper) findViewById(R.id.myflipper);

        for (int i = 0; i < image.length; i++) {
            ImageView imageView = new ImageView(SlideShowActivity.this);
            imageView.setImageResource(image[i]);
            myViewFlipper.addView(imageView);
        }
        myViewFlipper.setAutoStart(true);
        myViewFlipper.setFlipInterval(3000);
        myViewFlipper.startFlipping();
    }




}