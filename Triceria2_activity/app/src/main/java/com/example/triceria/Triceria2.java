package com.example.triceria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

public class Triceria2 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    Switch switch1;
    Button bsave;
    Toolbar toolbar;
    TextView getdate;
    EditText getevent;
    EditText getpersonname;
    EditText getguestname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceria2);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        switch1 = findViewById(R.id.switch1);
        bsave = findViewById(R.id.btnsave);
        getdate = findViewById(R.id.getdate);
        getevent = findViewById(R.id.textevent);
        getpersonname = findViewById(R.id.personname);
        getguestname = findViewById(R.id.guestname);

        Intent incomingintent = getIntent();
        String date = incomingintent.getStringExtra("date");

        getdate.setText(date);





        switch1.setOnCheckedChangeListener(this);
        bsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Saved...",Toast.LENGTH_SHORT).show();
                openActivity1();

            }
        });
    }
     public boolean onCreateOptionsMenu(Menu menu)
     {
         MenuInflater menuInflater = getMenuInflater();
         menuInflater.inflate(R.menu.menu,menu);
         return true;
     }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.birthday)
        {
            Toast.makeText(getApplicationContext(),"Happy Birthday",Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.anniversary)
        {
            Toast.makeText(getApplicationContext(),"Happy Anniversary",Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.event)
        {
            Toast.makeText(getApplicationContext(),"Remind me of an event",Toast.LENGTH_SHORT).show();
        }

        return true;
    }

    private void openActivity1() {
        Intent intent1 = new Intent(this,Triceriastatement.class);
        startActivity(intent1);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton , boolean b)
    {
        if(switch1.isChecked())
        {
            Toast.makeText(getApplicationContext(),"Set to all day",Toast.LENGTH_SHORT).show();
        }
        else
        {

        }
    }
}
