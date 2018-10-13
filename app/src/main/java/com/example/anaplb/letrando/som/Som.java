package com.example.anaplb.letrando.som;

import android.content.Context;
import android.media.MediaPlayer;


public class Som {


    public void playSound(Context context, int songId) {

        MediaPlayer mediaPlayer = MediaPlayer.create(context, songId );
        mediaPlayer.start();
    }
}
