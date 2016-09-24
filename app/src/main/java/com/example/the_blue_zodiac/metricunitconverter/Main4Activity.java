package com.example.the_blue_zodiac.metricunitconverter;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    String _factor="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("METRIC UNIT CONVERTER");
    }


    public void onkgpound(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "2.2046";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","kgs");
        i.putExtra("unit2", "lbs");
        startActivity(i);
    }

    public void onpoundkg(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.4536";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","lbs");
        i.putExtra("unit2","kgs");
        startActivity(i);
    }

    public void onog(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "28.3945";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","ounces");
        i.putExtra("unit2","gms");
        startActivity(i);
    }

    public void ongo(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.035";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","gms");
        i.putExtra("unit2", "ounces");
        startActivity(i);
    }


    public void onkgton(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "0.00110231";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","kgs");
        i.putExtra("unit2","tons");
        startActivity(i);
    }

    public void ontonkg(View view){
        Intent i = new Intent(this,Main22Activity.class);
        _factor = "907.185";
        i.putExtra("factor",_factor);
        i.putExtra("unit1","tons");
        i.putExtra("unit2","kgs");
        startActivity(i);
    }








    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main4, menu);
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
