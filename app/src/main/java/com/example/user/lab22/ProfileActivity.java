package com.example.user.lab22;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {

    private static final int REQUEST_PROFILE_UPDATE = 1;
    public static final String PROFILE_NAME = "com.example.user.lab22.name";
    public static final String PROFILE_EMAIL = "com.example.user.lab22.email";
    private EditText editTextName, editTextEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);
    }

    public void saveProfile(View view)
    {
        Intent intent = getIntent();

        //Obtain input data from user
        String name, email;
        name = editTextName.getText().toString();
        email = editTextEmail.getText().toString();

        intent.putExtra(MainActivity.PROFILE_NAME, name);
        intent.putExtra(MainActivity.PROFILE_EMAIL, email);

        setResult(RESULT_OK, intent);
        finish();
    }
}
