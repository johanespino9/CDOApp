package com.example.johanespino.cdoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void changeAct(View v){
        Intent i = new Intent(LoginActivity.this, MenuActivity.class);
        startActivity(i);
    }
}
