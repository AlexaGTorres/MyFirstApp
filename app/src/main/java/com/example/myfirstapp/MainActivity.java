package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View view)
    {
        startActivity(new Intent(MainActivity.this, SecondActivity.class));
        Toast.makeText(this, "Next Page! :D", Toast.LENGTH_LONG).show();//It was working I swear
        Log.i("info", "Logcat thing I don't remember.");

    }
}