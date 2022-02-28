package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import com.example.wordle.Wordle;

public class MainActivity extends AppCompatActivity {

    //variables
    private TextView name;
    Wordle wordle;

    //----------------------------------------------------------------------------------
    //onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //methods
        GetWordle(); //creating new wordle game

        //TODO remove
        this.name = findViewById(R.id.gameName);
        name.setText(wordle.getWord());
    }

    //----------------------------------------------------------------------------------
    //instantiating wordle class
    protected void GetWordle()
    {
        this.wordle = new Wordle();

    }
}
//--------------------------------------end of file--------------------------------------------
