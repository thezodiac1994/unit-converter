package com.example.the_blue_zodiac.metricunitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;





public class MainActivity extends AppCompatActivity {

    public void onL(View view){
        Intent il = new Intent(this,Main2Activity.class);
        startActivity(il);
    }

    public void onW(View view){
        Intent il = new Intent(this,Main4Activity.class);
        startActivity(il);
    }

    public void onA(View view){
        Intent il = new Intent(this,Main5Activity.class);
        startActivity(il);
    }

    public void onV(View view){
        Intent il = new Intent(this,Main6Activity.class);
        startActivity(il);
    }


    public void onAb(View view){
        Intent il = new Intent(this,Main9Activity.class);
        startActivity(il);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
