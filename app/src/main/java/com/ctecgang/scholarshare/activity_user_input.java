package com.ctecgang.scholarshare;

<<<<<<< HEAD
import android.content.Intent;
=======
import android.support.annotation.NonNull;
>>>>>>> master
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class activity_user_input extends AppCompatActivity {
<<<<<<< HEAD
    private Button scholarShipDisplayButton;
=======
    
>>>>>>> master

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);
<<<<<<< HEAD
        scholarShipDisplayButton = (Button) findViewById(R.id.SearchButton);
        scholarShipDisplayButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                openDisplayScreen();
            }


        });
    }


public void openDisplayScreen()
{
    Intent intent = new Intent(this, Display.class);
    startActivity(intent);
}
=======


    }


>>>>>>> master
}
