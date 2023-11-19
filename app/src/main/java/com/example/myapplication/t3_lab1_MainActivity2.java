package com.example.myapplication;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class t3_lab1_MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t3_lab1_activity_main1);
    }
    public void onClick(View view){

        Toast toast = Toast.makeText(this, "Hello Android!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0,160); // import android.view.Gravity;
        toast.show();
         }
}
