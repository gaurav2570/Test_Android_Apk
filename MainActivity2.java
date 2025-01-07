package com.gauravtestproject;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String numbers = getIntent().getStringExtra("numbers");


        Log.d("TAGDATA", "onCreate: "+name+" "+email+" "+numbers);

        TextView nameOut =  findViewById(R.id.nameOut);
        TextView emailOut =  findViewById(R.id.emailOut);
        TextView dateOut =  findViewById(R.id.dateOut);

        nameOut.setText(name);
        dateOut.setText(numbers);
        emailOut.setText(email);
    }
}