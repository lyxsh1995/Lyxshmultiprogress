package com.yxsh.multiprogress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lyxsh.multiprogress.Multiprogress;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Multiprogress a = new Multiprogress();
        a.start(MainActivity.this);
    }
}
