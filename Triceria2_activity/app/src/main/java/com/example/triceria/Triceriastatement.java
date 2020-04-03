package com.example.triceria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Triceriastatement extends AppCompatActivity {
    private static final String TAG = "CalendarActivity";
    CalendarView calendarView;
    TextView mydate;
    Button bcustom, bevent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = findViewById(R.id.calendar);
        mydate = findViewById(R.id.anytext);
        bcustom = findViewById(R.id.btncustom);
        bevent = findViewById(R.id.btnevent);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                final String date = i + "/" + i1 + "/" + i2;
                Log.d(TAG, "onSelectedDayChange: date : " + date);
                bevent.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Triceriastatement.this, Triceria2.class);
                        intent.putExtra("date", date);
                        startActivity(intent);
                    }

                });


            }
        });

        bcustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Not Available in this version", Toast.LENGTH_SHORT).show();
            }
        });


    }


}
