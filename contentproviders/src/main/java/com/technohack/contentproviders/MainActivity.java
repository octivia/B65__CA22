package com.technohack.contentproviders;

import android.content.ContentValues;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,email,pass,confirmPass;
    Button  registerBtn;

    ContentValues contentValues = new ContentValues();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.reg_usernameId);
        email=findViewById(R.id.reg_emailId);
        pass=findViewById(R.id.reg_passId);
        confirmPass=findViewById(R.id.confirm_passId);

        registerBtn=findViewById(R.id.reg_buttonId);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contentValues.put("username",username.getText().toString().trim());
                contentValues.put("email",email.getText().toString().trim());
                contentValues.put("pass",pass.getText().toString().trim());
                contentValues.put("confirm_pass",confirmPass.getText().toString().trim());


                //passing the values to the insert method
                Uri uri=getContentResolver().insert(MyContentProviders.content_uri,contentValues);


                Toast.makeText(MainActivity.this, uri.toString(), Toast.LENGTH_SHORT).show();

            }
        });

     }
}
