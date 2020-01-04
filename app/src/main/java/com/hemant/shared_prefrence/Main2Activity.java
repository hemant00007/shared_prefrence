package com.hemant.shared_prefrence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import static com.hemant.shared_prefrence.MainActivity.NAME;


public class Main2Activity extends AppCompatActivity {

    TextView textView;
    public static final String Mypref ="mypref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView)findViewById(R.id.textView);
        SharedPreferences sharedPreferences = getSharedPreferences(Mypref, Context.MODE_PRIVATE);
       // textView.append(sharedPreferences.getString(NAME,""));

        //textView.append(sharedPreferences.getString(EMAIL,""));
        //textView.append(sharedPreferences.getString(PHONE,""));
    String result =sharedPreferences.getString(NAME,"");
            textView.setText(result);
    }
}
