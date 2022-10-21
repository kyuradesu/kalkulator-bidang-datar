package com.example.kalkulator_bidang_datar_ademohsatrio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;


public class PersegiPanjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

        final EditText panjang = (EditText) findViewById(R.id.panjang);
        final EditText lebar = (EditText) findViewById(R.id.lebar);
        final Button hitung = (Button) findViewById(R.id.hitungpersegipanjang);
        final TextView hasil = (TextView) findViewById(R.id.hasilpersegipanjang);


        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang1 = panjang.getText().toString();
                String lebar1 = lebar.getText().toString();
                double panjang2 = Double.parseDouble(panjang1);
                double lebar2 = Double.parseDouble(lebar1);
                double luas = panjang2 * lebar2;
                double keliling = 2 * (panjang2 + lebar2);
                hasil.setText("Luas = " + luas +", Keliling = " + keliling);

            }
        });

    }
}