package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register_one_Activity extends AppCompatActivity {
    EditText companyName , CompanyEmail,Phone,Address;
    Button buNext,buBack1;
    String validemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_one_);
        initi();
        onclick();
    }

    public void initi()
    {
//       String Name=getIntent().getStringExtra("name");
        companyName=(EditText)findViewById(R.id.editText12);
        CompanyEmail=(EditText)findViewById(R.id.editText13);
        Phone=(EditText)findViewById(R.id.editText15);
        Address=(EditText)findViewById(R.id.editText17);
        buNext=(Button)findViewById(R.id.nextRegisterTwo);
        buBack1=(Button)findViewById(R.id.back1);
    }

    public void onclick()
    {
        buNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validemail = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +

                        "\\@" +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +

                        "(" +

                        "\\." +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +

                        ")+";

                String email = CompanyEmail.getText().toString();

                Matcher matcher = Pattern.compile(validemail).matcher(email);

                if (companyName.getText().toString().isEmpty() || CompanyEmail
                        .getText().toString().isEmpty() || Phone.getText()
                        .toString().isEmpty() || Address.getText().toString()
                        .isEmpty() || !matcher.matches())
                {
                    if (companyName.getText().toString().isEmpty()) {
                        companyName.setError("Company Name is empty");
                    }
                    if (CompanyEmail.getText().toString().isEmpty()) {
                        CompanyEmail.setError("Email is empty");
                    }
                    if (Phone.getText().toString().isEmpty()) {
                        Phone.setError("Phone is Empty");
                    }
                    if (Address.getText().toString().isEmpty()) {
                        Address.setError("Address is Empty");
                    }
                    if (!matcher.matches()) {
                        CompanyEmail.setError("Make sure the account is correct");
                    }

                } else {

                    String compName = companyName.getText().toString();
                    String CompEmail = CompanyEmail.getText().toString();
                    String CompPhone = Phone.getText().toString();
                    String CommpAddress = Address.getText().toString();
                    SharedPreferences.Editor shared = getSharedPreferences("reg", MODE_PRIVATE).edit();
                    shared.putString("compName", compName);
                    shared.putString("CompEmail", CompEmail);
                    shared.putString("CompPhone", CompPhone);
                    shared.putString("CommpAddress", CommpAddress);
                    shared.commit();

                    Intent intent = new Intent(Register_one_Activity.this
                            ,Register_Two_Activity.class);

                    startActivity(intent);

                }
            }
        });
        buBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register_one_Activity.this,login.class);

                startActivity(intent);

            }
        });
    }

}
