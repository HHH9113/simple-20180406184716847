package com.example.mr.pcal;

import android.content.Intent;
import android.os.Handler;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

import android.widget.Toast;


import java.util.Random;

import java.util.Timer;

import java.util.TimerTask;


import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    int w=0;
    int r=4;
int z=38;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText getValueByBluetooth =findViewById(R.id.bluetoothIni);
        final EditText getValueByBluetoothHC05 =findViewById(R.id.bluetoothfini);
        Button button= (Button) findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Thread t = new Thread() {

                    @Override
                    public void run() {
                        try {
                            while (!isInterrupted()) {
                                Thread.sleep(1000);
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        final int random = new Random().nextInt(80) + 20;

                                        getValueByBluetooth.setText(w + "L " + "0" + "ML");
                                        getValueByBluetoothHC05.setText(r + "L " + z + "ML");

                                        // update TextView here!
                                    }
                                });
                            }
                        } catch (InterruptedException e) {
                        }
                    }
                };

                t.start();
            }
        });

    }
};












