package com.alumni.jietjodhpur.jietalumni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VerifyOtp extends AppCompatActivity {
    private EditText otp_one, otp_two, otp_three, otp_four;
    private Button confirmbutton,resendbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otp);

        otp_one=(EditText) findViewById(R.id.otp_one);
        otp_two=(EditText) findViewById(R.id.otp_two);
        otp_three=(EditText) findViewById(R.id.otp_three);
        otp_four=(EditText) findViewById(R.id.otp_four);

        confirmbutton= (Button) findViewById(R.id.verify_otp);
        resendbutton = (Button) findViewById(R.id.resend_otp);



        confirmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent comfirmintent = new Intent(VerifyOtp.this, ProfileSetting.class);
                startActivity(comfirmintent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        resendbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resendintent = new Intent(VerifyOtp.this, VerifyActivity.class);
                startActivity(resendintent);
            }
        });
    }
}
