package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;
public class t4_lab1_MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t4_lab1_activity_main3);
        TextView timeTextView = findViewById(R.id.timeTextView);
        TimePicker timePicker = findViewById(R.id.timePicker);
        timePicker.setOnTimeChangedListener
                (new TimePicker.OnTimeChangedListener() {
                    @Override
                    public void onTimeChanged(TimePicker view, int
                            hourOfDay, int minute)
                    {
                        timeTextView.setText("Время: " + hourOfDay + ":" + minute);

                        // или такtimeTextView.setText("Время: " + view.getHour() + ":" + view.getMinute());
                    }
                });
    }
}
