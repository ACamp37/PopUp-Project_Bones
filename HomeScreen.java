package com.example.popup;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {

    ImageView dogImage;
    Button startButton;
    long animationDuration = 2000;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_audio, "Line 3", "Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_sun, "Line 5", "Line 6"));

        dogImage = (ImageView) findViewById(R.id.dogImage);
        startButton = (Button) findViewById(R.id.startButton);

    // Add a toast, snackbar and loading screen before entering next activity. It will eventually
        // become the game, but for now, use something else.

     ObjectAnimator animatorY = ObjectAnimator.ofFloat(dogImage, "y", 420f);
     animatorY.setDuration(animationDuration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorY);
        animatorSet.start();

        // In future, add random to have two different dog faces pop up instead of just one. Utilize
        // alpha for disappearing or have dog go down from screen.

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, ExampleItem.class);
                Toast.makeText(HomeScreen.this, "Good Luck!", Toast.LENGTH_LONG
                ).show();
                HomeScreen.this.startActivity(intent);
            }
        });

        //Be sure to also implement notifications and JobScheduler
    }
}
