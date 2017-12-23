package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize variables
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_EightBall);
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        final int N_BallImages = ballArray.length;
        final Button ButtonAsk = findViewById(R.id.button_ask);
        // Set up the clicker to listen
        ButtonAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("mainview", "Ask button was pressed");
                // generate random number
                Random RNumberGenerator = new Random();
                int rnumber = RNumberGenerator.nextInt(N_BallImages);
                Log.d("mainview", "ball array index chosen = " + rnumber);
                // reset the ball image
                ballDisplay.setImageResource(ballArray[rnumber]);

            }
        });
    }
}
