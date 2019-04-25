package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Confirm_R_Activity extends AppCompatActivity {

    private TextView tv_quantity,tv_weight,tv_width,tv_length,
            tv_height,tv_Pickup,tv_destination,tv_StartD,tv_EndD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm__r_);
        tv_quantity    = (TextView) findViewById(R.id.quantit);
        tv_weight      = (TextView) findViewById(R.id.weigh);
        tv_width       = (TextView) findViewById(R.id.widt);
        tv_length      = (TextView) findViewById(R.id.lengt);
        tv_height      = (TextView) findViewById(R.id.heigh);
        tv_Pickup      = (TextView) findViewById(R.id.pickp);
        tv_destination = (TextView) findViewById(R.id.destinaton);
        tv_StartD      = (TextView) findViewById(R.id.starD);
        tv_EndD        = (TextView) findViewById(R.id.endd);

        SharedPreferences file = getSharedPreferences("content",MODE_PRIVATE);
        tv_quantity   .setText("Quantity    : "+file.getString("quan",null));
        tv_weight     .setText("Weight      : "+file.getString("weig",null));
        tv_width      .setText("Width        : "+file.getString("wid",null));
        tv_length     .setText("Length     : "+file.getString("len",null));
        tv_height     .setText("Height      : "+file.getString("heig",null));
        tv_Pickup     .setText("Pick up     : "+file.getString("pick",null));
        tv_destination.setText("Destination : "+file.getString("dest",null));
        tv_StartD     .setText("Start Date :"+file.getString("sdate",null));
        tv_EndD       .setText("End Date :"+file.getString("edate",null));

    }

    public void back(View view) {
        Intent intent = new Intent(Confirm_R_Activity.this,Request.class);
        startActivity(intent);
    }
}
