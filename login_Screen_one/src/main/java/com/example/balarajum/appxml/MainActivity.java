package com.example.balarajum.appxml;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView user,pwd,logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (TextView) findViewById(R.id.username);
        pwd = (TextView) findViewById(R.id.password);
        logo = (TextView) findViewById(R.id.logo_text);
        Typeface fontAwesomeFont = Typeface.createFromAsset(getAssets(),"fontawesome-webfont.ttf");
        user.setTypeface(fontAwesomeFont);
        pwd.setTypeface(fontAwesomeFont);
        logo.setTypeface(fontAwesomeFont);
    }
}
