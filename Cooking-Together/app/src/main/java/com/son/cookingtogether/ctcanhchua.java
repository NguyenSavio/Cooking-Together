package com.son.cookingtogether;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ctcanhchua extends Activity {
    Button BT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ctcanhchua);

        BT = (Button) findViewById(R.id.BtnBackFromCtcanhchua);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
