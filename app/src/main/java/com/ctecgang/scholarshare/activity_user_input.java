package com.ctecgang.scholarshare;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.*;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class activity_user_input extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    public User currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);

        final Spinner actSpinner = findViewById(R.id.ACTDropDown);
        ArrayAdapter<CharSequence> actAdapter = ArrayAdapter.createFromResource(this, R.array.ACTScores, android.R.layout.simple_spinner_item);
        actAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        actSpinner.setAdapter(actAdapter);
        actSpinner.setOnItemSelectedListener(this);

        final Spinner gpaSpinner = findViewById(R.id.GPADropDown);
        ArrayAdapter<CharSequence> gpaAdapter = ArrayAdapter.createFromResource(this, R.array.GPAList, android.R.layout.simple_spinner_item);
        gpaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gpaSpinner.setAdapter(gpaAdapter);
        gpaSpinner.setOnItemSelectedListener(this);

        final Spinner ethnicitySpinner = findViewById(R.id.EthnicityDropDown);
        ArrayAdapter<CharSequence> ethnicityAdapter = ArrayAdapter.createFromResource(this, R.array.genderList, android.R.layout.simple_spinner_item);
        ethnicityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ethnicitySpinner.setAdapter(ethnicityAdapter);
        ethnicitySpinner.setOnItemSelectedListener(this);

        final Spinner genderSpinner = findViewById(R.id.GenderDropDown);
        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(this, R.array.ethnicityList, android.R.layout.simple_spinner_item);
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);
        genderSpinner.setOnItemSelectedListener(this);

        final Spinner stateSpinner = findViewById(R.id.StateDropDown);
        ArrayAdapter<CharSequence> stateAdapter = ArrayAdapter.createFromResource(this, R.array.stateList, android.R.layout.simple_spinner_item);
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stateSpinner.setAdapter(stateAdapter);
        stateSpinner.setOnItemSelectedListener(this);

        final EditText userName = findViewById(R.id.userName);


        Button displayButton = (Button) findViewById(R.id.SearchButton);
        final DatabaseReference myDatabase = FirebaseDatabase.getInstance().getReference();
        displayButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String actScore = actSpinner.getSelectedItem().toString();
                String gpa = gpaSpinner.getSelectedItem().toString();
                String ethnicity = ethnicitySpinner.getSelectedItem().toString();
                String gender = genderSpinner.getSelectedItem().toString();
                String state = stateSpinner.getSelectedItem().toString();
                String name = userName.getText().toString();

                currentUser = new User(name, actScore, gender, gpa, ethnicity, state);

                openDisplayScreen();

            }
        });





    }
    public void openDisplayScreen()
    {
        Intent intent = new Intent(this, Display.class);
        startActivity(intent);
    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
