package com.example.samarth.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button add=(Button)findViewById(R.id.button);
        Button subtract=(Button)findViewById(R.id.button2);
        Button multiply=(Button)findViewById(R.id.button3);
        Button divide=(Button)findViewById(R.id.button4);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1=(EditText)findViewById(R.id.editText);
                EditText num2=(EditText)findViewById(R.id.editText2);
                TextView result=(TextView)findViewById(R.id.textView);
                String a=num1.getText().toString();
                int finala=Integer.parseInt(a);
                String b=num2.getText().toString();
                int finalb=Integer.parseInt(b);
                result.setText(String.valueOf(finala+finalb));

            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1=(EditText)findViewById(R.id.editText);
                EditText num2=(EditText)findViewById(R.id.editText2);
                TextView result=(TextView)findViewById(R.id.textView);
                String a=num1.getText().toString();
                int finala=Integer.parseInt(a);
                String b=num2.getText().toString();
                int finalb=Integer.parseInt(b);
                result.setText(String.valueOf(finala-finalb));

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1=(EditText)findViewById(R.id.editText);
                EditText num2=(EditText)findViewById(R.id.editText2);
                TextView result=(TextView)findViewById(R.id.textView);
                String a=num1.getText().toString();
                int finala=Integer.parseInt(a);
                String b=num2.getText().toString();
                int finalb=Integer.parseInt(b);
                result.setText(String.valueOf(finala*finalb));

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1=(EditText)findViewById(R.id.editText);
                EditText num2=(EditText)findViewById(R.id.editText2);
                TextView result=(TextView)findViewById(R.id.textView);
                String a=num1.getText().toString();
                int finala=Integer.parseInt(a);
                String b=num2.getText().toString();
                int finalb=Integer.parseInt(b);
                result.setText(String.valueOf(finala/finalb));

            }
        });
    }
}
