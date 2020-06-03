package com.passionategeekz.noticeboard.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.passionategeekz.noticeboard.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ArrayList<String> rssLinks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pg = findViewById(R.id.pg);
        Button btnRediff = findViewById(R.id.btnRediff);
        Button btnCinemaBlend = findViewById(R.id.btnCinemaBlend);
        btnRediff.setOnClickListener(this);
        btnCinemaBlend.setOnClickListener(this);
        pg.setOnClickListener(this);

        rssLinks.add("https://news.google.com/rss/search?q=coronavirus&hl=en-US&sort=date&gl=US&num=100&ceid=US:en");
        rssLinks.add("http://punjablivenews.in/category/%e0%a4%aa%e0%a4%82%e0%a4%9c%e0%a4%be%e0%a4%ac/%e0%a4%9c%e0%a4%be%e0%a4%b2%e0%a4%82%e0%a4%a7%e0%a4%b0/feed/");
        rssLinks.add("https://passionategeekz.com/python") ;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnRediff:
                startActivity(new Intent(MainActivity.this, RSSFeedActivity.class).putExtra("rssLink", rssLinks.get(0)));
                break;

            case R.id.btnCinemaBlend:
                startActivity(new Intent(MainActivity.this, RSSFeedActivity.class).putExtra("rssLink", rssLinks.get(1)));
                break;
            case R.id.pg:
                startActivity(new Intent(MainActivity.this, RSSFeedActivity.class).putExtra("rssLink", rssLinks.get(2)));
            break;
        }
    }
}
