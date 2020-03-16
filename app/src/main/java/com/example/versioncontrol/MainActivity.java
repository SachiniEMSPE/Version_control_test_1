package com.example.versioncontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String comment = "new comment";
    // this is new branch
    // this is the second comment
    //I'm done
    // new comment\
    int num = 9 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
