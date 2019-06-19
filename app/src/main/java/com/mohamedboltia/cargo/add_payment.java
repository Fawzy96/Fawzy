package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add_payment extends AppCompatActivity {

    EditText CardNumber,EXDate,CVV;
    Button nextpay;
    String Cardnumber,Cvv,Exdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_payment);

        CardNumber=(EditText)findViewById(R.id.CardNumber);
        EXDate=(EditText)findViewById(R.id.EXDate);
        CVV=(EditText)findViewById(R.id.CVV);
        nextpay=(Button)findViewById(R.id.nextpay);

        nextpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Cardnumber=CardNumber.getText().toString();
                Cvv=CVV.getText().toString();
                Exdate=EXDate.getText().toString();

                SharedPreferences.Editor shared = getSharedPreferences("reg", MODE_PRIVATE).edit();
                shared.putString("Cardnumber",Cardnumber);
                shared.putString("Cvv",Cvv);
//                shared.putString("spSpeci",Exdate);
                shared.commit();


                Intent intent = new Intent(add_payment.this,Select_Payment.class);
                startActivity(intent);
            }
        });

    }
}
