package com.t.androidca2project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.t.androidca2project.P2.Main1Fragment;
import com.t.androidca2project.P2.Main2Activity;
import com.t.androidca2project.P4.UserInput;
import com.t.androidca2project.P5.Fragment;

public class MainActivity extends AppCompatActivity {

    Button program2,program4,program5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        program2 = findViewById(R.id.buton1);
        program4 = findViewById(R.id.button2);
        program5 = findViewById(R.id.button3);

        program2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });

        program4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, UserInput.class);
                startActivity(i);
            }
        });

        program5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Fragment.class);
                startActivity(i);
            }
        });
    }
}
