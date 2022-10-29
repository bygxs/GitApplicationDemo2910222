package com.biniyam.gitapplicationdemo291022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button git;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("This is my Git projcet 2.0 attempt to save Git locally " +
                "22:07 saturday 29 Oct 2022");
        helloText = findViewById(R.id.helloText);

        git = findViewById(R.id.button2just4Git);
        git.setOnClickListener((View.OnClickListener) helloText);

       /* git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

*/


    }
}