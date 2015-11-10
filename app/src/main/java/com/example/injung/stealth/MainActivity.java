package com.example.injung.stealth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.injung.stealth.DB.DBHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper dbHelper = new DBHelper(this);

        Button btn = (Button)findViewById(R.id.golist);

        btn.setOnClickListener(this);
    }

    @Override

    public void onClick(View v) {

        // TODO Auto-generated method stub
        Intent intent = new Intent(this, AppInfoActivity.class);

        startActivity(intent);

    }

}
