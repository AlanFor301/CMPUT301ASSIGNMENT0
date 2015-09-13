package com.example.jr.messagesending;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ResultPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_page);
        resultShowing();
    }
    public void resultShowing(){
        TextView showGreetingMsg = (TextView) findViewById(R.id.resultMsg);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("Msg");
        showGreetingMsg.setText(msg);
    }

}
