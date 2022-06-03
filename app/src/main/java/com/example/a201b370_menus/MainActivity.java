package com.example.a201b370_menus;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView ;
    SharedPreferences sharedpreferences;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         super.onOptionsItemSelected( item );
         switch (item.getItemId()){
             case R.id.eng:
                 textView.setText("English");
                 sharedpreferences.edit().putString("title","English").apply();
                 return true;
             case R.id.hin:
                 textView.setText("Hindi");
                 sharedpreferences.edit().putString("title","English").apply();
                    return true;
             default:
                 return true;
       }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate( R.menu.main_menu,menu );
        return super.onCreateOptionsMenu( menu );
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
       textView =findViewById( R.id.textView );
        sharedpreferences=this.getSharedPreferences( "com.example.a201b370_menus" ,0);
        String pref=sharedpreferences.getString( "title","default" );
        textView.setText( pref );
    }
}