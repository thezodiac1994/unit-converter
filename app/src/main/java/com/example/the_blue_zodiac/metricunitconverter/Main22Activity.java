package com.example.the_blue_zodiac.metricunitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
//import java.util.*;

public class Main22Activity extends AppCompatActivity {

    double fctr = 0.0; String s_fctr;
    Bundle b;


    public void compute(View view){
        EditText idip = (EditText)findViewById(R.id.idip);
        double inp = Double.parseDouble(idip.getText().toString());


        s_fctr = b.getString("factor");
        if(s_fctr==null)
            fctr = 0.0;
        else
        fctr = Double.parseDouble(s_fctr);

        double op = inp*fctr;

        TextView idop = (TextView)findViewById(R.id.idop);
        idop.setText(String.valueOf(op));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        b=getIntent().getExtras();
        TextView unit1 = (TextView)findViewById(R.id.idunit1), unit2 = (TextView)findViewById(R.id.idunit2);
        unit1.setText(b.getString("unit1"));
        unit2.setText(b.getString("unit2"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main22, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
