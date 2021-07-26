package com.example.universityrank;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Profile extends YouTubeBaseActivity {
    private String title = "My Profile";
    String api_key = "AIzaSyDz0YbX951fWMbM2bH1v5bCPQNjBdi9P_M";
    private Button playvideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        playvideo = findViewById(R.id.playvideo);

        playvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://www.youtube.com/watch?v=Q6ZG6Qy98uY");
                Intent i = new Intent(Intent.ACTION_VIEW, webpage);
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
            }
        });
        YouTubePlayerView ytPlayer = findViewById(R.id.ytPlayer);

        ytPlayer.initialize(
                api_key,
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b)
                    {
                        youTubePlayer.loadVideo("Q6ZG6Qy98uY");
                        youTubePlayer.play();
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult)
                    {
                        Toast.makeText(getApplicationContext(), "Video player Failed", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:
                Uri webpage = Uri.parse("https://github.com/rizkajuliant20");
                Intent i = new Intent(Intent.ACTION_VIEW, webpage);
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                break;
        }
//        setActionBarTitle(title);
    }


//    private void setActionBarTitle(String title) {
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setTitle(title);
//        }
//    }
}