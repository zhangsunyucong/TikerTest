package com.example.hyj.tikertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_bug_class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_bug_class = (Button) findViewById(R.id.btn_bug_class);
        btn_bug_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BugClass bugClass = new BugClass();
                Toast.makeText(MainActivity.this,
                        ""+ bugClass.bug(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
