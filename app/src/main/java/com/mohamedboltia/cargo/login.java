package com.mohamedboltia.cargo;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    EditText emailValidate;
    TextInputEditText password;
    Button login,register,forgetPassword;
    String validemail;
    String emaill,passworrd;
    AlertDialog.Builder dlgAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        dlgAlert = new AlertDialog.Builder(this);
        initi();
        OnClick();
    }

    public void initi()
    {

        emailValidate=(EditText)findViewById(R.id.email);
        password=(TextInputEditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.bu_signin);
        register=(Button)findViewById(R.id.bu_register);
        forgetPassword=(Button)findViewById(R.id.bu_forgetPassword);

    }

    public void OnClick()
    {
        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,verify_email.class);

                startActivity(intent);
            }
        });



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(login.this,Register_one_Activity.class);

                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences shared=getSharedPreferences( "reg",MODE_PRIVATE);
                 emaill =shared.getString("CompEmail","");
                passworrd=shared.getString("RTPassword","");

              if(emailValidate.getText().toString().equals(emaill) && password.getText().toString().equals(passworrd))
              {
                  Intent intent = new Intent(login.this,Drawer_Slide_Activity.class);

                    startActivity(intent);
              }
              else
              {

                  dlgAlert.setMessage("user name or password is error");
                  dlgAlert.show();

              }

//                validemail = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
//
//                        "\\@" +
//
//                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
//
//                        "(" +
//
//                        "\\." +
//
//                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
//
//                        ")+";
//
//                String email = emailValidate.getText().toString();
//
//                Matcher matcher= Pattern.compile(validemail).matcher(email);

//                if (emailValidate.getText().toString().isEmpty()||password
//                        .getText().toString().isEmpty()||!matcher.matches())
//                {
//
//                    if (password.getText().toString().isEmpty())
//                    {
//                        password.setError("password is empty");
//                        // password.setTextColor(Color.RED);
//
//
//                    }
//
//                    if (!matcher.matches())
//                    {
//                        emailValidate.setError("Make sure the account is correct");
//
//                    }
//
//                }
//                else {
//                    Intent intent = new Intent(login.this,Register_one_Activity.class);
//
//                    startActivity(intent);
//                }
            }});
}
}
