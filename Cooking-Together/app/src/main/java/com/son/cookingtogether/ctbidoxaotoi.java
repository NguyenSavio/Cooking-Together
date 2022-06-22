package com.son.cookingtogether;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ctbidoxaotoi extends Activity {
    Button BT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ctbidoxaotoi);

        BT = (Button) findViewById(R.id.BtnBackFromCtbidoxaotoi);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
