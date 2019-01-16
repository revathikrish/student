package com.mzc.stud.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registerActivity extends AppCompatActivity {
EditText name,admn,rolno,college,place,stuntid,password,cpassword;
    Button b2,b3;
    String n,a,r,c,p,s,pa,cpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=(EditText)findViewById(R.id.nam);
        admn=(EditText)findViewById(R.id.ad);
        rolno=(EditText)findViewById(R.id.rnno);
        college=(EditText)findViewById(R.id.col);
        place=(EditText)findViewById(R.id.pla);
        stuntid=(EditText)findViewById(R.id.studid);
        password=(EditText)findViewById(R.id.pas);
        cpassword=(EditText)findViewById(R.id.cpass);
        b2=(Button)findViewById(R.id.reg);
        b3=(Button)findViewById(R.id.alreg);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = name.getText().toString();
                a = admn.getText().toString();
                r = rolno.getText().toString();
                c = college.getText().toString();
                p = place.getText().toString();
                s =stuntid.getText().toString();
                pa = password.getText().toString();
                cpa = cpassword.getText().toString();
                Toast.makeText(getApplicationContext(), n, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), a, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), r, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), c, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), p, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), pa, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), cpa, Toast.LENGTH_LONG).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(getApplicationContext(),loginActivity.class);
                startActivity(m);
            }
        });
    }
}
