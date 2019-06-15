package com.example.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.util.Log;
import android.view.View;
//import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Executes on Click of button
    public void onClickFunction(View view){
        /*Takes nameEditText from id in activity_main.xml and assigns
            to nameEditText variable of type EditText*/
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);


        /* The nameEditText contains the text input,
            which is obtained by the getText() function,
            which is converted to string by the toString() function*/
        Log.i("Values", nameEditText.getText().toString());
        Log.i("values", passwordText.getText().toString());


        // Function below displays the message
        Log.i("info","Logged in!");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
