package com.example.android.perfoom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fallOpen(View view) {
        Intent openfall= new Intent(this,Fall.class);
        startActivity(openfall);
    }

    public void winterOpen(View view) {
        Intent openWinter= new Intent(this,Winter.class);
        startActivity(openWinter);
    }

    public void springOpen(View view) {
        Intent openspring= new Intent(this,Spring.class);
        startActivity(openspring);
    }

    public void summerOpen(View view) {
        Intent opensummer= new Intent(this,Summer.class);
        startActivity(opensummer);
    }
}
