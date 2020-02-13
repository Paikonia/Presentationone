package com.example.presentable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.presentable.Account.schoolaccount;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private static final String a1 = "FirstName";
    private static final String a2 = "SecondName";
    private static final String a3 = "Email";
    private static final String a4 = "school";
    private static final String a5 = "Date of Birth";
    private static final String a6 = "class";
    private static final String a7 = "gender";
    private static final String a8 = "Phone number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    EditText firstName = (EditText) findViewById(R.id.firstname);
                    EditText lastName = (EditText) findViewById(R.id.lastname);
                    EditText email = (EditText) findViewById(R.id.email);
                    EditText school = (EditText) findViewById(R.id.school);
                    EditText dateOfBirth = (EditText) findViewById(R.id.date);
                    EditText Class = (EditText) findViewById(R.id.cass);
                    EditText phone = (EditText) findViewById(R.id.Phone);
                    Spinner genger = (Spinner) findViewById(R.id.gender);

                    String firstname = firstName.getText().toString();
                    String secondname = lastName.getText().toString();
                    String emai = email.getText().toString();
                    String School = school.getText().toString();
                    String dateofbirth = dateOfBirth.getText().toString();
                    String Clas = Class.getText().toString();
                    String Phone = phone.getText().toString();
                    String gender = genger.getSelectedItem().toString().toString();
                    Intent intent = new Intent(getBaseContext(), StudentSignup.class);
                    intent.putExtra(a1, firstname);
                    intent.putExtra(a2, secondname);
                    intent.putExtra(a3, emai );
                    intent.putExtra(a4, School);
                    intent.putExtra(a5, dateofbirth);
                    intent.putExtra(a6, Clas);
                    intent.putExtra(a7, gender);
                    intent.putExtra(a8, Phone);
                    startService(intent);
                }
                catch (Exception y){
                    Toast toast = Toast.makeText(getApplicationContext(), "The was an error here", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        }).start();

    }


}
