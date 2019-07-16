package com.example.basic_calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.room.Room;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    public static MyAppDatabase myAppDatabase;

    private Button button2;
    private Button login;
    private EditText emailtext,passwordtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAppDatabase= Room.databaseBuilder(getApplicationContext(),MyAppDatabase.class,"userdb").allowMainThreadQueries().build();
        button2 =(Button)findViewById(R.id.button2);
        login=(Button)findViewById(R.id.login);
        emailtext=(EditText)findViewById(R.id.emailText);



        passwordtext=(EditText)findViewById(R.id.passwordText);



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               setContentView(R.layout.signup);
                Intent intent = new Intent(MainActivity.this, signup.class);

            }
        });



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<User> users =MainActivity.myAppDatabase.myDao().getUsers();
                String info="";
                String emailid=emailtext.getText().toString();
                String password=passwordtext.getText().toString();
                for(User usr :users){
                    if(usr.getUseremail()==emailid && usr.getUserpassword()==password){

                        Intent i=new Intent(MainActivity.this,signup.class);


                    }

                }


            }
        });

    }
}
