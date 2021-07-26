package com.example.universityrank;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

import static android.content.ContentValues.TAG;

public class DetailActivity extends AppCompatActivity {
    private TextView uniName, uniDesc;
    private ImageView uniImage;
    private ImageButton button_share, button_favorite;
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DESC = "extra_desc";
    public static final String EXTRA_PHOTO = "extra_photo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        uniName = findViewById(R.id.uniName);
        uniDesc = findViewById(R.id.uniDescription);
        uniImage = findViewById(R.id.uniImage);
        button_favorite = findViewById(R.id.favorite);
        button_share = findViewById(R.id.share);
        button_favorite.setImageResource(R.drawable.star);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String desc = getIntent().getStringExtra(EXTRA_DESC);
        int image = getIntent().getIntExtra(EXTRA_PHOTO, 0);

        uniName.setText(name);
        uniDesc.setText(desc);

        Glide.with(this.getApplicationContext())
                .load(image)
                .into(uniImage);

        button_favorite.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ImageButton btn = (ImageButton) findViewById(R.id.favorite);
                    btn.setImageResource(R.drawable.star_after);
            }
        });

        button_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://www.facebook.com/");
                Intent i = new Intent(Intent.ACTION_VIEW, webpage);
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
            }
        });

    }

}