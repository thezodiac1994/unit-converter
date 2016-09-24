package com.example.the_blue_zodiac.metricunitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity {
    String _factor="0";

    public void onlitgal(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.264172";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","liters");
        i.putExtra("unit2", "gallons");
        startActivity(i);
    }

    public void ongallit(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "3.78541";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","gallons");
        i.putExtra("unit2", "liters");
        startActivity(i);
    }


    public void onlitpint(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "2.11338";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","liters");
        i.putExtra("unit2", "pints");
        startActivity(i);
    }

    public void onpintlit(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.473176";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","pints");
        i.putExtra("unit2", "liters");
        startActivity(i);
    }

    public void oncumcuf(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "35.3147";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","cu meter");
        i.putExtra("unit2", "cu foot");
        startActivity(i);
    }


    public void oncufcum(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.0283168";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","cu foot");
        i.putExtra("unit2", "cu meter");
        startActivity(i);
    }


    public void onlitquarts(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "1.05669";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","liters");
        i.putExtra("unit2", "quarts");
        startActivity(i);
    }


    public void onquartslit(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.946353";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","quarts");
        i.putExtra("unit2", "liters");
        startActivity(i);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        setTitle("METRIC UNIT CONVERTER");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main6, menu);
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
