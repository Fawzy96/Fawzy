package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Request extends AppCompatActivity  {


    private EditText et_quantity,et_weight,et_width,et_length,
            et_height,et_Pickup,et_destination,et_StartD,et_EndD;
    Button nextt;
    String Total_weigth,quantity,weight,width,length,height,pickup,destination,startD,endD,Type,spin1,spin2,spin4,spin5;
    Spinner cargo_type,spinner1,spinner2,spinner4,spinner5;
    CheckBox checkBox;
//    Requset_Presenter requset_presenter;
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
        checkBox=(CheckBox)findViewById(R.id.checkBox);
//        requset_presenter=new Requset_Presenter(this,this);

        spinner();spinner1();spinner2();spinner5();spinner4();
     //   SharedPreferences shared=getSharedPreferences( "reg",MODE_PRIVATE);
     //   token =shared.getString("token","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjEzMywiaXNzIjoiaHR0cDovLzUyLjU5LjIzMS41OC9hcGkvdXNlci9sb2dpbiIsImlhdCI6MTU2MDUzMzE4MSwiZXhwIjo3NTYwNTMzMTgxLCJuYmYiOjE1NjA1MzMxODEsImp0aSI6IlZlWjRpQ2JGbEgwVENiTk0ifQ.PH4b1oSnO1eo90HJg5qjpdExGOLzInBTX-aK6UqoP9w\"");

    }

    public void Next(View view) {
        String Total_weigth;
         quantity    = (et_quantity.getText().toString());
         weight      = (et_weight.getText().toString());
         width       = (et_width.getText().toString());
         length      = (et_length.getText().toString());
         height      = (et_height.getText().toString());
         pickup      = et_Pickup.getText().toString();
         destination = et_destination.getText().toString();
         startD      = et_StartD.getText().toString();
         endD        = et_EndD.getText().toString();

        SharedPreferences file = getSharedPreferences("content",MODE_PRIVATE);
       SharedPreferences.Editor editor = file.edit();
        editor.putString("quan",quantity);
        editor.putString("weig",weight);
        editor.putString("wid",width);
        editor.putString("len",length);
        editor.putString("heig",height);
        editor.putString("pick",pickup);
        editor.putString("dest",destination);
        editor.putString("sdate",startD);
        editor.putString("edate",endD);
        editor.putString("type",Type);
        editor.putString("spinner1",spin1);
        editor.putString("spinner2",spin2);
        editor.putString("spinner4",spin4);
        editor.putString("spinner5",spin5);
        editor.commit();
//        Toast.makeText(this, "your data has been saved", Toast.LENGTH_SHORT).show();



        if (et_quantity.getText().toString().isEmpty() || et_weight
                .getText().toString().isEmpty() || et_height.getText()
                .toString().isEmpty() || et_width.getText().toString()
                .isEmpty()||et_length.getText().toString().isEmpty()||et_Pickup.getText().toString().isEmpty()||
                et_destination.getText().toString().isEmpty()|| et_StartD.getText().toString().isEmpty()||
                et_EndD.getText().toString().isEmpty()||!checkBox.isChecked())
        {
           if (et_quantity.getText().toString().isEmpty())
           {
               et_quantity.setError("Quantity is Empty");
           }
           if (et_weight.getText().toString().isEmpty())
           {
               et_weight.setError("Weight is Empty");
           }
           if (et_height.getText().toString().isEmpty())
           {
               et_height.setError("Height is Empty");
           }
           if (et_width.getText().toString().isEmpty())
           {
               et_width.setError("Width is Empty");
           }
           if (et_length.getText().toString().isEmpty())
           {
               et_length.setError("Length is Empty");
           }
           if (et_Pickup.getText().toString().isEmpty())
           {
               et_Pickup.setError("Pickup is Empty");
           }
           if (et_destination.getText().toString().isEmpty())
           {
               et_destination.setError("Destination is Empty");
           }
           if (et_StartD.getText().toString().isEmpty())
           {
               et_StartD.setError("Start Date is Empty");
           }
           if (et_EndD.getText().toString().isEmpty())
           {
               et_EndD.setError("End Date is Empty");
           }
           if (!checkBox.isChecked())
           {
               checkBox.setError("check");
           }
        }
        else
        {
            Intent intent = new Intent(this,Confirm_R_Activity.class);
            startActivity(intent);
        }
//        com.mohamedboltia.cargo.Model.Request request=new com.mohamedboltia.cargo.Model.Request();
//        request.setCargoType("solid");
//       request.setItemHeight(Double.valueOf(et_width.getText().toString()));
//        request.setDeliverTo("ca");
//   //  request.setItemHeight(height);
//       request.setItemLength(Double.valueOf(et_length .getText().toString()));
//       request.setItemWeight(Double.valueOf(et_weight.getText().toString()));
//        request.setItemWidth(Double.valueOf(et_length .getText().toString()));
//        request.setQuantity(Integer.valueOf(et_quantity.getText().toString()));
//        request.setStartDate(et_StartD.getText().toString());
//        request.setFinishDate(et_EndD.getText().toString());
//        request.setTotalWeight(77.1);
//      //  request.setTotalVolume(22);
//        request.setPickUpLocation(et_Pickup.getText().toString() );
//        request.setCompanyImportExport(133);
//
//     //  request.setItemHeight();
//
//        requset_presenter.requset(request);


    }

    public void spinner (){
         cargo_type = (Spinner)findViewById(R.id.cargoT);
        List<String> type = new ArrayList<>();
        type.add("Liquid");
        type.add("Solid");
        type.add("Frozen");
        //type.add("Select a type ");
        ArrayAdapter cargo = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,type);
        cargo.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        cargo_type.setAdapter(cargo);
        cargo_type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Type= cargo_type.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
       // cargo_type.setSelection(3);
             //  type.remove(3);
    }
    public void spinner1 (){
        spinner1 = (Spinner)findViewById(R.id.ton);
        List<String> type = new ArrayList<>();
        type.add("Ton");
        type.add("Kg");
                ArrayAdapter cargo = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,type);
        cargo.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1.setAdapter(cargo);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spin1= spinner1.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void spinner2 (){
        spinner2 = (Spinner)findViewById(R.id.mtr);
        List<String> type = new ArrayList<>();
        type.add("Meter");
        type.add("Cm");
        ArrayAdapter cargo = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,type);
        cargo.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(cargo);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spin2= spinner2.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void spinner5 (){
        spinner5 = (Spinner)findViewById(R.id.metr);
        List<String> type = new ArrayList<>();
        type.add("Meter");
        type.add("Cm");
        ArrayAdapter cargo = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,type);
        cargo.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner5.setAdapter(cargo);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spin5= spinner5.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
    public void spinner4 (){
        spinner4= (Spinner)findViewById(R.id.meter);
        List<String> type = new ArrayList<>();
        type.add("Meter");
        type.add("Cm");
        ArrayAdapter cargo = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,type);
        cargo.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner4.setAdapter(cargo);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spin4= spinner4.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
//    @Override
//    public void success() {
//        Toast.makeText(this, " El 7mdllah", Toast.LENGTH_SHORT).show();
//       // Intent intent = new Intent(Request.this,Drawer_Slide_Activity.class);
//      //  startActivity(intent);
//        finish();
//    }
//
//    @Override
//    public void Error() {
//        Intent intent = new Intent(Request.this,add_payment.class);
//        startActivity(intent);
//        finish();
//    }
}
