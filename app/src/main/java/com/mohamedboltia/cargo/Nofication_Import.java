package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Nofication_Import extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String[] member_names;
    TypedArray profile_pics;
    String[] statues;

    List<Row_Item_Two> rowItems;
    ListView mylistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nofication__import);

        rowItems = new ArrayList<Row_Item_Two>();

        member_names = getResources().getStringArray(R.array.names);

        profile_pics = getResources().obtainTypedArray(R.array.profile_piics);

        statues = getResources().getStringArray(R.array.statuess);



        for (int i = 0; i < member_names.length; i++) {
            Row_Item_Two item = new Row_Item_Two(member_names[i],
                    profile_pics.getResourceId(i, -1), statues[i]);
            rowItems.add(item);
        }

        mylistview = (ListView) findViewById(R.id.list_current_shipment);
        Custom_Adapter_Two adapter = new Custom_Adapter_Two(this, rowItems);
        mylistview.setAdapter(adapter);

        mylistview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(Nofication_Import.this,Select_Payment.class);
        startActivity(intent);
    }
}
