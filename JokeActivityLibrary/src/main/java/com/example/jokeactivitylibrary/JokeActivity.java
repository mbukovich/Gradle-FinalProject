package com.example.jokeactivitylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA_KEY = "jokeExtraKey";

    private TextView mJokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mJokeText = (TextView) findViewById(R.id.tv_joke_text);

        // Only display a joke if it exists
        if (getIntent().hasExtra(JOKE_EXTRA_KEY)) {
            // do stuff to display the joke
            String joke = getIntent().getStringExtra(JOKE_EXTRA_KEY);
            mJokeText.setText(joke);
        }
        else {
            // Let user know that the activity received no joke
            mJokeText.setText(R.string.noJokeWarning);
        }
    }
}