package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
public class t3_lab1_MainActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t3_lab1_activity_main1);
    }
    public void onClick(View view){
        Toast toast = Toast.makeText(this, "Hello Android!",
                Toast.LENGTH_LONG);
        toast.show();
    }
}
