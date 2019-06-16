package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mohamedboltia.cargo.Presenter.Requset_Presenter;
import com.mohamedboltia.cargo.View.RequsetView;

public class Confirm_R_Activity extends AppCompatActivity implements RequsetView {

    private TextView tv_quantity,tv_weight,tv_width,tv_length,
            tv_height,tv_Pickup,tv_destination,tv_StartD,tv_EndD;

    Button Book;
    Requset_Presenter requset_presenter;
    String quantity;
    String weight;
    String width;
    String length;
    String Pickup;
    String destination;
    String StartD;
    String EndD;
    String height;
    String token;
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
        Book           =  (Button)  findViewById(R.id.Book);
        requset_presenter=new Requset_Presenter(this,this);

//        SharedPreferences shared=getSharedPreferences( "reg",MODE_PRIVATE);
//        token =shared.getString("token","");

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

        quantity=tv_quantity.getText().toString();
        weight=tv_weight.getText().toString();
        width=tv_width.getText().toString();
        length=tv_length.getText().toString();
        Pickup=tv_Pickup.getText().toString();
        StartD=tv_StartD.getText().toString();
        EndD=tv_EndD.getText().toString();
        height=tv_height.getText().toString();



        Book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



//                com.mohamedboltia.cargo.Model.Request request=new com.mohamedboltia.cargo.Model.Request();
//                request.setCargoType("solid");
//                request.setItemHeight("");
//                request.setDeliverTo("ca");
////              request.setItemHeight(height.);
//                request.setItemLength("");
//                request.setItemWeight("55");
//                request.setItemWidth("");
//                request.setQuantity("6");
//                request.setStartDate("1/2/2018");
//                request.setFinishDate("5/5/2019");
//                request.setTotalWeight("11");
//                request.setTotalVolume("10");
//                request.setPickUpLocation("misr");
//                request.setCompanyImportExport(token);
//                request.setId(token);
//                requset_presenter.requset(request);



            }
        });

    }
//
//    public void back(View view) {
//        Intent intent = new Intent(Confirm_R_Activity.this,Request.class);
//        startActivity(intent);
//    }

    @Override
    public void success() {
        Intent intent = new Intent(Confirm_R_Activity.this,Add_New_Truck.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void Error() {

    }
}
