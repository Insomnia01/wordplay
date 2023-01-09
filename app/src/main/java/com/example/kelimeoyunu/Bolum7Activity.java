package com.example.kelimeoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.View.VISIBLE;

public class Bolum7Activity extends AppCompatActivity {
    //region değişkenler
    TextView harf1; TextView harf2; TextView harf3; TextView harf4; TextView harf5; TextView harf6; TextView harf7;
    TextView Aharfi; TextView Kharfi;TextView Iharfi;TextView Mharfi;TextView Kharfi2;TextView Charfi;TextView Aharfi2;

    TextView s1kutu1; TextView s1kutu2; TextView s1kutu3;
    TextView s2kutu1; TextView s2kutu2; TextView s2kutu3;
    TextView s3kutu1; TextView s3kutu2; TextView s3kutu3;
    TextView s4kutu1; TextView s4kutu2; TextView s4kutu3;
    TextView s5kutu1; TextView s5kutu2; TextView s5kutu3;
    TextView s6kutu1; TextView s6kutu2; TextView s6kutu3;
    TextView s7kutu1; TextView s7kutu2; TextView s7kutu3;
    TextView s8kutu1; TextView s8kutu2; TextView s8kutu3;
    TextView s9kutu1; TextView s9kutu2; TextView s9kutu3;

    TextView a1kutu1; TextView a1kutu2; TextView a1kutu3; TextView a1kutu4;
    TextView a2kutu1; TextView a2kutu2; TextView a2kutu3; TextView a2kutu4;
    TextView a3kutu1; TextView a3kutu2; TextView a3kutu3; TextView a3kutu4;
    TextView a4kutu1; TextView a4kutu2; TextView a4kutu3; TextView a4kutu4;
    TextView a5kutu1; TextView a5kutu2; TextView a5kutu3; TextView a5kutu4;
    TextView a6kutu1; TextView a6kutu2; TextView a6kutu3; TextView a6kutu4;
    TextView a7kutu1; TextView a7kutu2; TextView a7kutu3; TextView a7kutu4;
    TextView a8kutu1; TextView a8kutu2; TextView a8kutu3; TextView a8kutu4;

    TextView d1kutu1; TextView d1kutu2; TextView d1kutu3; TextView d1kutu4; TextView d1kutu5;
    TextView d2kutu1; TextView d2kutu2; TextView d2kutu3; TextView d2kutu4; TextView d2kutu5;

    TextView f1kutu1; TextView f1kutu2; TextView f1kutu3; TextView f1kutu4; TextView f1kutu5; TextView f1kutu6; TextView f1kutu7;
    TextView f2kutu1; TextView f2kutu2; TextView f2kutu3; TextView f2kutu4; TextView f2kutu5; TextView f2kutu6; TextView f2kutu7;
    //endregion
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolum7);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(getApplicationContext(),BolumlerActivity.class);
        startActivity(i);
    }
    public void imgbolumler(View view) {
        Intent i = new Intent(getApplicationContext(),BolumlerActivity.class);
        startActivity(i);
    }
    int sayac = 3;
    public void imgrecycle(View view) {
        ImageView imgrecycle = findViewById(R.id.imgrecycle);
        sayac--;
        if(sayac == 2){
            imgrecycle.setImageResource(R.drawable.loop2);
        }
        else if (sayac == 1){
            imgrecycle.setImageResource(R.drawable.loop1);
        }
        else if (sayac == 0){
            imgrecycle.setImageResource(R.drawable.loop0);
        }
    }

    public void txtharf(View view) {
        harf1 = findViewById(R.id.harf1); harf2 = findViewById(R.id.harf2); harf3 = findViewById(R.id.harf3);
        harf4 = findViewById(R.id.harf4); harf5 = findViewById(R.id.harf5); harf6 = findViewById(R.id.harf6);
        harf7 = findViewById(R.id.harf7);

        Aharfi = findViewById(R.id.Aharfi); Kharfi = findViewById(R.id.Kharfi); Iharfi = findViewById(R.id.Iharfi);
        Mharfi = findViewById(R.id.Mharfi); Kharfi2 = findViewById(R.id.Kharfi2); Charfi = findViewById(R.id.Charfi);
        Aharfi2 = findViewById(R.id.Aharfi2);

        String harftag = (String)view.getTag();
        view.setBackgroundColor(0XF44336);

        view.setVisibility(View.INVISIBLE);

        if (harf1.getText().equals("")){
            harf1.setText(harftag);
        }else if (harf2.getText().equals("")){
            harf2.setText(harftag);
        }else if (harf3.getText().equals("")){
            harf3.setText(harftag);
        }else if (harf4.getText().equals("")){
            harf4.setText(harftag);
        }else if (harf5.getText().equals("")){
            harf5.setText(harftag);
        }else if (harf6.getText().equals("")){
            harf6.setText(harftag);
        }else if (harf7.getText().equals("")){
            harf7.setText(harftag);
        }
    }

    public void imgresetle(View view) {
        Aharfi = findViewById(R.id.Aharfi); Kharfi = findViewById(R.id.Kharfi); Iharfi = findViewById(R.id.Iharfi);
        Mharfi = findViewById(R.id.Mharfi); Kharfi2 = findViewById(R.id.Kharfi2); Charfi = findViewById(R.id.Charfi);
        Aharfi2 = findViewById(R.id.Aharfi2);

        Aharfi.setVisibility(VISIBLE); Kharfi.setVisibility(VISIBLE); Iharfi.setVisibility(VISIBLE);
        Mharfi.setVisibility(VISIBLE); Kharfi2.setVisibility(VISIBLE); Charfi.setVisibility(VISIBLE);
        Aharfi2.setVisibility(VISIBLE);

        Aharfi.setBackgroundColor(Color.WHITE); Kharfi.setBackgroundColor(Color.WHITE); Iharfi.setBackgroundColor(Color.WHITE);
        Mharfi.setBackgroundColor(Color.WHITE); Kharfi2.setBackgroundColor(Color.WHITE); Charfi.setBackgroundColor(Color.WHITE);
        Aharfi2.setBackgroundColor(Color.WHITE);

        harf1.setText(""); harf2.setText(""); harf3.setText(""); harf4.setText("");
        harf5.setText(""); harf6.setText(""); harf7.setText("");
    }

    public void imgonayla(View view) {
        //region tanımlamalar
        Aharfi = findViewById(R.id.Aharfi);
        Kharfi = findViewById(R.id.Kharfi);
        Iharfi = findViewById(R.id.Iharfi);
        Mharfi = findViewById(R.id.Mharfi);
        Kharfi = findViewById(R.id.Kharfi);
        Charfi = findViewById(R.id.Charfi);
        Aharfi = findViewById(R.id.Aharfi);

        harf1 = findViewById(R.id.harf1);
        harf2 = findViewById(R.id.harf2);
        harf3 = findViewById(R.id.harf3);
        harf4 = findViewById(R.id.harf4);
        harf5 = findViewById(R.id.harf5);
        harf6 = findViewById(R.id.harf6);
        harf7 = findViewById(R.id.harf7);

        s1kutu1 = findViewById(R.id.s1kutu1);
        s1kutu2 = findViewById(R.id.s1kutu2);
        s1kutu3 = findViewById(R.id.s1kutu3);
        s2kutu1 = findViewById(R.id.s2kutu1);
        s2kutu2 = findViewById(R.id.s2kutu2);
        s2kutu3 = findViewById(R.id.s2kutu3);
        s3kutu1 = findViewById(R.id.s3kutu1);
        s3kutu2 = findViewById(R.id.s3kutu2);
        s3kutu3 = findViewById(R.id.s3kutu3);
        s4kutu1 = findViewById(R.id.s4kutu1);
        s4kutu2 = findViewById(R.id.s4kutu2);
        s4kutu3 = findViewById(R.id.s4kutu3);
        s5kutu1 = findViewById(R.id.s5kutu1);
        s5kutu2 = findViewById(R.id.s5kutu2);
        s5kutu3 = findViewById(R.id.s5kutu3);
        s6kutu1 = findViewById(R.id.s6kutu1);
        s6kutu2 = findViewById(R.id.s6kutu2);
        s6kutu3 = findViewById(R.id.s6kutu3);
        s7kutu1 = findViewById(R.id.s7kutu1);
        s7kutu2 = findViewById(R.id.s7kutu2);
        s7kutu3 = findViewById(R.id.s7kutu3);
        s8kutu1 = findViewById(R.id.s8kutu1);
        s8kutu2 = findViewById(R.id.s8kutu2);
        s8kutu3 = findViewById(R.id.s8kutu3);
        s9kutu1 = findViewById(R.id.s9kutu1);
        s9kutu2 = findViewById(R.id.s9kutu2);
        s9kutu3 = findViewById(R.id.s9kutu3);

        a1kutu1 = findViewById(R.id.a1kutu1);
        a1kutu2 = findViewById(R.id.a1kutu2);
        a1kutu3 = findViewById(R.id.a1kutu3);
        a1kutu4 = findViewById(R.id.a1kutu4);
        a2kutu1 = findViewById(R.id.a2kutu1);
        a2kutu2 = findViewById(R.id.a2kutu2);
        a2kutu3 = findViewById(R.id.a2kutu3);
        a2kutu4 = findViewById(R.id.a2kutu4);
        a3kutu1 = findViewById(R.id.a3kutu1);
        a3kutu2 = findViewById(R.id.a3kutu2);
        a3kutu3 = findViewById(R.id.a3kutu3);
        a3kutu4 = findViewById(R.id.a3kutu4);
        a4kutu1 = findViewById(R.id.a4kutu1);
        a4kutu2 = findViewById(R.id.a4kutu2);
        a4kutu3 = findViewById(R.id.a4kutu3);
        a4kutu4 = findViewById(R.id.a4kutu4);
        a5kutu1 = findViewById(R.id.a5kutu1);
        a5kutu2 = findViewById(R.id.a5kutu2);
        a5kutu3 = findViewById(R.id.a5kutu3);
        a5kutu4 = findViewById(R.id.a5kutu4);
        a6kutu1 = findViewById(R.id.a6kutu1);
        a6kutu2 = findViewById(R.id.a6kutu2);
        a6kutu3 = findViewById(R.id.a6kutu3);
        a6kutu4 = findViewById(R.id.a6kutu4);
        a7kutu1 = findViewById(R.id.a7kutu1);
        a7kutu2 = findViewById(R.id.a7kutu2);
        a7kutu3 = findViewById(R.id.a7kutu3);
        a7kutu4 = findViewById(R.id.a7kutu4);
        a8kutu1 = findViewById(R.id.a8kutu1);
        a8kutu2 = findViewById(R.id.a8kutu2);
        a8kutu3 = findViewById(R.id.a8kutu3);
        a8kutu4 = findViewById(R.id.a8kutu4);

        d1kutu1 = findViewById(R.id.d1kutu1);
        d1kutu2 = findViewById(R.id.d1kutu2);
        d1kutu3 = findViewById(R.id.d1kutu3);
        d1kutu4 = findViewById(R.id.d1kutu4);
        d1kutu5 = findViewById(R.id.d1kutu5);

        d2kutu1 = findViewById(R.id.d2kutu1);
        d2kutu2 = findViewById(R.id.d2kutu2);
        d2kutu3 = findViewById(R.id.d2kutu3);
        d2kutu4 = findViewById(R.id.d2kutu4);
        d2kutu5 = findViewById(R.id.d2kutu5);

        f1kutu1 = findViewById(R.id.f1kutu1);
        f1kutu2 = findViewById(R.id.f1kutu2);
        f1kutu3 = findViewById(R.id.f1kutu3);
        f1kutu4 = findViewById(R.id.f1kutu4);
        f1kutu5 = findViewById(R.id.f1kutu5);
        f1kutu6 = findViewById(R.id.f1kutu6);
        f1kutu7 = findViewById(R.id.f1kutu7);

        f2kutu1 = findViewById(R.id.f1kutu1);
        f2kutu2 = findViewById(R.id.f1kutu2);
        f2kutu3 = findViewById(R.id.f1kutu3);
        f2kutu4 = findViewById(R.id.f1kutu4);
        f2kutu5 = findViewById(R.id.f1kutu5);
        f2kutu6 = findViewById(R.id.f1kutu6);
        f2kutu7 = findViewById(R.id.f1kutu7);
        //endregion tanımlamalar
        if (!harf1.getText().equals("") && !harf2.getText().equals("") && !harf3.getText().equals("") && harf4.getText().equals("") ) {
            if (harf1.getText().equals("A") && harf2.getText().equals("K") && harf3.getText().equals("A")) {
                s1kutu1.setText("A");
                s1kutu2.setText("K");
                s1kutu3.setText("A");
                Aharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } if (harf1.getText().equals("A") && harf2.getText().equals("K") && harf3.getText().equals("I")) {
                s1kutu1.setText("A");
                s1kutu2.setText("K");
                s1kutu3.setText("I");
                Aharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Iharfi.setVisibility(VISIBLE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                Iharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("K") && harf2.getText().equals("A") && harf3.getText().equals("M")) {
                s3kutu1.setText("K");
                s3kutu2.setText("A");
                s3kutu3.setText("M");
                Kharfi.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Aharfi.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Mharfi.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                Mharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("A") && harf2.getText().equals("M") && harf3.getText().equals("A")) {
                s4kutu1.setText("A");
                s4kutu2.setText("M");
                s4kutu3.setText("A");
                Aharfi.setVisibility(VISIBLE);
                Mharfi.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Mharfi.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("C") && harf2.getText().equals("I") && harf3.getText().equals("K")) {
                s5kutu1.setText("C");
                s5kutu2.setText("I");
                s5kutu3.setText("K");
                Charfi.setVisibility(VISIBLE);
                Iharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Charfi.setBackgroundColor(Color.WHITE);
                Iharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("C") && harf2.getText().equals("A") && harf3.getText().equals("M")) {
                s6kutu1.setText("C");
                s6kutu2.setText("A");
                s6kutu3.setText("M");
                Charfi.setVisibility(VISIBLE);
                Aharfi.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Mharfi.setVisibility(VISIBLE);
                Charfi.setBackgroundColor(Color.WHITE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                Mharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("A") && harf2.getText().equals("C") && harf3.getText().equals("I")) {
                s7kutu1.setText("A");
                s7kutu2.setText("C");
                s7kutu3.setText("I");
                Aharfi.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Charfi.setVisibility(VISIBLE);
                Iharfi.setVisibility(VISIBLE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                Charfi.setBackgroundColor(Color.WHITE);
                Iharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("K") && harf2.getText().equals("A") && harf3.getText().equals("K")) {
                s8kutu1.setText("K");
                s8kutu2.setText("A");
                s8kutu3.setText("K");
                Kharfi.setVisibility(VISIBLE);
                Aharfi.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("K") && harf2.getText().equals("A") && harf3.getText().equals("K")) {
                s9kutu1.setText("K");
                s9kutu2.setText("A");
                s9kutu3.setText("K");
                Kharfi.setVisibility(VISIBLE);
                Aharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            }
        }else if(!harf1.getText().equals("") && !harf2.getText().equals("") && !harf3.getText().equals("") && !harf4.getText().equals("") && harf5.getText().equals("")){
            if(harf1.getText().equals("K") && harf2.getText().equals("A") && harf3.getText().equals("K") && harf4.getText().equals("A")) {
                a1kutu1.setText("K");
                a1kutu2.setText("A");
                a1kutu3.setText("K");
                a1kutu4.setText("A");
                Kharfi.setVisibility(VISIBLE);
                Aharfi.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("A") && harf2.getText().equals("K") && harf3.getText().equals("A") && harf4.getText().equals("K")) {
                a1kutu1.setText("A");
                a1kutu2.setText("K");
                a1kutu3.setText("A");
                a1kutu4.setText("K");
                Kharfi.setVisibility(VISIBLE);
                Aharfi.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("K") && harf2.getText().equals("A") && harf3.getText().equals("M") && harf4.getText().equals("A")) {
                a3kutu1.setText("K");
                a3kutu2.setText("A");
                a3kutu3.setText("M");
                a3kutu4.setText("A");
                Kharfi.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Aharfi.setVisibility(VISIBLE);
                Mharfi.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Mharfi.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("Ç") && harf2.getText().equals("I") && harf3.getText().equals("R") && harf4.getText().equals("A")) {
                a4kutu1.setText("A");
                a4kutu2.setText("K");
                a4kutu3.setText("I");
                a4kutu4.setText("M");
                Aharfi.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Iharfi.setVisibility(VISIBLE);
                Mharfi.setVisibility(VISIBLE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                Iharfi.setBackgroundColor(Color.WHITE);
                Mharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("C") && harf2.getText().equals("A") && harf3.getText().equals("K") && harf4.getText().equals("A")) {
                a5kutu1.setText("C");
                a5kutu2.setText("A");
                a5kutu3.setText("K");
                a5kutu4.setText("A");
                Charfi.setVisibility(VISIBLE);
                Aharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Charfi.setBackgroundColor(Color.WHITE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("A") && harf2.getText().equals("M") && harf3.getText().equals("C") && harf4.getText().equals("A")) {
                a6kutu1.setText("A");
                a6kutu2.setText("M");
                a6kutu3.setText("C");
                a6kutu4.setText("A");
                Aharfi.setVisibility(VISIBLE);
                Mharfi.setVisibility(VISIBLE);
                Charfi.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Mharfi.setBackgroundColor(Color.WHITE);
                Charfi.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("A") && harf2.getText().equals("K") && harf3.getText().equals("M") && harf4.getText().equals("A")) {
                a7kutu1.setText("A");
                a7kutu2.setText("K");
                a7kutu3.setText("M");
                a7kutu4.setText("A");
                Aharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Mharfi.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                Mharfi.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
        }
        else if(!harf1.getText().equals("") && !harf2.getText().equals("") && !harf3.getText().equals("") && !harf4.getText().equals("") && !harf5.getText().equals("") && harf6.getText().equals("")) {
            if (harf1.getText().equals("M") && harf2.getText().equals("A") && harf3.getText().equals("K") && harf4.getText().equals("A") && harf5.getText().equals("K")) {
                d1kutu1.setText("M");
                d1kutu2.setText("A");
                d1kutu3.setText("K");
                d1kutu4.setText("A");
                d1kutu5.setText("K");
                Mharfi.setVisibility(VISIBLE);
                Aharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Mharfi.setBackgroundColor(Color.WHITE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
                harf5.setText("");
            }
            else if(harf1.getText().equals("K") && harf2.getText().equals("A") && harf3.getText().equals("K") && harf4.getText().equals("M") && harf5.getText().equals("A")) {
                d2kutu1.setText("K");
                d2kutu2.setText("A");
                d2kutu3.setText("K");
                d2kutu4.setText("M");
                d2kutu5.setText("A");
                Kharfi.setVisibility(VISIBLE);
                Aharfi.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Mharfi.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                Mharfi.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
                harf5.setText("");
            }
        }
        else if(!harf1.getText().equals("") && !harf2.getText().equals("") && !harf3.getText().equals("") && !harf4.getText().equals("") && !harf5.getText().equals("") && !harf6.getText().equals("") && !harf7.getText().equals("")){
            if(harf1.getText().equals("K") && harf2.getText().equals("A") && harf3.getText().equals("K") && harf4.getText().equals("M") && harf5.getText().equals("A") && harf6.getText().equals("C") && harf7.getText().equals("I"))
            {
                f1kutu1.setText("K");
                f1kutu2.setText("A");
                f1kutu3.setText("K");
                f1kutu4.setText("M");
                f1kutu5.setText("A");
                f1kutu6.setText("C");
                f1kutu7.setText("I");
                Kharfi.setVisibility(VISIBLE);
                Aharfi.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Mharfi.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Charfi.setVisibility(VISIBLE);
                Iharfi.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                Mharfi.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                Charfi.setBackgroundColor(Color.WHITE);
                Iharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
                harf5.setText("");
                harf6.setText("");
                harf7.setText("");
            }
            if(harf1.getText().equals("K") && harf2.getText().equals("A") && harf3.getText().equals("K") && harf4.getText().equals("M") && harf5.getText().equals("A") && harf6.getText().equals("C") && harf7.getText().equals("I"))
            {
                f2kutu1.setText("A");
                f1kutu2.setText("C");
                f1kutu3.setText("I");
                f1kutu4.setText("K");
                f1kutu5.setText("M");
                f1kutu6.setText("A");
                f1kutu7.setText("K");
                Kharfi.setVisibility(VISIBLE);
                Aharfi.setVisibility(VISIBLE);
                Kharfi2.setVisibility(VISIBLE);
                Mharfi.setVisibility(VISIBLE);
                Aharfi2.setVisibility(VISIBLE);
                Charfi.setVisibility(VISIBLE);
                Iharfi.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Aharfi.setBackgroundColor(Color.WHITE);
                Kharfi2.setBackgroundColor(Color.WHITE);
                Mharfi.setBackgroundColor(Color.WHITE);
                Aharfi2.setBackgroundColor(Color.WHITE);
                Charfi.setBackgroundColor(Color.WHITE);
                Iharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
                harf5.setText("");
                harf6.setText("");
                harf7.setText("");
            }
        }
    }
}
