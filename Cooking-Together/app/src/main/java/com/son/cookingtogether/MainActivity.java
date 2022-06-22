package com.son.cookingtogether;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    ImageButton BT1,BT2,BT3;
    FirebaseAuth firebaseAuth;
    TextView mnameEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BT1 = (ImageButton) findViewById(R.id.ImgbtnBuaSang);
        BT2 = (ImageButton) findViewById(R.id.ImgbtnBuatrua);
        BT3 = (ImageButton) findViewById(R.id.ImgbtnBuatoi);
        mnameEmail = (TextView) findViewById(R.id.TxtnameEmail);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Cooking Together");

        firebaseAuth = FirebaseAuth.getInstance();

        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, buasang.class);
                startActivity(intent);
            }
        });
        BT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, buatrua.class);
                startActivity(intent);
            }
        });
        BT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, buatoi.class);
                startActivity(intent);
            }
        });

    }

    private void checkUserStatus(){
        FirebaseUser user = firebaseAuth.getCurrentUser();
        if (user != null){
            mnameEmail.setText(user.getEmail());
        }
        else{
            startActivity(new Intent(MainActivity.this, RegistervsLogin.class));
            finish();
        }
    }
    protected void onStart(){
        checkUserStatus();
        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_logout){
            firebaseAuth.signOut();
            checkUserStatus();
        }
        return super.onContextItemSelected(item);
    }
}
