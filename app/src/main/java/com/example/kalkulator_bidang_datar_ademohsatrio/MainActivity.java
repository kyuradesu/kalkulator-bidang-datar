package com.example.kalkulator_bidang_datar_ademohsatrio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void persegi(View view) {
        Intent intent = new Intent(MainActivity.this, Persegi.class);
        startActivity(intent);
    }

    public void persegi_panjang(View view) {
        Intent intent = new Intent(MainActivity.this, PersegiPanjang.class);
        startActivity(intent);
    }

    public void segitiga(View view) {
        Intent intent = new Intent(MainActivity.this, Segitiga.class);
        startActivity(intent);
    }

    public void lingkaran(View view) {
        Intent intent = new Intent(MainActivity.this, Lingkaran.class);
        startActivity(intent);
    }

}