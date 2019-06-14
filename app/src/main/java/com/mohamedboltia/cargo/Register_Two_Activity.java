package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register_Two_Activity extends AppCompatActivity {
    TextInputEditText edPassword,edRe_password;
    Button buNextToRegister3,buBackToRegister1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__two_);
        iniiti();
        onnclick();
    }

    public void iniiti()
    {
        edPassword=(TextInputEditText)findViewById(R.id.edPassword);
        edRe_password=(TextInputEditText)findViewById(R.id.edRePassword);
        buNextToRegister3=(Button)findViewById(R.id.nextRegisterThree);
        buBackToRegister1=(Button)findViewById(R.id.back2);
    }

    public void onnclick()
    {
        buNextToRegister3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edPassword.getText().toString().equals(edRe_password.getText().toString())|| edPassword.getText().toString().isEmpty() || edRe_password.getText().toString().isEmpty()||edPassword.getText().toString().length()<8)
                {
                    if (edPassword.getText().toString().length()<8||edPassword.getText().toString().length()>0)
                    {
                        edPassword.setError("Password less than 8 characters");
                    }
                    if (!edPassword.getText().toString().equals(edRe_password.getText().toString()))
                    {
                        edRe_password.setError("The password does not match");
                    }
                    if(edPassword.getText().toString().isEmpty())
                    {
                        edPassword.setError("Password is Empty");

                    }
                    if ( edRe_password.getText().toString().isEmpty())
                    {
                        edRe_password.setError("Re-Password is Empty");
                    }



                }
                else
                {
                    String RTPassword = edPassword.getText().toString();
                    String RTRePassword = edRe_password.getText().toString();
                    SharedPreferences.Editor shared = getSharedPreferences("reg", MODE_PRIVATE).edit();
                    shared.putString("RTPassword", RTPassword);
                    shared.putString("RTRePassword", RTRePassword);
                    shared.commit();

                    Intent intent = new Intent(Register_Two_Activity.this,Register_Three_Activity.class);
                    startActivity(intent);

                }
            }
        });
        buBackToRegister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register_Two_Activity.this,Register_one_Activity.class);
//                intent.putExtra("name",edPassword.getText().toString());
                startActivity(intent);
            }
        });


    }
}
