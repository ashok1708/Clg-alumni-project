package com.alumni.jietjodhpur.jietalumni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {
    private EditText Username, DOB, Year;
    private Button Submitbutton;
    public static final String LOGIN_SUCCESS = "success";


    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText) findViewById(R.id.user_name);
        DOB = (EditText) findViewById(R.id.user_dob);
        Year = (EditText) findViewById(R.id.user_year);
        Submitbutton = (Button) findViewById(R.id.submit_button);


        DOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Please Enter Your Date Of Birth", Toast.LENGTH_SHORT).show();
            }

        });

    }

    public void OnLogin(View view) {
        String uname = Username.getText().toString();
        String udob = DOB.getText().toString();
        String uyear = Year.getText().toString();
        String type = "login";


        backgroungWork backgroundWorker = new backgroungWork(this);
        backgroundWorker.execute(type, uname, udob, uyear);
        finish();



    }

}




