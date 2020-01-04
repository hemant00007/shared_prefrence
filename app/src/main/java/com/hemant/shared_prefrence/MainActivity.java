package com.hemant.shared_prefrence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3;
    Button b1;

    public static final String Mypref="mypref";
    public static final String Mypref2="secondpref";
    public static final String NAME="HELLO";
    public static final String EMAIL ="HELLO@GMAIL.COM.";
    public static final String PHONE ="88888896";

    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);
        ed3 = (EditText)findViewById(R.id.editText3);
        b1 = (Button)findViewById(R.id.button);

        sharedPreferences = getSharedPreferences(Mypref, Context.MODE_PRIVATE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=ed1.getText().toString();
                String b= ed2.getText().toString();
                String c = ed3.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(NAME,a);
                editor.putString(EMAIL,b);
                editor.putString(PHONE,c);
                editor.commit();
                Toast.makeText(getApplicationContext(),"Thanks",Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });


    }
}
