package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText getName;
    TextView showName;
    Button setName, continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getName = findViewById(R.id.nameTextField);
        showName = findViewById(R.id.textView2);
        setName = findViewById(R.id.button);
        continueButton = findViewById(R.id.button2);

        setName.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String name = getName.getText().toString();
                if(name.equals("")){
                    showName.setText("Empty");
                }
                else
                    showName.setText("Name: " + name);
            }
        });

        final Context context = this;

        continueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,SecondScreen.class);
                intent.putExtra("name",getName.getText().toString());
                startActivity(intent);
            }
        });


    }


}