package com.son.cookingtogether;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ctraucanxaothitbo extends Activity {
    Button BT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ctraucanxaothitbo);

        BT = (Button) findViewById(R.id.BtnBackFromCtraucanxaothitbo);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}