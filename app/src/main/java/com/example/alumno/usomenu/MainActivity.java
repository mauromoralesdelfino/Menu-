package com.example.alumno.usomenu;

import android.Manifest;
import android.app.ActionBar;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar barra = getSupportActionBar();
        barra.setTitle("Hola");
        barra.setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Log.d("menu","Click en settings");
            return true;
        }
        if (id == R.id.action_opcion1) {
            Log.d("menu","Click en opcion 1");

            Intent i = new Intent(this,SegundoActivity.class);// me permite intentar hacer algo, quie lo lanza y que lanzo parametros
            Intent callIntent = new Intent
                    (Intent.ACTION_CALL, Uri.parse("tel:44444444"));

            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED)
            {
                //ActivityCompat.requestPermissions(this, new String[]);
                super.startActivity(callIntent);
            }else {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.CALL_PHONE},
                        0);
            }


           /* i.putExtra("valorN",2000);
            i.putExtra("valorS","Hola");
            super.startActivity(i);*/
            return true;
        }
        if (id == android.R.id.home) {
            Log.d("back","BOTON BACK");
            return true;
            /*case android.R.id.home:{
finish(); // Simulo back DESTRUYE ACTIVITY
break;*/
        }
        return super.onOptionsItemSelected(item);
    }
}
/*
*
*
* */
