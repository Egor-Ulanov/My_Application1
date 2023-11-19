package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
public class t3_lab3_MainActivity1 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.t3_lab3_activity_main1);
        }
        public void onCheckboxClicked(View view) {
                // Получаем флажок
                CheckBox checkBox = (CheckBox) view;
                TextView selection = findViewById(R.id.selection);
                // Получаем, отмечен ли данный флажок
                if(checkBox.isChecked()) {
                        selection.setText("Включено");
                        checkBox.setText("Выключить");
                }
                else {
                        selection.setText("Выключено");
                        checkBox.setText("Включить");
                }
        }
}
