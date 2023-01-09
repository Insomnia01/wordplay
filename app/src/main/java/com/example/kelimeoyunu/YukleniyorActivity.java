package com.example.kelimeoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class YukleniyorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yukleniyor);

        Intent intent = getIntent();
        String tagg = intent.getStringExtra("tag");
        int tag = Integer.parseInt(tagg);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (tag == 1){
                    Intent i = new Intent(getApplicationContext(),Bolum1Activity.class);
                    startActivity(i);
                }else if (tag == 2){
                    Intent i = new Intent(getApplicationContext(),Bolum2Activity.class);
                    startActivity(i);
                }else if (tag == 3){
                    Intent i = new Intent(getApplicationContext(),Bolum3Activity.class);
                    startActivity(i);
                }else if (tag == 4){
                    Intent i = new Intent(getApplicationContext(),Bolum4Activity.class);
                    startActivity(i);
                }else if (tag == 5){
                    Intent i = new Intent(getApplicationContext(),Bolum5Activity.class);
                    startActivity(i);
                }else if (tag == 6){
                    Intent i = new Intent(getApplicationContext(),Bolum6Activity.class);
                    startActivity(i);
                }else if (tag == 7){
                    Intent i = new Intent(getApplicationContext(),Bolum7Activity.class);
                    startActivity(i);
                }else if (tag == 8){
                    Intent i = new Intent(getApplicationContext(),Bolum8Activity.class);
                    startActivity(i);
                }else if (tag == 9){
                    Intent i = new Intent(getApplicationContext(),Bolum9Activity.class);
                    startActivity(i);
                }
            }
        },2000);


    }
}