package com.example.pratice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView t1;
    Button b1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView)findViewById(R.id.t1);
        b1 = (Button)findViewById(R.id.b1);
        e1 = (EditText)findViewById(R.id.e1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    t1.setText("You Clicked on Button 1");
    }

    public void dosome(View view) {
        t1.setText("Button2 Clicked");
    }

    public void nexto(View view) {
        Intent i1 = new Intent(this,SecondActivity.class);
        i1.putExtra("user",e1.getText().toString());
        startActivity(i1);
    }
}
