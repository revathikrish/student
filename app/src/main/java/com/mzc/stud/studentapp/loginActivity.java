package com.mzc.stud.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
EditText s,p;
    Button b,b1;
    String st,pas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        s=(EditText)findViewById(R.id.stdid);
        p=(EditText)findViewById(R.id.pass);
        b=(Button)findViewById(R.id.log);
        b1=(Button)findViewById(R.id.reg);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=s.getText().toString();
                pas=p.getText().toString();
                if(st.equals("mzc")&&pas.equals("college"))
                {
                    Intent q=new Intent(getApplicationContext(),welcomeActivity.class);
                    startActivity(q);
                }
                else{
                    Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_LONG).show();
                }
            }

        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w=new Intent(getApplicationContext(),registerActivity.class);
                startActivity(w);
            }
        });

    }
}
