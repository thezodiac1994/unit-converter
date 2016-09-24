package com.example.the_blue_zodiac.metricunitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    String _factor="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("METRIC UNIT CONVERTER");
    }

    public void onkmml(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.6214";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","kms");
        i.putExtra("unit2", "miles");
        startActivity(i);
    }

    public void onmlkm(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "1.60934";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","miles");
        i.putExtra("unit2","kms");
        startActivity(i);
    }

    public void onincm(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "2.54";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","inches");
        i.putExtra("unit2","cms");
        startActivity(i);
    }

    public void oncmin(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.393701";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","cms");
        i.putExtra("unit2","inches");
        startActivity(i);
    }

    public void onmfeet(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "3.28084";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","m");
        i.putExtra("unit2","feet");
        startActivity(i);
    }

    public void onfeetm(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.3048";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","feet");
        i.putExtra("unit2","m");
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
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
