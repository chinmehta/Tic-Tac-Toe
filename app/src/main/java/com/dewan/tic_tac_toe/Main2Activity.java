package com.dewan.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button)findViewById(R.id.startButton);

        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) { String data = b1.getText().toString();

        //Step-1: Create Intent class object
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        //Step-2: If data need to pass from current to dest. Activity
        intent.putExtra("button", data);// key and value

        //Step-3: Last step to start dest. Activity
        startActivity(intent);

    }
}

