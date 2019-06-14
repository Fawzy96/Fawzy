package com.mohamedboltia.cargo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class welcome extends AppCompatActivity {
   String Token;
   SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        final int[] timeSec = new int[1];
        Thread splash_screen=new Thread(){

            @Override
            public void run() {
                // This method will be executed once the timer is over
                timeSec[0] = 3000;
                // Start your app main activity
                try {
                    sleep(timeSec[0]);

                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
                finally
                {
                    sharedPreferences=getSharedPreferences("reg",MODE_PRIVATE);
                    Token=sharedPreferences.getString("token",null);
                    if(Token!=null) {
                        Intent intent = new Intent(welcome.this, Request.class);

                        startActivity(intent);
                    }else {

                        Intent intent = new Intent(welcome.this, login.class);

                        startActivity(intent);

                    }




                }
            }  };
        splash_screen.start();
    }
}
