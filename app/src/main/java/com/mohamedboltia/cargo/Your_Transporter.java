package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Your_Transporter extends AppCompatActivity {

    TextView nameDriver1,nameDriver2,nameDriver3 ,nameDriver4, nameTruck1 ,nameTruck2 ,nameTruck3 ,nameTruck4;
    Button editt,Doneee;
    String Driver1,Driver2,Driver3,Driver4,Truck1,Truck2,Truck3,Truck4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your__transporter);


        ini();

        SharedPreferences shared=getSharedPreferences( "reg",MODE_PRIVATE);
        Driver1 =shared.getString("Type1","");
        Driver2=shared.getString("Type2","");
        Driver3=shared.getString("Type3","");
        Driver4=shared.getString("Type4","");
        Truck1=shared.getString("Type5","");
        Truck2=shared.getString("Type6","");
        Truck3=shared.getString("Type7","");
        Truck4=shared.getString("Type8","");

        nameDriver1.setText(Driver1);
        nameDriver2.setText(Driver2);
        nameDriver3.setText(Driver3);
        nameDriver4.setText(Driver4);
        nameTruck1.setText(Truck1);
        nameTruck2.setText(Truck2);
        nameTruck3.setText(Truck3);
        nameTruck4.setText(Truck4);

        Doneee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Your_Transporter.this,add_payment.class);
                startActivity(intent);
            }
        });

        editt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Your_Transporter.this,Select_Driver_Truck.class);
                startActivity(intent);
            }
        });
    }


    public void ini()
    {
        nameDriver1=(TextView)findViewById(R.id.nameDriver1);
        nameDriver2=(TextView)findViewById(R.id.nameDriver2);
        nameDriver3=(TextView)findViewById(R.id.nameDriver3);
        nameDriver4=(TextView)findViewById(R.id.nameDriver4);
        nameTruck1=(TextView)findViewById(R.id.nameTruck1);
        nameTruck2=(TextView)findViewById(R.id.nameTruck2);
        nameTruck3=(TextView)findViewById(R.id.nameTruck3);
        nameTruck4=(TextView)findViewById(R.id.nameTruck4);

        editt=(Button)findViewById(R.id.ed);
        Doneee=(Button)findViewById(R.id.Do);
    }


}
