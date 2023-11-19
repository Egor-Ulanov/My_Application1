package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;
public class t3_lab1_MainActivity4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t3_lab1_activity_main2);
    }

    public void onClick(View view) {
        Snackbar snackbar = Snackbar.make(view, "Hello Android",
                Snackbar.LENGTH_LONG);
        snackbar.setAction("Next...", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Next clicked!", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        snackbar.show();
    }
}
