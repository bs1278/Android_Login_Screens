package com.example.balarajum.login_one;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView usr,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface fontAwesomeFont = Typeface.createFromAsset(getAssets(),"fontawesome-webfont.ttf");
        usr = (TextView) findViewById(R.id.user);
        pwd = (TextView) findViewById(R.id.paswd);
        usr.setTypeface(fontAwesomeFont);
        pwd.setTypeface(fontAwesomeFont);

    }
}
