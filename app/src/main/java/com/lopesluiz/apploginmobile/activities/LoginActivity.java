package com.lopesluiz.apploginmobile.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.lopesluiz.apploginmobile.R;

public class LoginActivity extends AppCompatActivity {

    private EditText Loginname;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
}
