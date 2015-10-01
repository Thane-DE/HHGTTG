package thane.hhgttg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CharIndex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_index);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_char_index, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    public void arthurc (View view){
        Intent arthurcI = new Intent(this, ArthurC.class);
        startActivity(arthurcI);
    }

    public void fordc (View view){
        Intent fordcI = new Intent(this, Fordc.class);
        startActivity(fordcI);
    }

    public void zaphodc (View view){
        Intent zaphodc = new Intent(this, ZaphodC.class);
        startActivity(zaphodc);
    }
}
