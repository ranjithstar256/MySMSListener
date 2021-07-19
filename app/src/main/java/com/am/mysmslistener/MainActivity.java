package com.am.mysmslistener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    MyCustomReceivr  myCustomReceivr;
    @Override
    protected void onCreate(Bundle abc) {
        super.onCreate(abc);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.tv);

        textView.setText("helo");
    }

    public void hi(View view) {
        sendBroadcast(new Intent(this, MyCustomReceivr.class).setAction("CONNECTIVITY_CHANGE"));
        sendBroadcast(new Intent(this, MyCallReceiver.class).setAction("CONNECTIVITY_CHANGE"));
        sendBroadcast(new Intent(this, MyReceiver.class).setAction("CONNECTIVITY_CHANGE"));
    }
}