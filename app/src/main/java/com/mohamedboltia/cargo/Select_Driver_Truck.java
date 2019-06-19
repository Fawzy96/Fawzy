package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Select_Driver_Truck extends AppCompatActivity {

    Spinner spinnerDriver1,spinnerDriver2,spinnerDriver3,spinnerDriver4,spinnerTruck1,spinnerTruck2,spinnerTruck3,spinnerTruck4;
    String Type1,Type2,Type3,Type4,Type5,Type6,Type7,Type8;
    Button Donee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__driver__truck);
        ini();
        onclickk();
        spinner();
    }

    public void ini()
    {
        Donee=(Button)findViewById(R.id.Donee);
    }

    public void onclickk()
    {
        Donee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor shared = getSharedPreferences("reg", MODE_PRIVATE).edit();
                shared.putString("Type1", Type1);
                shared.putString("Type2", Type2);
                shared.putString("Type3", Type3);
                shared.putString("Type4", Type4);
                shared.putString("Type5", Type5);
                shared.putString("Type6", Type6);
                shared.putString("Type7", Type7);
                shared.putString("Type8", Type8);
                shared.commit();


                Intent intent = new Intent(Select_Driver_Truck.this,Your_Transporter.class);
                startActivity(intent);
            }
        });
    }

    public void spinner()
    {
        spinnerDriver1=(Spinner)findViewById(R.id.spinnerDriver1);
        List<String> statue =new ArrayList<>();
        statue.add("Ahmed Ali");
        statue.add("Mohamed Boltia");
        statue.add("Mohamed Fawzy");
        statue.add("Mohamed El-Sayed");
        statue.add("Ali Ahmed");
        statue.add("Mohamed Sayed");
        statue.add("Waleed Mohamed ");
        statue.add("Tarek Moahsen");
        statue.add("Ahmed Ghareeb");
        statue.add("Omar Nawar");
        statue.add("Kareem Emad ");
        statue.add("Hamada Hassen");
        ArrayAdapter statueAD =new ArrayAdapter(this, android.R.layout.simple_spinner_item,statue);
        statueAD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDriver1.setAdapter(statueAD);
        spinnerDriver1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Type1= spinnerDriver1.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        spinnerDriver2=(Spinner)findViewById(R.id.spinnerDriver2);
        List<String> Driver =new ArrayList<>();
        Driver.add("Ahmed Ali");
        Driver.add("Mohamed Boltia");
        Driver.add("Mohamed Fawzy");
        Driver.add("Mohamed El-Sayed");
        Driver.add("Ali Ahmed");
        Driver.add("Mohamed Sayed");
        Driver.add("Waleed Mohamed ");
        Driver.add("Tarek Moahsen");
        Driver.add("Ahmed Ghareeb");
        Driver.add("Omar Nawar");
        Driver.add("Kareem Emad ");
        Driver.add("Hamada Hassen");
        ArrayAdapter statueA =new ArrayAdapter(this, android.R.layout.simple_spinner_item,Driver);
        statueA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDriver2.setAdapter(statueA);
        spinnerDriver2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Type2= spinnerDriver2.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        spinnerDriver3=(Spinner)findViewById(R.id.spinnerDriver3);
        List<String> Driver2 =new ArrayList<>();
        Driver2.add("Ahmed Ali");
        Driver2.add("Mohamed Boltia");
        Driver2.add("Mohamed Fawzy");
        Driver2.add("Mohamed El-Sayed");
        Driver2.add("Ali Ahmed");
        Driver2.add("Mohamed Sayed");
        Driver2.add("Waleed Mohamed ");
        Driver2.add("Tarek Moahsen");
        Driver2.add("Ahmed Ghareeb");
        Driver2.add("Omar Nawar");
        Driver2.add("Kareem Emad ");
        Driver2.add("Hamada Hassen");
        ArrayAdapter statueAA =new ArrayAdapter(this, android.R.layout.simple_spinner_item,Driver2);
        statueAA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDriver3.setAdapter(statueAA);
        spinnerDriver3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Type3= spinnerDriver3.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        spinnerDriver4=(Spinner)findViewById(R.id.spinnerDriver4);
        List<String> Driver3 =new ArrayList<>();
        Driver3.add("Ahmed Ali");
        Driver3.add("Mohamed Boltia");
        Driver3.add("Mohamed Fawzy");
        Driver3.add("Mohamed El-Sayed");
        Driver3.add("Ali Ahmed");
        Driver3.add("Mohamed Sayed");
        Driver3.add("Waleed Mohamed ");
        Driver3.add("Tarek Moahsen");
        Driver3.add("Ahmed Ghareeb");
        Driver3.add("Omar Nawar");
        Driver3.add("Kareem Emad ");
        Driver3.add("Hamada Hassen");
        ArrayAdapter statueAAA =new ArrayAdapter(this, android.R.layout.simple_spinner_item,Driver3);
        statueAAA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDriver4.setAdapter(statueAAA);
        spinnerDriver4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Type4= spinnerDriver4.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spinnerTruck1=(Spinner)findViewById(R.id.spinnerTruck1);
        List<String> Truck =new ArrayList<>();
        Truck.add("475|ي ث ل");
        Truck.add("748|س ح م");
        Truck.add("658|ر ش ض");
        Truck.add("886|ش ب ل");
        Truck.add("879|ر ة ز");
        Truck.add("732|ك ط د");
        Truck.add("174|س غ غ");
        Truck.add("442|ر ر و");
        Truck.add("013|ص ص ء");
        Truck.add("993|ه ح ج");
        Truck.add("456|خ خ ح");
        Truck.add("999|ا ا ا");
        ArrayAdapter statueT =new ArrayAdapter(this, android.R.layout.simple_spinner_item,Truck);
        statueT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTruck1.setAdapter(statueT);
        spinnerTruck1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Type5= spinnerTruck1.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        spinnerTruck2=(Spinner)findViewById(R.id.spinnerTruck2);
        List<String> Truck1 =new ArrayList<>();
        Truck1.add("123|ن س ض");
        Truck1.add("748|س ح م");
        Truck1.add("658|ر ش ض");
        Truck1.add("886|ش ب ل");
        Truck1.add("879|ر ة ز");
        Truck1.add("732|ك ط د");
        Truck1.add("174|س غ غ");
        Truck1.add("442|ر ر و");
        Truck1.add("013|ص ص ء");
        Truck1.add("993|ه ح ج");
        Truck1.add("456|خ خ ح");
        Truck1.add("999|ا ا ا");
        ArrayAdapter statueTT =new ArrayAdapter(this, android.R.layout.simple_spinner_item,Truck1);
        statueTT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTruck2.setAdapter(statueTT);
        spinnerTruck2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Type6= spinnerTruck2.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        spinnerTruck3=(Spinner)findViewById(R.id.spinnerTruck3);
        List<String> Truck3 =new ArrayList<>();
        Truck3.add("123|ن س ض");
        Truck3.add("748|س ح م");
        Truck3.add("658|ر ش ض");
        Truck3.add("886|ش ب ل");
        Truck3.add("879|ر ة ز");
        Truck3.add("732|ك ط د");
        Truck3.add("174|س غ غ");
        Truck3.add("442|ر ر و");
        Truck3.add("013|ص ص ء");
        Truck3.add("993|ه ح ج");
        Truck3.add("456|خ خ ح");
        Truck3.add("999|ا ا ا");
        ArrayAdapter statueTTT =new ArrayAdapter(this, android.R.layout.simple_spinner_item,Truck3);
        statueTTT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTruck3.setAdapter(statueTTT);
        spinnerTruck3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Type7= spinnerTruck3.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        spinnerTruck4=(Spinner)findViewById(R.id.spinnerTruck4);
        List<String> Truck4 =new ArrayList<>();
        Truck4.add("123|ن س ض");
        Truck4.add("748|س ح م");
        Truck4.add("658|ر ش ض");
        Truck4.add("886|ش ب ل");
        Truck4.add("879|ر ة ز");
        Truck4.add("732|ك ط د");
        Truck4.add("174|س غ غ");
        Truck4.add("442|ر ر و");
        Truck4.add("013|ص ص ء");
        Truck4.add("993|ه ح ج");
        Truck4.add("456|خ خ ح");
        Truck4.add("999|ا ا ا");
        ArrayAdapter statueTTTT =new ArrayAdapter(this, android.R.layout.simple_spinner_item,Truck4);
        statueTTTT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTruck4.setAdapter(statueTTTT);
        spinnerTruck4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Type8= spinnerTruck4.getSelectedItem().toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
