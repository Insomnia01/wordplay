package com.example.kelimeoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.View.VISIBLE;

public class Bolum6Activity extends AppCompatActivity {
    //region değişkenler
    TextView harf1; TextView harf2; TextView harf3; TextView harf4; TextView harf5; TextView harf6; TextView harf7;
    TextView Eharfi; TextView Jharfi;TextView Nharfi;TextView İharfi;TextView Kharfi;TextView Eharfi2;TextView Rharfi;

    TextView s1kutu1; TextView s1kutu2; TextView s1kutu3;
    TextView s2kutu1; TextView s2kutu2; TextView s2kutu3;
    TextView s3kutu1; TextView s3kutu2; TextView s3kutu3;

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
        setContentView(R.layout.activity_bolum6);
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

        Eharfi = findViewById(R.id.Eharfi); Jharfi = findViewById(R.id.Jharfi); Nharfi = findViewById(R.id.Nharfi);
        İharfi = findViewById(R.id.İharfi); Kharfi = findViewById(R.id.Kharfi); Eharfi = findViewById(R.id.Eharfi);
        Rharfi = findViewById(R.id.Rharfi);

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
        Eharfi = findViewById(R.id.Eharfi); Jharfi = findViewById(R.id.Jharfi); Nharfi = findViewById(R.id.Nharfi);
        İharfi = findViewById(R.id.İharfi); Kharfi = findViewById(R.id.Kharfi); Eharfi2 = findViewById(R.id.Eharfi2);
        Rharfi = findViewById(R.id.Rharfi);

        Eharfi.setVisibility(VISIBLE); Jharfi.setVisibility(VISIBLE); Nharfi.setVisibility(VISIBLE);
        İharfi.setVisibility(VISIBLE); Rharfi.setVisibility(VISIBLE); Kharfi.setVisibility(VISIBLE);
        Eharfi2.setVisibility(VISIBLE);

        Eharfi.setBackgroundColor(Color.WHITE); Jharfi.setBackgroundColor(Color.WHITE); Nharfi.setBackgroundColor(Color.WHITE);
        İharfi.setBackgroundColor(Color.WHITE); Rharfi.setBackgroundColor(Color.WHITE); Kharfi.setBackgroundColor(Color.WHITE);
        Eharfi2.setBackgroundColor(Color.WHITE);

        harf1.setText(""); harf2.setText(""); harf3.setText(""); harf4.setText("");
        harf5.setText(""); harf6.setText(""); harf7.setText("");
    }

    public void imgonayla(View view) {
        //region tanımlamalar
        Eharfi = findViewById(R.id.Eharfi);
        Jharfi = findViewById(R.id.Jharfi);
        Nharfi = findViewById(R.id.Nharfi);
        İharfi = findViewById(R.id.İharfi);
        Kharfi = findViewById(R.id.Kharfi);
        Eharfi2 = findViewById(R.id.Eharfi2);
        Rharfi = findViewById(R.id.Rharfi);

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

//endregion
        if (!harf1.getText().equals("") && !harf2.getText().equals("") && !harf3.getText().equals("") && harf4.getText().equals("") ) {
            if (harf1.getText().equals("K") && harf2.getText().equals("E") && harf3.getText().equals("R")) {
                s1kutu1.setText("K");
                s1kutu2.setText("E");
                s1kutu3.setText("R");
                Kharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                Eharfi2.setVisibility(VISIBLE);
                Rharfi.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Eharfi2.setBackgroundColor(Color.WHITE);
                Rharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("K") && harf2.getText().equals("İ") && harf3.getText().equals("N")) {
                s2kutu1.setText("K");
                s2kutu2.setText("İ");
                s2kutu3.setText("N");
                Kharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                Nharfi.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                Nharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            } else if (harf1.getText().equals("K") && harf2.getText().equals("İ") && harf3.getText().equals("R")) {
                s2kutu1.setText("K");
                s2kutu2.setText("İ");
                s2kutu3.setText("R");
                Kharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                Rharfi.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                Rharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
            }
        }else if(!harf1.getText().equals("") && !harf2.getText().equals("") && !harf3.getText().equals("") && !harf4.getText().equals("") && harf5.getText().equals("")){
            if(harf1.getText().equals("R") && harf2.getText().equals("E") && harf3.getText().equals("N") && harf4.getText().equals("K")) {
                a1kutu1.setText("R");
                a1kutu2.setText("E");
                a1kutu3.setText("N");
                a1kutu4.setText("K");
                Rharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                Eharfi2.setVisibility(VISIBLE);
                Nharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Rharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Eharfi2.setBackgroundColor(Color.WHITE);
                Nharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("N") && harf2.getText().equals("E") && harf3.getText().equals("R") && harf4.getText().equals("E")) {
                a2kutu1.setText("N");
                a2kutu2.setText("E");
                a2kutu3.setText("R");
                a2kutu4.setText("E");
                Nharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                Rharfi.setVisibility(VISIBLE);
                Eharfi2.setVisibility(VISIBLE);
                Nharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Rharfi.setBackgroundColor(Color.WHITE);
                Eharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("K") && harf2.getText().equals("E") && harf3.getText().equals("R") && harf4.getText().equals("E")) {
                a3kutu1.setText("K");
                a3kutu2.setText("E");
                a3kutu3.setText("R");
                a3kutu4.setText("E");
                Kharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                Rharfi.setVisibility(VISIBLE);
                Eharfi2.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Rharfi.setBackgroundColor(Color.WHITE);
                Eharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("K") && harf2.getText().equals("E") && harf3.getText().equals("N") && harf4.getText().equals("E")) {
                a4kutu1.setText("K");
                a4kutu2.setText("E");
                a4kutu3.setText("N");
                a4kutu4.setText("E");
                Kharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                Nharfi.setVisibility(VISIBLE);
                Eharfi2.setVisibility(VISIBLE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Nharfi.setBackgroundColor(Color.WHITE);
                Eharfi2.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("İ") && harf2.getText().equals("N") && harf3.getText().equals("E") && harf4.getText().equals("K")) {
                a5kutu1.setText("İ");
                a5kutu2.setText("N");
                a5kutu3.setText("E");
                a5kutu4.setText("K");
                İharfi.setVisibility(VISIBLE);
                Nharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                Eharfi2.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                İharfi.setBackgroundColor(Color.WHITE);
                Nharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Eharfi2.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("E") && harf2.getText().equals("R") && harf3.getText().equals("İ") && harf4.getText().equals("K")) {
                a6kutu1.setText("E");
                a6kutu2.setText("R");
                a6kutu3.setText("İ");
                a6kutu4.setText("K");
                Eharfi.setVisibility(VISIBLE);
                Eharfi2.setVisibility(VISIBLE);
                Rharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Eharfi2.setBackgroundColor(Color.WHITE);
                Rharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("E") && harf2.getText().equals("R") && harf3.getText().equals("E") && harf4.getText().equals("N")) {
                a7kutu1.setText("E");
                a7kutu2.setText("R");
                a7kutu3.setText("E");
                a7kutu4.setText("N");
                Eharfi.setVisibility(VISIBLE);
                Rharfi.setVisibility(VISIBLE);
                Eharfi2.setVisibility(VISIBLE);
                Nharfi.setVisibility(VISIBLE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Rharfi.setBackgroundColor(Color.WHITE);
                Eharfi2.setBackgroundColor(Color.WHITE);
                Nharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
            else if(harf1.getText().equals("E") && harf2.getText().equals("N") && harf3.getText().equals("İ") && harf4.getText().equals("K")) {
                a8kutu1.setText("E");
                a8kutu2.setText("N");
                a8kutu3.setText("İ");
                a8kutu4.setText("K");
                Eharfi.setVisibility(VISIBLE);
                Eharfi2.setVisibility(VISIBLE);
                Nharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Eharfi2.setBackgroundColor(Color.WHITE);
                Nharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
            }
        }
        else if(!harf1.getText().equals("") && !harf2.getText().equals("") && !harf3.getText().equals("") && !harf4.getText().equals("") && !harf5.getText().equals("") && harf6.getText().equals("")) {
            if (harf1.getText().equals("E") && harf2.getText().equals("R") && harf3.getText().equals("K") && harf4.getText().equals("E") && harf5.getText().equals("N")) {
                d1kutu1.setText("E");
                d1kutu2.setText("R");
                d1kutu3.setText("K");
                d1kutu4.setText("E");
                d1kutu5.setText("N");
                Eharfi.setVisibility(VISIBLE);
                Rharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Eharfi2.setVisibility(VISIBLE);
                Nharfi.setVisibility(VISIBLE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Rharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                Eharfi2.setBackgroundColor(Color.WHITE);
                Nharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
                harf5.setText("");
            }
            else if(harf1.getText().equals("E") && harf2.getText().equals("R") && harf3.getText().equals("K") && harf4.getText().equals("İ") && harf5.getText().equals("N")) {
                d2kutu1.setText("E");
                d2kutu2.setText("R");
                d2kutu3.setText("K");
                d2kutu4.setText("İ");
                d2kutu5.setText("N");
                Eharfi.setVisibility(VISIBLE);
                Eharfi2.setVisibility(VISIBLE);
                Rharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                Nharfi.setVisibility(VISIBLE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Eharfi2.setBackgroundColor(Color.WHITE);
                Rharfi.setBackgroundColor(Color.WHITE);
                Kharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
                Nharfi.setBackgroundColor(Color.WHITE);
                harf1.setText("");
                harf2.setText("");
                harf3.setText("");
                harf4.setText("");
                harf5.setText("");
            }
        }
        else if(!harf1.getText().equals("") && !harf2.getText().equals("") && !harf3.getText().equals("") && !harf4.getText().equals("") && !harf5.getText().equals("") && !harf6.getText().equals("") && !harf7.getText().equals("")){
            if(harf1.getText().equals("J") && harf2.getText().equals("E") && harf3.getText().equals("N") && harf4.getText().equals("E") && harf5.getText().equals("R") && harf6.getText().equals("İ") && harf7.getText().equals("K"))
            {
                f1kutu1.setText("J");
                f1kutu2.setText("E");
                f1kutu3.setText("N");
                f1kutu4.setText("E");
                f1kutu5.setText("R");
                f1kutu6.setText("İ");
                f1kutu7.setText("K");
                Jharfi.setVisibility(VISIBLE);
                Eharfi.setVisibility(VISIBLE);
                Nharfi.setVisibility(VISIBLE);
                Eharfi2.setVisibility(VISIBLE);
                Rharfi.setVisibility(VISIBLE);
                İharfi.setVisibility(VISIBLE);
                Kharfi.setVisibility(VISIBLE);
                Jharfi.setBackgroundColor(Color.WHITE);
                Eharfi.setBackgroundColor(Color.WHITE);
                Nharfi.setBackgroundColor(Color.WHITE);
                Eharfi2.setBackgroundColor(Color.WHITE);
                Rharfi.setBackgroundColor(Color.WHITE);
                İharfi.setBackgroundColor(Color.WHITE);
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