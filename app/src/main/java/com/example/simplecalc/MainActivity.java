package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    Button b;
    EditText E1,E2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    b=findViewById(R.id.add);
    b.setOnClickListener(this);
    E1=findViewById(R.id.e1);
    E2=findViewById(R.id.e2);
    }
    @Override
    public void onClick(View view)
    {
        String a= E1.getText().toString();
        String b=E2.getText().toString();
        int n1=Integer.parseInt(a);
        int n2=Integer.parseInt(b);
        int sum =n1+n2;
        Toast.makeText(this,"addition:"+sum,Toast.LENGTH_LONG).show();

    }

    public void division(View view) {
    String a= E1.getText().toString();
    String b=E2.getText().toString();
    double n1=Double.parseDouble(a);
    double n2=Double.parseDouble(b);
    double ans=n1/n2;
    Toast.makeText(this,"division:"+ans,Toast.LENGTH_LONG).show();
}

    public void multiplication(View view) {
        String a= E1.getText().toString();
        String b=E2.getText().toString();
        int n1=Integer.parseInt(a);
        int n2=Integer.parseInt(b);
        int mul =n1*n2;
        Toast.makeText(this,"multiplication:"+mul,Toast.LENGTH_LONG).show();
    }

    public void subtraction(View view) {
        String a= E1.getText().toString();
        String b=E2.getText().toString();
        int n1=Integer.parseInt(a);
        int n2=Integer.parseInt(b);
        int sub =n1-n2;
        Toast.makeText(this,"subtraction:"+sub,Toast.LENGTH_LONG).show();
    }
}