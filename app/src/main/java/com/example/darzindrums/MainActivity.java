package com.example.darzindrums;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer audkick = MediaPlayer.create(this, R.raw.dk);
        final MediaPlayer audsnare = MediaPlayer.create(this, R.raw.ds);
        final MediaPlayer audhat = MediaPlayer.create(this, R.raw.dh);

        final ImageButton mikick= this.findViewById(R.id.audkick);
        mikick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                audkick.start();
            }
        });
        final ImageButton misnare= this.findViewById(R.id.audsnare);
        misnare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                audsnare.start();
            }
        });
        final ImageButton mihat= this.findViewById(R.id.audhat);
        mihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                audhat.start();
            }

        });
    }}