package com.example.aarjugoyal.master_class_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.aboutToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("About");
    }
}
