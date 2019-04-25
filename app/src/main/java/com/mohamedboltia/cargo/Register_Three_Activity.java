package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Register_Three_Activity extends AppCompatActivity {
    EditText edTaxCard,edTaxRegister;
    Spinner Specialization;
    Button buConfirm,BackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__three_);
        ini();
        clickFun();
        spinner();
    }

    public void spinner()
    {
        Specialization=(Spinner)findViewById(R.id.SPinnerSpecia);
        List<String> statue =new ArrayList<>();
        statue.add("Transport Company");
        statue.add("Import And Export Company");
        statue.add("Import Company");
        statue.add("Export Company");
        ArrayAdapter statueAD =new ArrayAdapter(this, android.R.layout.simple_spinner_item,statue);
        statueAD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Specialization.setAdapter(statueAD);

    }
    public void ini()
    {
        edTaxCard=(EditText)findViewById(R.id.edTaxCard);
        edTaxRegister=(EditText)findViewById(R.id.edTaxRegister);
        BackToLogin=(Button)findViewById(R.id.back3);
        buConfirm=(Button)findViewById(R.id.gotologin);
    }
    public void clickFun()
    {

        buConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( edTaxCard.getText().toString().isEmpty() || edTaxRegister.getText().toString().isEmpty()||Specialization.getSelectedItem().toString().isEmpty())
                {

                    if(edTaxCard.getText().toString().isEmpty())
                    {
                        edTaxCard.setError("Password is Empty");

                    }
                    if ( edTaxRegister.getText().toString().isEmpty())
                    {
                        edTaxRegister.setError("Re-Password is Empty");
                    }
                    if (Specialization.getSelectedItem().toString().isEmpty())
                    {

                    }

                }
                else
                {
                    String eddTaxCard = edTaxCard.getText().toString();
                    String edTaxRegisterr = edTaxRegister.getText().toString();
                    String spSpeci=Specialization.getSelectedItem().toString();
                    SharedPreferences.Editor shared = getSharedPreferences("reg", MODE_PRIVATE).edit();
                    shared.putString("eddTaxCard", eddTaxCard);
                    shared.putString("edTaxRegisterr", edTaxRegisterr);
                    shared.putString("spSpeci",spSpeci);
                    shared.commit();

                    Intent intent = new Intent(Register_Three_Activity.this,login.class);
                    startActivity(intent);

                }
            }
        });

        BackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register_Three_Activity.this,Register_Two_Activity.class);
                startActivity(intent);
            }
        });
    }
}
