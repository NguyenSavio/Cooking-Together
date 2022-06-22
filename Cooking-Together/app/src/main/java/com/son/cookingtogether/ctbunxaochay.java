package com.son.cookingtogether;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class ctbunxaochay extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    Button BT;
    String API_Key = "AIzaSyDOQWpGLnzGVtLDgHeEZtbiR9SoyvM2E08";
    YouTubePlayerView youTubePlayerView;
    int RE_SQUEST = 123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ctbunxaochay);

        BT = (Button) findViewById(R.id.BtnBackFromCtbunxaochay);
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.Youtubebunxaochay);
        youTubePlayerView.initialize(API_Key,this);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        youTubePlayer.cueVideo("33yQ2E8S0is");
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(ctbunxaochay.this, RE_SQUEST);
        }
        else {
            Toast.makeText(this, "Error!!!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == RE_SQUEST){
            youTubePlayerView.initialize(API_Key, ctbunxaochay.this);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
