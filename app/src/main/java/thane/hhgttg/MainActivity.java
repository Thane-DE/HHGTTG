package thane.hhgttg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

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



        return super.onOptionsItemSelected(item);
    }

    public void openManual(View view) {
        // Do something in response to button
        Intent openManualIntent = new Intent(this, Manual.class);
        startActivity(openManualIntent);
    }

    public void openIndex(View view){
        Intent openIndexIntent = new Intent(this, Index.class);
        startActivity(openIndexIntent);
    }

    public void openChars(View view){
        Intent openCharsIntent = new Intent(this, CharIndex.class);
        startActivity(openCharsIntent);
    }

    public void openTime(View view){
        Intent openTimeIntent = new Intent(this, Time.class);
        startActivity(openTimeIntent);
    }

    public void openEval(View view){
        Intent openEvalIntent = new Intent(this, Eval.class);
        startActivity(openEvalIntent);
    }
}
