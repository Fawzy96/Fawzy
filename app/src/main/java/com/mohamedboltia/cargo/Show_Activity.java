package com.mohamedboltia.cargo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Show_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_);
    }

    public void show(View view) {
        SharedPreferences file = getSharedPreferences("content",MODE_PRIVATE);
        Toast.makeText(this, " "+file.getString("quan",null)
                +"\n"+file.getString("edate",null), Toast.LENGTH_SHORT).show();
    }
}
