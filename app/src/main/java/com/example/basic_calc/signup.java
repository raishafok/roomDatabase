package com.example.basic_calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends Activity {
    Button btnsignup ;
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        btnsignup.findViewById(R.id.btnsignup);
        email.findViewById(R.id.signemail);
        password.findViewById(R.id.signpassword);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   //user.setUseremail(useremail);
                       // user.setUserpassword(userpassword);
                       // MainActivity.myAppDatabase.myDao().addUser(user);
                        Toast.makeText(getApplicationContext(), "user detailes are saved", Toast.LENGTH_LONG).show();
                       // email.setText("");
                       // password.setText("");




            }
        });


    };
}
