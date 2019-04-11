package com.ctecgang.scholarshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class activity_user_input extends AppCompatActivity {
    private Button scholarShipDisplayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);
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
}
