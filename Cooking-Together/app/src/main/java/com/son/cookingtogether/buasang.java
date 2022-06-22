package com.son.cookingtogether;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

public class buasang extends Activity {
    Button BT;
    ImageButton Banhcanh, Banhcuon, Bunxaochay, Banhmy, Bunbohue, Hutieunamvang;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buasang);

        Banhcanh = (ImageButton) findViewById(R.id.ImgbtnBanhcanh);
        Banhcuon = (ImageButton) findViewById(R.id.ImgbtnBanhcuon);
        Banhmy = (ImageButton) findViewById(R.id.ImgbtnBanhmy);
        Bunbohue = (ImageButton) findViewById(R.id.ImgbtnBunbohue);
        Bunxaochay = (ImageButton) findViewById(R.id.ImgbtnBunxaochay);
        Hutieunamvang = (ImageButton) findViewById(R.id.ImgbtnHutieunamvang);

        Banhcanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( buasang.this, ctbanhcanh.class);
                startActivity(intent);
            }
        });

        Banhcuon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buasang.this, ctbanhcuon.class);
                startActivity(intent);
            }
        });

        Banhmy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buasang.this, ctbanhmy.class);
                startActivity(intent);
            }
        });

        Bunbohue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buasang.this, ctbunbohue.class);
                startActivity(intent);
            }
        });
        Bunxaochay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buasang.this, ctbunxaochay.class);
                startActivity(intent);
            }
        });
        Hutieunamvang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buasang.this, cthutieunamvang.class);
                startActivity(intent);
            }
        });
        BT = (Button) findViewById(R.id.BtnBackFromBuaSang);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
