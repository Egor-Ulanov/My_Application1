package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
public class t3_lab3_MainActivity2 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.t3_lab3_activity_main2);
        }
        public void onCheckboxClicked(View view) {
                // Получаем флажок
                CheckBox checkBox = (CheckBox) view;
                // Получаем, отмечен ли данный флажок
                boolean checked = checkBox.isChecked();
                TextView selection = findViewById(R.id.selection);
                // Смотрим, какой именно из флажков отмечен
                CheckBox java = findViewById(R.id.java);
                CheckBox kotlin = findViewById(R.id.kotlin);
                if(java.isChecked())
                        Toast.makeText(this, "Вы выбрали Java ", Toast.LENGTH_LONG).show();
                if(kotlin.isChecked())
                        Toast.makeText(this, "Вы выбрали Kotlin", Toast.LENGTH_LONG).show();
                }
        }

