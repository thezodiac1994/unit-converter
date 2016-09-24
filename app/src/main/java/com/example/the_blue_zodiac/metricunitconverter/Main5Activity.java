package com.example.the_blue_zodiac.metricunitconverter;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
    String _factor="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        setTitle("METRIC UNIT CONVERTER");
    }

    public void onftm(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.092903";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","sq feet");
        i.putExtra("unit2", "sq meters");
        startActivity(i);
    }

    public void onsqmsqf(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "10.7639";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","sq meters");
        i.putExtra("unit2", "sq feet");
        startActivity(i);
    }


    public void onkmmiles(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.3861";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","sq km");
        i.putExtra("unit2", "sq miles");
        startActivity(i);
    }

    public void onmilekm(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "2.58999";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","sq miles");
        i.putExtra("unit2", "sq km");
        startActivity(i);
    }

    public void onacresh(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.404686";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","acres");
        i.putExtra("unit2", "hectares");
        startActivity(i);
    }


    public void onhacres(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "2.4711";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","hectares");
        i.putExtra("unit2", "acres");
        startActivity(i);
    }

    public void onasqf(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "43560";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","acres");
        i.putExtra("unit2", "sq feet");
        startActivity(i);
    }


    public void onsqfa(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.000022956841138659";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","sq feet");
        i.putExtra("unit2", "acres");
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main5, menu);
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
