package com.ca.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Spinner spinner;
ArrayList<String> arrayspinner=new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);

        arrayspinner.add("Menu");
        arrayspinner.add("Play");
        arrayspinner.add("Setting");
        arrayspinner.add("help");
        arrayspinner.add("Report");
        arrayspinner.add("Feedback");
        arrayspinner.add("Normal");

        ArrayAdapter<String> arrayAdapterspinner=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,arrayspinner);
        spinner.setAdapter(arrayAdapterspinner);
    }
}