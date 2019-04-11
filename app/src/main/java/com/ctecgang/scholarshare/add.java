package com.ctecgang.scholarshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class add extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Spinner actSpinner = findViewById(R.id.ACTspinner);
        Spinner gpaSpinner = findViewById(R.id.GPASpinner);
        ArrayAdapter<CharSequence> actAdapter = ArrayAdapter.createFromResource(this, R.array.ACTScores, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> gpaAdapter = ArrayAdapter.createFromResource(this, R.array.GPAList, android.R.layout.simple_spinner_item);
        actAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gpaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        actSpinner.setAdapter(actAdapter);
        gpaSpinner.setAdapter(gpaAdapter);
        actSpinner.setOnItemSelectedListener(this);
        gpaSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String actScore = parent.getItemAtPosition(position).toString();
        String gpaValue = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {

    }
}
