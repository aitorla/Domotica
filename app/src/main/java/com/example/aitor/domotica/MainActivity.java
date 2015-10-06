package com.example.aitor.domotica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton tb1, tb2;
    private Switch sw1, sw2;
    private ImageView camara1, camara2, luz1, luz2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb1=(ToggleButton)findViewById(R.id.tb1);
        tb2=(ToggleButton)findViewById(R.id.tb2);
        sw1=(Switch)findViewById(R.id.sw1);
        sw2=(Switch)findViewById(R.id.sw2);
        camara1=(ImageView)findViewById(R.id.iv1);
        luz1=(ImageView)findViewById(R.id.iv2);
        camara2=(ImageView)findViewById(R.id.iv3);
        luz2=(ImageView)findViewById(R.id.iv4);


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


    public void encendercamara1 (View view) {
        if (sw1.isChecked())
            camara1.setVisibility(View.VISIBLE);
        else
            camara1.setVisibility(View.INVISIBLE);
    }

    public void encenderluz1 (View view) {
        if (sw2.isChecked())
            luz1.setImageResource(R.drawable.bombillaon);
        else
            luz1.setImageResource(R.drawable.bombillaoff);


    }


    public void encendercamara2 (View view) {
        if (tb1.isChecked())
            camara2.setVisibility(View.VISIBLE);
        else
            camara2.setVisibility(View.INVISIBLE);


    }
    public void encenderluz2 (View view) {
        if (tb2.isChecked())
            luz2.setImageResource(R.drawable.bombillaon);
        else
            luz2.setImageResource(R.drawable.bombillaoff);


    }
}
