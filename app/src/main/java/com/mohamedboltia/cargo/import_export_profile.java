package com.mohamedboltia.cargo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class import_export_profile extends AppCompatActivity {

    TextView texnamecompany2,emailprofile,phoneProfile,addressProfile,passwordProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_import_export_profile);

        ini();

//        SharedPreferences shared=getSharedPreferences( "reg",MODE_PRIVATE);
//        emailprofilee =shared.getString("CompEmail","");
//        PasswordProfile=shared.getString("RTPassword","");
//        NameProfile=shared.getString("compName","");
//        AddressProfile=shared.getString("CommpAddress","");
//        PhoneProfile=shared.getString("CompPhone","");

        SharedPreferences shared = getSharedPreferences("reg",MODE_PRIVATE);
        texnamecompany2.setText(shared.getString("compName",""));
        emailprofile.setText(shared.getString("CompEmail",""));
        phoneProfile.setText(shared.getString("CompPhone",""));
        addressProfile.setText(shared.getString("CommpAddress",""));
        passwordProfile.setText(shared.getString("RTPassword",""));

    }
    public void ini()
    {
        texnamecompany2=(TextView)findViewById(R.id.texnamecompany10);
        emailprofile=(TextView)findViewById(R.id.emailprofileTransport);
        phoneProfile=(TextView)findViewById(R.id.phoneProfileTransport);
        addressProfile=(TextView)findViewById(R.id.addressProfileTransport);
        passwordProfile=(TextView)findViewById(R.id.passwordProfileTransport);
    }
    public void onclickk()
    {

    }
}
