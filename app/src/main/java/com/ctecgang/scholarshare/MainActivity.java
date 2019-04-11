package com.ctecgang.scholarshare;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.Button;
        import android.view.View;


public class MainActivity extends AppCompatActivity
{
    private Button button;
    private Button filterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        button = (Button) findViewById(R.id.button);
        filterButton = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                openAddScreen();
            }
        });

        filterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                openFilterScreen();
            }



        });
    }

    public void openAddScreen()
    {
        Intent intent = new Intent(this, add.class);
        startActivity(intent);
    }
    public void openFilterScreen()
    {
        Intent intent = new Intent(this, activity_user_input.class);
        startActivity(intent);
    }



}
