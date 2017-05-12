package com.bawei.checkboxrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView main2_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        Intent intent = getIntent();
        int chuan = intent.getIntExtra("chuan", 0);
        main2_text.setText(chuan+"");
    }

    private void initView() {
        main2_text = (TextView) findViewById(R.id.main2_text);
    }
}
