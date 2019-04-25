package com.ctecgang.scholarshare;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import com.ctecgang.scholarshare.activity_user_input;

public class Display extends AppCompatActivity {

    private DatabaseReference scholarshipRef;
    private DatabaseReference userRef;

    private String userACT;
    private String userGender;
    private String userGPA;
    private String userEthnicity;
    private String userState;

    private activity_user_input userFile;

    private ListView listView;
    private ArrayList<Scholarship> scholarships = new ArrayList<Scholarship>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        scholarshipRef = FirebaseDatabase.getInstance().getReference("Scholarships");
        userRef = FirebaseDatabase.getInstance().getReference("Users");

        userACT = userFile.currentUser.getAct();
        userGender = userFile.currentUser.getGender();
        userGPA = userFile.currentUser.getGpa();
        userEthnicity = userFile.currentUser.getEthnicity();
        userState = userFile.currentUser.getState();


        scholarshipRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Scholarship value = dataSnapshot.getValue(Scholarship.class);
                scholarships.add(value);

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


}
