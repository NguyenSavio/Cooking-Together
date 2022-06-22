package com.son.cookingtogether;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

public class buatrua extends Activity {
    Button BT;
    ImageButton Comchientrung, Canhchua, Comrangduabo, Khoquanoithit, Thitboxaohanhtay, Thitkhotrung;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buatrua);

        Comchientrung = (ImageButton) findViewById(R.id.ImgbtnComchientrung);
        Canhchua = (ImageButton) findViewById(R.id.ImgbtnCanhchua);
        Comrangduabo = (ImageButton) findViewById(R.id.ImgbtnComrangduabo);
        Khoquanoithit= (ImageButton) findViewById(R.id.ImgbtnCanhkhoqua);
        Thitboxaohanhtay = (ImageButton) findViewById(R.id.ImgbtnThitboxaohanhtay);
        Thitkhotrung = (ImageButton) findViewById(R.id.ImgbtnThitkhotrung);

        Comchientrung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( buatrua.this, ctcomchientrung.class);
                startActivity(intent);
            }
        });

        Canhchua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buatrua.this, ctcanhchua.class);
                startActivity(intent);
            }
        });

        Comrangduabo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buatrua.this, ctcomrangduabo.class);
                startActivity(intent);
            }
        });

        Khoquanoithit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buatrua.this, ctkhoquanoithit.class);
                startActivity(intent);
            }
        });
        Thitboxaohanhtay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buatrua.this, ctthitboxaohanhtay.class);
                startActivity(intent);
            }
        });
        Thitkhotrung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buatrua.this, ctthitkhotrung.class);
                startActivity(intent);
            }
        });

        BT = (Button) findViewById(R.id.BtnBackFromBuaTrua);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}