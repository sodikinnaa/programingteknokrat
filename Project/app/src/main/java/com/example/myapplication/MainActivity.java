package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Initialisasi
    EditText input1,input2;
    TextView output;
    Double v1,v2,hasil;
    ImageButton kang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menambahkan dari main aktivity
        input1 = (EditText) findViewById(R.id.inputpertama);
        input2 = (EditText) findViewById(R.id.inputkedua);
        output = (TextView) findViewById(R.id.hasil);
        kang = (ImageButton) findViewById(R.id.kurang);

        kang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                konver();

                hasil = v1 - v2;
                output.setText(Double.toString(hasil));
            }
        });
//        kang.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//
//                return true;
//            }
//        });
    }




    public void konver(){
        //konversi inputan ke double
        v1 = Double.parseDouble(input1.getText().toString());
        v2 = Double.parseDouble(input2.getText().toString());
    }

    public void prosestambah(View view) {
        konver();
        hasil = v1+v2;  //perhitungan
        output.setText(Double.toString(hasil));
    }
}