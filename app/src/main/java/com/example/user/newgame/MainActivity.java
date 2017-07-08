package com.example.user.newgame;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MainActivity extends AppCompatActivity {

    GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gameView = new GameView(this);
        setContentView(gameView);
    }

    class GameView extends SurfaceView implements Runnable {

        private int Xsize;
        private int Ysize;
        private SurfaceHolder ourHolder;
        private boolean playing;

        public GameView(Context context) {
            super(context);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            context.getFilesDir();
            Display display = getWindowManager().getDefaultDisplay();
            android.graphics.Point size = new android.graphics.Point();
            display.getSize(size);
            Xsize = size.x;
            Ysize = size.y;
            ourHolder = getHolder();
            playing = true;
        }

        @Override
        public void run() {
            while (playing) {

            }
        }


        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (motionEvent.getAction() & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_DOWN:
                    break;
            }
            return true;
        }
    }


}
