package com.example.jgarciaamor.toast;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public boolean esGrande;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if (getResources().getBoolean(R.bool.twoPaneMode)){

            Toast.makeText(this,"Toast GRANDE", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Toast pequeño", Toast.LENGTH_SHORT).show();
        }


    }
}
