package com.example.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {

    String retour()
    {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = "welcome ";
            value = value +  extras.getString("username");
            value = value + " \nYour password is :\n" + extras.getString("password");
            return value;
            //The key argument here must match that used in the other activity
        }
        return "welcome jane doe";

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        TextView text = findViewById(R.id.welcome);
        String val = retour();
        text.setText(val);
        Button home = findViewById(R.id.buttonHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), FormActivity.class);
                startActivity(intent);

            }
        });


    }
}
