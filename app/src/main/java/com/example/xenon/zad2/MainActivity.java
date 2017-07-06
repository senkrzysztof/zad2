package com.example.xenon.zad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private TextView tw1;
    private TextView tw2;
    private EditText ed1;
    private EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button4);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById(R.id.button);
        b4=(Button)findViewById(R.id.button5);
        tw1=(TextView)findViewById(R.id.textView);
        tw2=(TextView)findViewById(R.id.textView4);
        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tw1.setText("Wcisnieto button1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tw1.setText("Wcisnieto button2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tw1.setText("Wcisnieto button3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=ed1.getText().toString();
                s+=" ";
                s+=ed2.getText().toString();
                tw2.setText(s);
            }
        });
    }
}
