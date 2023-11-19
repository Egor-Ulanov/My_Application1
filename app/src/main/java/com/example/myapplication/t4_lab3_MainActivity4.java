package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class t4_lab3_MainActivity4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t4_lab3_activity_main1);
    }

    public void onClick(View v) {
        EditText nameText = findViewById(R.id.name);
        EditText companyText = findViewById(R.id.company);
        EditText ageText = findViewById(R.id.age);
        String name = nameText.getText().toString();
        String company = companyText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());
        t4_lab3_MainActivity3_User user = new t4_lab3_MainActivity3_User(name, company, age);
        Intent intent = new Intent(this, t4_lab3_MainActivity5_SecondActivity.class);
        intent.putExtra(t4_lab3_MainActivity3_User.class.getSimpleName(), user);
        startActivity(intent);
    }
}