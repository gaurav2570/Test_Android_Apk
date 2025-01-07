package com.gauravtestproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String name,email;
    int numbers;

    EditText NameInput;
    EditText emailInput;
    EditText DateInput;

    Button Submitbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NameInput = (EditText) findViewById(R.id.NameInput);
        emailInput = (EditText) findViewById(R.id.emailInput);
        DateInput = (EditText) findViewById(R.id.DateInput);

        Submitbutton = (Button) findViewById(R.id.Submitbutton);
        Submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = NameInput.getText().toString();
                email = emailInput.getText().toString();
                numbers = Integer.valueOf(DateInput.getText().toString());

                showToast(name);
                showToast(String.valueOf(numbers));
                showToast(email);

                Intent intent;
                intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",name);
                intent.putExtra("email",email);
                intent.putExtra("numbers",numbers);

                startActivity(intent);


            }
        });
    }
    private void showToast(String text)  {
        Toast.makeText(MainActivity.this, text,Toast.LENGTH_SHORT).show();
    }

}