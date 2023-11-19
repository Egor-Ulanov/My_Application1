package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class t3_lab3_MainActivity4 extends AppCompatActivity {

        @Override
protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.t3_lab3_activity_main3);
        }
public void onToggleClicked(View view) {

                // включена ли кнопка
                boolean on = ((ToggleButton) view).isChecked();
                if (on) {
                        // действия если включена
                        Toast.makeText(this, "Свет включен",
                                Toast.LENGTH_LONG).show();
                        } else {
                        // действия, если выключена
                        Toast.makeText(this, "Свет выключен!",
                                Toast.LENGTH_LONG).show();
                        }}}