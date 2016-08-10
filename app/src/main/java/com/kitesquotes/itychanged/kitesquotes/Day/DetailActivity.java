package com.kitesquotes.itychanged.kitesquotes.Day;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.kitesquotes.itychanged.kitesquotes.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView imageView= (ImageView) findViewById(R.id.img);
        TextView txt= (TextView) findViewById(R.id.txt);
        Intent intent=this.getIntent();
        txt.setText(intent.getStringExtra("txt"));
        Glide.with(DetailActivity.this).load(intent.getStringExtra("url"))
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);


    }
}
