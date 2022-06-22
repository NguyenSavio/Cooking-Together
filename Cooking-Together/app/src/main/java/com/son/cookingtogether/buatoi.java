package com.son.cookingtogether;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

public class buatoi extends Activity {
    Button BT;
    ImageButton Bapcailuoc, Bapcaixaocachua, Bidoxaotoi, Raubixaotoi, Raucanxaothitbo, Raumuongxaotoi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buatoi);

        Bapcailuoc = (ImageButton) findViewById(R.id.ImgbtnBapcailuoc);
        Bapcaixaocachua = (ImageButton) findViewById(R.id.ImgbtnBapcaixaocachua);
        Bidoxaotoi = (ImageButton) findViewById(R.id.ImgbtnBidoxaotoi);
        Raubixaotoi = (ImageButton) findViewById(R.id.ImgbtnRaubixaotoi);
        Raucanxaothitbo = (ImageButton) findViewById(R.id.ImgbtnRaucanxaothitbo);
        Raumuongxaotoi = (ImageButton) findViewById(R.id.ImgbtnRaumuongxaotoi);

        Bapcailuoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( buatoi.this, ctbapcailuoc.class);
                startActivity(intent);
            }
        });

        Bapcaixaocachua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buatoi.this, ctbapcaixaocachua.class);
                startActivity(intent);
            }
        });

        Bidoxaotoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buatoi.this, ctbidoxaotoi.class);
                startActivity(intent);
            }
        });

        Raubixaotoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buatoi.this, ctraubixaotoi.class);
                startActivity(intent);
            }
        });
        Raucanxaothitbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buatoi.this, ctraucanxaothitbo.class);
                startActivity(intent);
            }
        });
        Raumuongxaotoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buatoi.this, ctraumuongxaotoi.class);
                startActivity(intent);
            }
        });

        BT = (Button) findViewById(R.id.BtnBackFromBuaToi);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
