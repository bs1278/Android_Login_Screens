package com.example.balarajum.login_screen_two;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface fontAwesomeFont = Typeface.createFromAsset(getAssets(),"fontawesome-webfont.ttf");
        username = (TextView) findViewById(R.id.username);
        password =(TextView) findViewById(R.id.password);
        username.setTypeface(fontAwesomeFont);
        password.setTypeface(fontAwesomeFont);
    }
}
