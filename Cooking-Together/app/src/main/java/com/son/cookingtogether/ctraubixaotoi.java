package com.son.cookingtogether;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ctraubixaotoi extends Activity {
    Button BT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ctraubixaotoi);

        BT = (Button) findViewById(R.id.BtnBackFromCtraubixaotoi);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}