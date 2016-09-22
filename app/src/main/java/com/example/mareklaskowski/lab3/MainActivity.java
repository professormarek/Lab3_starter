package com.example.mareklaskowski.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tw = new TextView(this);
        tw.setText("hello world");

        LinearLayout ll = (LinearLayout) findViewById(R.id.activity_main);
        //LayoutParams is a class to specify layout properties when adding a view to a layout
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        ll.addView(tw, lp);
    }
}
