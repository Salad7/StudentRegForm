package com.example.mohamed.studentregform;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mohamed on 12/20/16.
 */

public class DisplayActivity extends AppCompatActivity {

    TextView moodText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        moodText = (TextView) findViewById(R.id.moodText);

    }
}
