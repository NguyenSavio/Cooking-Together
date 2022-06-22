package com.son.cookingtogether;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class ctbanhcanh extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    String API_Key = "AIzaSyDOQWpGLnzGVtLDgHeEZtbiR9SoyvM2E08";
    YouTubePlayerView youTubePlayerView;
    int RE_SQUEST = 123;
    Button BT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ctbanhcanh);

        BT = (Button) findViewById(R.id.BtnBackFromCtbanhcanh);
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.Youtubebanhcanh);
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
        youTubePlayer.cueVideo("D_9sV6ZLPhw");
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(ctbanhcanh.this, RE_SQUEST);
        }
        else {
            Toast.makeText(this, "Error!!!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == RE_SQUEST){
            youTubePlayerView.initialize(API_Key, ctbanhcanh.this);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
