package com.alumni.jietjodhpur.jietalumni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VerifyActivity extends AppCompatActivity {
    private EditText UserMobile, UserEmail;
    private Button OtpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        UserMobile= (EditText) findViewById(R.id.user_number);
        UserEmail= (EditText) findViewById(R.id.user_email);
        OtpButton= (Button) findViewById(R.id.otp_button);


        OtpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent verifyotp = new Intent(VerifyActivity.this,VerifyOtp.class);
                startActivity(verifyotp);

            }
        });
    }
}
