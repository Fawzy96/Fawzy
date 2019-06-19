package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Select_Payment extends AppCompatActivity {
    Button addPayment;
    TextView Cardnumber1,Cardnumber2,Cardnumber3,cvv1,cvv2,cvv3;
    String cardnumber1,cardnumber2,cardnumber3,Cvv1,Cvv2,Cvv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__payment);

        addPayment=(Button)findViewById(R.id.addPayment);

        addPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Select_Payment.this,add_payment.class);
                startActivity(intent);
            }
        });

        Cardnumber1=(TextView)findViewById(R.id.Cardnumber1);
        Cardnumber2=(TextView)findViewById(R.id.Cardnumber2);
        Cardnumber3=(TextView)findViewById(R.id.Cardnumber3);
        cvv1=(TextView)findViewById(R.id.cvv1);
        cvv2=(TextView)findViewById(R.id.cvv2);
        cvv3=(TextView)findViewById(R.id.cvv3);


        SharedPreferences shared=getSharedPreferences( "reg",MODE_PRIVATE);
        cardnumber1 =shared.getString("Cardnumber","");
        cardnumber2=shared.getString("Cardnumber","");
        cardnumber3=shared.getString("Cardnumber","");
        Cvv1 =shared.getString("Cvv","");
        Cvv2=shared.getString("Cvv","");
        Cvv3=shared.getString("Cvv","");

        Cardnumber1.setText(cardnumber1);
        Cardnumber2.setText(cardnumber2);
        Cardnumber3.setText(cardnumber3);
        cvv1.setText(Cvv1);
        cvv2.setText(Cvv2);
        cvv3.setText(Cvv3);
    }
}
