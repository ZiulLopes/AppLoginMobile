package com.lopesluiz.apploginmobile.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lopesluiz.apploginmobile.R;

public class UsersActivity extends AppCompatActivity {

    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        textViewName = (TextView)findViewById(R.id.txt_inputName1);
        String nameFromIntent = getIntent().getStringExtra("EMAIL");
        textViewName.setText("Bem vindo " + nameFromIntent);
    }
}
