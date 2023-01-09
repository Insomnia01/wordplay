package com.example.kelimeoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.View.VISIBLE;

public class Bolum3Activity extends AppCompatActivity {
    //region değişkenler
    TextView harf1; TextView harf2; TextView harf3; TextView harf4; TextView harf5; TextView harf6; TextView harf7;
    TextView Şharfi; TextView Eharfi;TextView İharfi;TextView Dharfi;TextView Kharfi;TextView Ğharfi;TextView İharfi2;


    TextView s1kutu1; TextView s1kutu2; TextView s1kutu3;
    TextView s2kutu1; TextView s2kutu2; TextView s2kutu3;
    TextView s3kutu1; TextView s3kutu2; TextView s3kutu3;
    TextView s4kutu1; TextView s4kutu2; TextView s4kutu3;
    TextView s5kutu1; TextView s5kutu2; TextView s5kutu3;
    TextView s6kutu1; TextView s6kutu2; TextView s6kutu3;
    TextView s7kutu1; TextView s7kutu2; TextView s7kutu3;
    TextView s8kutu1; TextView s8kutu2; TextView s8kutu3;

    TextView a1kutu1; TextView a1kutu2; TextView a1kutu3; TextView a1kutu4;
    TextView a2kutu1; TextView a2kutu2; TextView a2kutu3; TextView a2kutu4;
    TextView a3kutu1; TextView a3kutu2; TextView a3kutu3; TextView a3kutu4;
    TextView a4kutu1; TextView a4kutu2; TextView a4kutu3; TextView a4kutu4;
    TextView a5kutu1; TextView a5kutu2; TextView a5kutu3; TextView a5kutu4;
    TextView a6kutu1; TextView a6kutu2; TextView a6kutu3; TextView a6kutu4;

    TextView d1kutu1; TextView d1kutu2; TextView d1kutu3; TextView d1kutu4; TextView d1kutu5;
    TextView d2kutu1; TextView d2kutu2; TextView d2kutu3; TextView d2kutu4; TextView d2kutu5;
    TextView d3kutu1; TextView d3kutu2; TextView d3kutu3; TextView d3kutu4; TextView d3kutu5;

    TextView f1kutu1; TextView f1kutu2; TextView f1kutu3; TextView f1kutu4; TextView f1kutu5; TextView f1kutu6; TextView f1kutu7;
    //endregion
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolum3);
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

        Şharfi = findViewById(R.id.Şharfi); Eharfi = findViewById(R.id.Eharfi); İharfi = findViewById(R.id.İharfi);
        İharfi2 = findViewById(R.id.İharfi2); Dharfi = findViewById(R.id.Dharfi); Kharfi = findViewById(R.id.Kharfi);
        Ğharfi = findViewById(R.id.Ğharfi);

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
        Şharfi = findViewById(R.id.Şharfi); Eharfi = findViewById(R.id.Eharfi); İharfi2 = findViewById(R.id.İharfi2);
        İharfi = findViewById(R.id.İharfi); Dharfi= findViewById(R.id.Dharfi); Kharfi = findViewById(R.id.Kharfi);
        Ğharfi = findViewById(R.id.Ğharfi);

        Şharfi.setVisibility(VISIBLE); Eharfi.setVisibility(VISIBLE); İharfi2.setVisibility(VISIBLE);
        İharfi.setVisibility(VISIBLE); Dharfi.setVisibility(VISIBLE); Kharfi.setVisibility(VISIBLE);
        Ğharfi.setVisibility(VISIBLE);

        Şharfi.setBackgroundColor(Color.WHITE); Eharfi.setBackgroundColor(Color.WHITE); İharfi2.setBackgroundColor(Color.WHITE);
        İharfi.setBackgroundColor(Color.WHITE); Dharfi.setBackgroundColor(Color.WHITE); Kharfi.setBackgroundColor(Color.WHITE);
        Ğharfi.setBackgroundColor(Color.WHITE);

        harf1.setText(""); harf2.setText(""); harf3.setText(""); harf4.setText("");
        harf5.setText(""); harf6.setText(""); harf7.setText("");
    }

    public void imgonayla(View view) {
//region tanımlamalar
        Kharfi = findViewById(R.id.Kharfi);
        İharfi = findViewById(R.id.İharfi);
        İharfi2 = findViewById(R.id.İharfi2);
        Ğharfi = findViewById(R.id.Ğharfi);
        Şharfi = findViewById(R.id.Şharfi);
        Eharfi = findViewById(R.id.Eharfi);
        Dharfi = findViewById(R.id.Dharfi);

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

        d3kutu1 = findViewById(R.id.d3kutu1);
        d3kutu2 = findViewById(R.id.d3kutu2);
        d3kutu3 = findViewById(R.id.d3kutu3);
        d3kutu4 = findViewById(R.id.d3kutu4);
        d3kutu5 = findViewById(R.id.d3kutu5);

        f1kutu1 = findViewById(R.id.f1kutu1);
        f1kutu2 = findViewById(R.id.f1kutu2);
        f1kutu3 = findViewById(R.id.f1kutu3);
        f1kutu4 = findViewById(R.id.f1kutu4);
        f1kutu5 = findViewById(R.id.f1kutu5);
        f1kutu6 = findViewById(R.id.f1kutu6);
        f1kutu7 = findViewById(R.id.f1kutu7);
        //endregion
        if (!harf1.getText().equals("") && !harf2.getText().equals("") && !harf3.getText().equals("") && harf4.getText().equals("") ) {
            if (harf1.getText().equals("D") && harf2.getText().equals("İ") && harf3.getText().equals("Ş")) {
                s1kutu1.setText("D");
                s1kutu2.setText("İ");
                s1kutu3.setText("Ş");
                Dharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Şharfi.setVisibility(VISIBLE);
                Dharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                Şharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("K") && harf2.getText().equals("E") && harf3.getText().equals("Ş")) {
                s2kutu1.setText("K");
                s2kutu2.setText("E");
                s2kutu3.setText("Ş");
                Kharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                Şharfi.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Şharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("Ş") && harf2.getText().equals("E") && harf3.getText().equals("K")) {
                s3kutu1.setText("Ş");
                s3kutu2.setText("E");
                s3kutu3.setText("K");
                Şharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Şharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("Ş") && harf2.getText().equals("İ") && harf3.getText().equals("İ")) {
                s4kutu1.setText("Ş");
                s4kutu2.setText("İ");
                s4kutu3.setText("İ");
                Şharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Şharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("D") && harf2.getText().equals("İ") && harf3.getText().equals("K")) {
                s5kutu1.setText("D");
                s5kutu2.setText("İ");
                s5kutu3.setText("K");
                Dharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Dharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("E") && harf2.getText().equals("D") && harf3.getText().equals("İ")) {
                s6kutu1.setText("E");
                s6kutu2.setText("D");
                s6kutu3.setText("İ");
                Eharfi.setVisibility(VISIBLE);
                Dharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Dharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("İ") && harf2.getText().equals("D") && harf3.getText().equals("E")) {
                s7kutu1.setText("İ");
                s7kutu2.setText("D");
                s7kutu3.setText("E");
                İharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Dharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                İharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                Dharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("İ") && harf2.getText().equals("K") && harf3.getText().equals("İ")) {
                s8kutu1.setText("İ");
                s8kutu2.setText("K");
                s8kutu3.setText("İ");
                İharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                İharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            }
        }else if(!harf1.getText().equals("") && !harf2.getText().equals("") && !harf3.getText().equals("") && !harf4.getText().equals("") && harf5.getText().equals("")){
            if(harf1.getText().equals("İ") && harf2.getText().equals("Ğ") && harf3.getText().equals("D") && harf4.getText().equals("E")) {
                a1kutu1.setText("İ");
                a1kutu2.setText("Ğ");
                a1kutu3.setText("D");
                a1kutu4.setText("E");
                İharfi.setVisibility(VISIBLE);
                Ğharfi.setVisibility(VISIBLE);
                Dharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                İharfi.setBackgroundColor(Color.WHITE);
                Ğharfi.setBackgroundColor(Color.WHITE);
                Dharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("E") && harf2.getText().equals("Ğ") && harf3.getText().equals("İ") && harf4.getText().equals("K")) {
                a2kutu1.setText("E");
                a2kutu2.setText("Ğ");
                a2kutu3.setText("İ");
                a2kutu4.setText("K");
                Eharfi.setVisibility(VISIBLE);
                Ğharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Ğharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("D") && harf2.getText().equals("İ") && harf3.getText().equals("Ş") && harf4.getText().equals("İ")) {
                a3kutu1.setText("D");
                a3kutu2.setText("İ");
                a3kutu3.setText("Ş");
                a3kutu4.setText("İ");
                Dharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                Şharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Dharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                Şharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("E") && harf2.getText().equals("K") && harf3.getText().equals("Ş") && harf4.getText().equals("İ")) {
                a4kutu1.setText("E");
                a4kutu2.setText("K");
                a4kutu3.setText("Ş");
                a4kutu4.setText("İ");
                Eharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Şharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Şharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("E") && harf2.getText().equals("Ş") && harf3.getText().equals("İ") && harf4.getText().equals("K")) {
                a5kutu1.setText("E");
                a5kutu2.setText("Ş");
                a5kutu3.setText("İ");
                a5kutu4.setText("K");
                Eharfi.setVisibility(VISIBLE);
                Şharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Şharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("K") && harf2.getText().equals("İ") && harf3.getText().equals("Ş") && harf4.getText().equals("İ")) {
                a6kutu1.setText("K");
                a6kutu2.setText("İ");
                a6kutu3.setText("Ş");
                a6kutu4.setText("İ");
                Kharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                Şharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                Şharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
        }
        else if(!harf1.getText().equals("") && !harf2.getText().equals("") && !harf3.getText().equals("") && !harf4.getText().equals("") && !harf5.getText().equals("") && harf6.getText().equals("")) {
            if (harf1.getText().equals("D") && harf2.getText().equals("İ") && harf3.getText().equals("K") && harf4.getText().equals("İ") && harf5.getText().equals("Ş")) {
                d1kutu1.setText("D");
                d1kutu2.setText("İ");
                d1kutu3.setText("K");
                d1kutu4.setText("İ");
                d1kutu5.setText("Ş");
                Dharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Şharfi.setVisibility(VISIBLE);
                Dharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                Şharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
                harf5.setText("");
            }
            else if(harf1.getText().equals("D") && harf2.getText().equals("E") && harf3.getText().equals("Ş") && harf4.getText().equals("İ") && harf5.getText().equals("K")) {
                d2kutu1.setText("D");
                d2kutu2.setText("E");
                d2kutu3.setText("Ş");
                d2kutu4.setText("İ");
                d2kutu5.setText("K");
                Dharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                Şharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Dharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Şharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
                harf5.setText("");
            }
            else if(harf1.getText().equals("D") && harf2.getText().equals("E") && harf3.getText().equals("Ğ") && harf4.getText().equals("İ") && harf5.getText().equals("Ş")) {
                d3kutu1.setText("D");
                d3kutu2.setText("E");
                d3kutu3.setText("Ğ");
                d3kutu4.setText("İ");
                d3kutu5.setText("Ş");
                Dharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                Ğharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Şharfi.setVisibility(VISIBLE);
                Dharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Ğharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                Şharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
                harf5.setText("");
            }
        }
        else if(!harf1.getText().equals("") && !harf2.getText().equals("") && !harf3.getText().equals("") && !harf4.getText().equals("") && !harf5.getText().equals("") && !harf6.getText().equals("") && !harf7.getText().equals("")){
            if(harf1.getText().equals("D") && harf2.getText().equals("E") && harf3.getText().equals("Ğ") && harf4.getText().equals("İ") && harf5.getText().equals("Ş") && harf6.getText().equals("İ") && harf7.getText().equals("K"))
            {
                f1kutu1.setText("D");
                f1kutu2.setText("E");
                f1kutu3.setText("Ğ");
                f1kutu4.setText("İ");
                f1kutu5.setText("Ş");
                f1kutu6.setText("İ");
                f1kutu7.setText("K");
                Dharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                Ğharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                Şharfi.setVisibility(VISIBLE);
                İharfi2.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Dharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Ğharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                Şharfi.setBackgroundColor(Color.WHITE);
                İharfi2.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
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