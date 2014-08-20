package com.tpandroid.nicolas.testmenubarapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class BarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch(item.getItemId()){
            case R.id.menu_settings :
                //traitement de settings
                return true;
            case R.id.menu_about :
                // traitement de a propos
                return true;
            case R.id.menu_help :
                // traitement de help
                return true;
            case R.id.menu_refresh :
                // traitement de refresh
                return true;
            case R.id.menu_search :
                // traitement de search
                return true;
            default :
                return super.onOptionsItemSelected(item);
        }
    }
}
