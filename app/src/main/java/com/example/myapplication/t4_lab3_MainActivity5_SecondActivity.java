package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class t4_lab3_MainActivity5_SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);
        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);
        Bundle arguments = getIntent().getExtras();
        t4_lab3_MainActivity3_User user;
        if(arguments!=null){
            user = (t4_lab3_MainActivity3_User)arguments.getSerializable
                    (t4_lab3_MainActivity3_User.class.getSimpleName());
            textView.setText("Name: " + user.getName() +
                    "\nCompany: " + user.getCompany() +
                    "\nAge: " + String.valueOf(user.getAge()));
        }
        setContentView(textView);
    }
}
