package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
public class t3_lab3_MainActivity3 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.t3_lab3_activity_main2);
        }
        public void onCheckboxClicked(View view) {
                // Получаем флажки
                CheckBox java = findViewById(R.id.java);
                CheckBox kotlin = findViewById(R.id.kotlin);
                String selectedItems = "";
                if(java.isChecked())
                        selectedItems +=java.getText() + " ";
                if(kotlin.isChecked())
                        selectedItems +=kotlin.getText();
                TextView selection = findViewById(R.id.selection);
                selection.setText(selectedItems);
        }
}