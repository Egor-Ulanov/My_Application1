package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class t4_lab2_MainActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t4_lab2_activity_main1);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this, t4_lab2_MainActivity2_SecondActivity.class);
        startActivity(intent);
    }
}