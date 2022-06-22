package com.son.cookingtogether;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ctbapcaixaocachua extends Activity {
    Button BT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ctbapcaixaocachua);

        BT = (Button) findViewById(R.id.BtnBackFromCtbapcaixaocachua);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}