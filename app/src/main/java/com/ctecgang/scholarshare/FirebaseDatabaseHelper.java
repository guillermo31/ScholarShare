package com.ctecgang.scholarshare;

import android.support.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class FirebaseDatabaseHelper
{
    private DatabaseReference mDatabase;
    private ArrayList<Scholarship> scholarships = new ArrayList<Scholarship>();

    public interface DataStatus
    {
        void dataIsLoaded(ArrayList<Scholarship> scholarships, ArrayList<String> keys);
        void dataIsInserted();
        void dataIsUpdated();
        void dataIsDeleted();

    }


    protected void readScholarships(final DataStatus dataStatus)
    {
        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                ArrayList<String> keys = new ArrayList<String>();

                for(DataSnapshot keyNode : dataSnapshot.getChildren())
                {
                    keys.add(keyNode.getKey());
                    Scholarship currentScholarship = keyNode.getValue(Scholarship.class);
                    scholarships.add(currentScholarship);
                }
                dataStatus.dataIsLoaded(scholarships, keys);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
