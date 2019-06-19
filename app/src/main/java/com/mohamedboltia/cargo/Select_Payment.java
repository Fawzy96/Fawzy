package com.mohamedboltia.cargo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Select_Payment extends AppCompatActivity {
    Button addPayment;
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
    }
}
