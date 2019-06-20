package com.example.higherlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random randInt = new Random();
    //Specify hi and lo boundaries for random number
    int low = 1;
    int high = 100;

    //Generate and store random number
    int randNum = randInt.nextInt(high-low) + low;

    public void guessNumber(View view){


        //Get user's guess
        EditText editGuessNumber = (EditText) findViewById(R.id.editGuessNumber);
        int userGuess = Integer.parseInt(editGuessNumber.getText().toString());
//        String strRand = String.valueOf(randNum);


        //Compare random number with user's guessed number
        if (userGuess < randNum) {
//            System.out.println("Higher");
            Toast.makeText(this,"Higher" ,Toast.LENGTH_LONG).show();
        }
        else if (userGuess > randNum) {
//            System.out.println("Lower");
            Toast.makeText(this,"Lower" ,Toast.LENGTH_LONG).show();
        }
        else {
//            System.out.println("Lower");
            Toast.makeText(this,"You Got It!" ,Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
