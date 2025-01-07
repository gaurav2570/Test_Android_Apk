package com.gauravtestproject;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.gauravtestproject.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String numbers = getIntent().getStringExtra("numbers");

        Log.d("TAGDATA", "onCreate: "+name+" "+email+" "+numbers);

       TextView n1 =  findViewById(R.id.n1);
       TextView  e1 =  findViewById(R.id.e1);
       //TextView  e2 =  findViewById(R.id.e2);

       n1.setText(name);
       e1.setText(email);


    }
}