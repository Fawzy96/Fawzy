package com.mohamedboltia.cargo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class welcome extends AppCompatActivity {

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
                    Intent intent = new Intent(welcome.this, login.class);

                    startActivity(intent);




                }
            }  };
        splash_screen.start();
    }
}
