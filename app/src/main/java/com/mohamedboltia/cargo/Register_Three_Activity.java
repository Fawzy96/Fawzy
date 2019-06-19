package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.mohamedboltia.cargo.Presenter.Register_Presenter;

import java.util.ArrayList;
import java.util.List;

public class Register_Three_Activity extends AppCompatActivity  {
    EditText edTaxCard,edTaxRegister;
    Spinner Specialization;
    Button buConfirm,BackToLogin;
    String compName,CompEmail,CompPhone,CommpAddress,RTPassword,Type;
    Register_Presenter register_presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__three_);
        ini();
        clickFun();
        spinner();




        SharedPreferences shared=getSharedPreferences( "reg",MODE_PRIVATE);
        compName =shared.getString("compName","");
        CompEmail=shared.getString("CompEmail","");
        CompPhone=shared.getString("CompPhone","");
        CommpAddress=shared.getString("CommpAddress","");
        RTPassword=shared.getString("RTPassword","");
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
        Specialization.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Type= Specialization.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
    public void ini()
    {
//        register_presenter=new Register_Presenter(this,this);
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
////
//                    UserRegister userRegister=new UserRegister();
//                    userRegister.setAddress(CommpAddress);
//                    userRegister.setCargo_specialization("ammm");
//                userRegister.setEmail(CompEmail);
//                userRegister.setFax("fax");
//                userRegister.setImage("ammm");
//                userRegister.setName(compName);
//                userRegister.setPassword(RTPassword);
//                userRegister.setTax_card(edTaxCard.getText().toString());
//                userRegister.setTax_file_number(edTaxRegister.getText().toString());
//                userRegister.setType(Type);
//                userRegister.setTax_register_number("register");
//                register_presenter.register(userRegister);

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

//    @Override
//    public void success() {
//        Intent intent = new Intent(Register_Three_Activity.this,Drawer_Slide_Activity.class);
//        startActivity(intent);
//        finish();
//    }
//
//    @Override
//    public void Error() {
//
//    }
}
