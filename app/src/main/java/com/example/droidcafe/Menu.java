package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void selection(View view) {
        RadioButton rb = (RadioButton) view;
        Toast t = Toast.makeText(this, rb.getText(), Toast.LENGTH_LONG);
    }
}
