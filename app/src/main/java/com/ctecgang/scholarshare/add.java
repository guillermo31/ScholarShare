package com.ctecgang.scholarshare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


public class add extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    private Button button;
    private Scholarship newScholarship;
    private DatabaseReference mDatabase;
    private ArrayList<Scholarship> scholarships = new ArrayList<Scholarship>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Spinner actSpinner = findViewById(R.id.ACTspinner);
        ArrayAdapter<CharSequence> actAdapter = ArrayAdapter.createFromResource(this, R.array.ACTScores, android.R.layout.simple_spinner_item);
        actAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        actSpinner.setAdapter(actAdapter);
        actSpinner.setOnItemSelectedListener(this);

        Spinner gpaSpinner = findViewById(R.id.GPASpinner);
        ArrayAdapter<CharSequence> gpaAdapter = ArrayAdapter.createFromResource(this, R.array.GPAList, android.R.layout.simple_spinner_item);
        gpaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gpaSpinner.setAdapter(gpaAdapter);
        gpaSpinner.setOnItemSelectedListener(this);

        Spinner ethnicitySpinner = findViewById(R.id.GenderSpinner);
        ArrayAdapter<CharSequence> ethnicityAdapter = ArrayAdapter.createFromResource(this, R.array.genderList, android.R.layout.simple_spinner_item);
        ethnicityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ethnicitySpinner.setAdapter(ethnicityAdapter);
        ethnicitySpinner.setOnItemSelectedListener(this);

        Spinner genderSpinner = findViewById(R.id.EthnicitySpinnner);
        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(this, R.array.ethnicityList, android.R.layout.simple_spinner_item);
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);
        genderSpinner.setOnItemSelectedListener(this);

        Spinner stateSpinner = findViewById(R.id.StateSpinner);
        ArrayAdapter<CharSequence> stateAdapter = ArrayAdapter.createFromResource(this, R.array.stateList, android.R.layout.simple_spinner_item);
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stateSpinner.setAdapter(stateAdapter);
        stateSpinner.setOnItemSelectedListener(this);



        // creating the new object with text field's data


        button = (Button) findViewById(R.id.button3);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                newScholarship = new Scholarship();
                mDatabase.child("scholarships").child(newScholarship.getName()).setValue(newScholarship);

            }
        });

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
