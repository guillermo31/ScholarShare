package com.ctecgang.scholarshare;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Display extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_scholarships);
        new FirebaseDatabaseHelper().readScholarships(new FirebaseDatabaseHelper.DataStatus() {
            @Override
            public void dataIsLoaded(ArrayList<Scholarship> scholarships, ArrayList<String> keys) {
                new RecyclerView_Config().setConfig(mRecyclerView, Display.this, scholarships, keys);
            }

            @Override
            public void dataIsInserted() {

            }

            @Override
            public void dataIsUpdated() {

            }

            @Override
            public void dataIsDeleted() {

            }
        });
    }


}
