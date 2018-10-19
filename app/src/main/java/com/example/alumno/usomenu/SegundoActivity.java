package com.example.alumno.usomenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);


        android.support.v7.app.ActionBar barra = getSupportActionBar();
        barra.setTitle("Hola");
        barra.setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String strActivity1 = extras.getString("valorN");
        int intActivity1 = extras.getInt("valorS");

        /*
        * json
        * intent
        * segundo activity, menu
        * itemChange
        * boton back
        * app:never
        *
        * intent lineas desornedadas
        * chequear, lanzar intent,
        *
        * intent implicito: llamada, segundo parametro uriparser, put extra
        * +
        * onActivityResult
        *
        * */
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
       /* if (id == R.id.action_settings) {
            Log.d("menu","Click en settings");
            return true;
        }
        if (id == R.id.action_opcion1) {
            Log.d("menu","Click en opcion 1");

        }*/
        if (id == android.R.id.home) {
            Log.d("back","BOTON BACK");
            finish();
            return true;
            /*case android.R.id.home:{
finish(); // Simulo back DESTRUYE ACTIVITY
break;*/
        }
        return super.onOptionsItemSelected(item);
    }
}
