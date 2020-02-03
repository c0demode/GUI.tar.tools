package com.walderman.guitartools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.json.JSONException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addChord(){
        Chord A = new Chord("A", Fret.FRET_X,Fret.FRET_0, Fret.FRET_2, Fret.FRET_2, Fret.FRET_2, Fret.FRET_0);
    }

    public void lookAtChord(){

    }
}
