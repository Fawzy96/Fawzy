package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.mohamedboltia.cargo.Presenter.Requset_Presenter;
import com.mohamedboltia.cargo.View.RequsetView;

import java.util.ArrayList;
import java.util.List;

public class Request extends AppCompatActivity implements RequsetView {

    private EditText et_quantity,et_weight,et_width,et_length,
            et_height,et_Pickup,et_destination,et_StartD,et_EndD;
    Button nextt;
    String token;
    Requset_Presenter requset_presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        et_quantity    = (EditText) findViewById(R.id.quantity);
        et_weight      = (EditText) findViewById(R.id.weight);
        et_width       = (EditText) findViewById(R.id.width);
        et_length      = (EditText) findViewById(R.id.length);
        et_height      = (EditText) findViewById(R.id.height);
        et_Pickup      = (EditText) findViewById(R.id.pickup);
        et_destination = (EditText) findViewById(R.id.dest);
        et_StartD      = (EditText) findViewById(R.id.sdate);
        et_EndD        = (EditText) findViewById(R.id.edate);
        requset_presenter=new Requset_Presenter(this,this);

        spinner();spinner1();spinner2();spinner5();spinner4();
        SharedPreferences shared=getSharedPreferences( "reg",MODE_PRIVATE);
        token =shared.getString("token","");

    }
    public void Next(View view) {
//        String quantity    = et_quantity.getText().toString();
//        String weight      = et_weight.getText().toString();
//        String width       = et_width.getText().toString();
//        String length      = et_length.getText().toString();
//        String height      = et_height.getText().toString();
//        String pickup      = et_Pickup.getText().toString();
//        String destination = et_destination.getText().toString();
//        String startD      = et_StartD.getText().toString();
//        String endD        = et_EndD.getText().toString();
//        SharedPreferences file = getSharedPreferences("content",MODE_PRIVATE);
//        SharedPreferences.Editor editor = file.edit();
//        editor.putString("quan",quantity);
//        editor.putString("weig",weight);
//        editor.putString("wid",width);
//        editor.putString("len",length);
//        editor.putString("heig",height);
//        editor.putString("pick",pickup);
//        editor.putString("dest",destination);
//        editor.putString("sdate",startD);
//        editor.putString("edate",endD);
//        editor.commit();
//        Toast.makeText(this, "your data has been saved", Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(this,Confirm_R_Activity.class);
//        startActivity(intent);
        com.mohamedboltia.cargo.Model.Request request=new com.mohamedboltia.cargo.Model.Request();
        request.setCargoType("solid");
        request.setItemHeight("");
        request.setDeliverTo("ca");
//      request.setItemHeight(height.);
        request.setItemLength("");
        request.setItemWeight("55");
        request.setItemWidth("");
        request.setQuantity("6");
        request.setStartDate("1/2/2018");
        request.setFinishDate("5/5/2019");
        request.setTotalWeight("11");
        request.setTotalVolume(22);
        request.setPickUpLocation("misr");
        request.setCompanyImportExport(134);
        request.setId(134);
        request.setUpdatedAt("s");
        request.setCreatedAt("ss");

//        request.setItemHeight("");

        requset_presenter.requset(request);


    }

    public void spinner (){
        Spinner cargo_type = (Spinner)findViewById(R.id.cargoT);
        List<String> type = new ArrayList<>();
        type.add("Liquid");
        type.add("Solid");
        type.add("Frozen");
        //type.add("Select a type ");
        ArrayAdapter cargo = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,type);
        cargo.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        cargo_type.setAdapter(cargo);
       // cargo_type.setSelection(3);
             //  type.remove(3);
    }
    public void spinner1 (){
        Spinner cargo_type = (Spinner)findViewById(R.id.ton);
        List<String> type = new ArrayList<>();
        type.add("Ton");
        type.add("Kg");
                ArrayAdapter cargo = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,type);
        cargo.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        cargo_type.setAdapter(cargo);
    }

    public void spinner2 (){
        Spinner cargo_type = (Spinner)findViewById(R.id.mtr);
        List<String> type = new ArrayList<>();
        type.add("Meter");
        type.add("Cm");
        ArrayAdapter cargo = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,type);
        cargo.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        cargo_type.setAdapter(cargo);
    }

    public void spinner5 (){
        Spinner cargo_type = (Spinner)findViewById(R.id.metr);
        List<String> type = new ArrayList<>();
        type.add("Meter");
        type.add("Cm");
        ArrayAdapter cargo = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,type);
        cargo.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        cargo_type.setAdapter(cargo);
    }
    public void spinner4 (){
        Spinner cargo_type = (Spinner)findViewById(R.id.meter);
        List<String> type = new ArrayList<>();
        type.add("Meter");
        type.add("Cm");
        ArrayAdapter cargo = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,type);
        cargo.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        cargo_type.setAdapter(cargo);
    }
    @Override
    public void success() {
        Intent intent = new Intent(Request.this,Drawer_Slide_Activity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void Error() {
        Intent intent = new Intent(Request.this,add_payment.class);
        startActivity(intent);
        finish();
    }
}
