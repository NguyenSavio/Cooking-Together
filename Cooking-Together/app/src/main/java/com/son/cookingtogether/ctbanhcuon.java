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


public class ctbanhcuon extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    Button BT;
    String API_Key = "AIzaSyDOQWpGLnzGVtLDgHeEZtbiR9SoyvM2E08";
    YouTubePlayerView youTubePlayerView;
    int RE_SQUEST = 123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ctbanhcuon);

        BT = (Button) findViewById(R.id.BtnBackFromCtbanhcuon);
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.Youtubebanhcuon);
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
        youTubePlayer.cueVideo("XOlj1MWPJQ4");
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(ctbanhcuon.this, RE_SQUEST);
        }
        else {
            Toast.makeText(this, "Error!!!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == RE_SQUEST){
            youTubePlayerView.initialize(API_Key, ctbanhcuon.this);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

}