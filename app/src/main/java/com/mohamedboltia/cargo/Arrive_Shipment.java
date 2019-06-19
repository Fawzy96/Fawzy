package com.mohamedboltia.cargo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Arrive_Shipment extends AppCompatActivity {

    Button yes,no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrive__shipment);

        yes=(Button)findViewById(R.id.yes);
        no=(Button)findViewById(R.id.no);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + "Cargo")));
                Intent intent = new Intent(Arrive_Shipment.this,Rate.class);
                startActivity(intent);
            }
        });


        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Arrive_Shipment.this,Select_Payment.class);
                startActivity(intent);
            }
        });
    }
}
