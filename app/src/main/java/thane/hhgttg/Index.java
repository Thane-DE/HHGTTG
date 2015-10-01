package thane.hhgttg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_index, menu);
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

    public void fortytwo (View view){
        Intent fortytwoI = new Intent(this, fortytwo.class);
        startActivity(fortytwoI);
    }

    public void alcohol (View view){
        Intent alcoholI = new Intent(this, Alcohol.class);
        startActivity(alcoholI);
    }

    public void babelfish (View view){
        Intent babelfishI = new Intent(this, BabelFish.class);
        startActivity(babelfishI);
    }

    public void zaphod (View view){
        Intent zaphodI = new Intent(this, Zaphod.class);
        startActivity(zaphodI);
    }

    public void bypass (View view){
        Intent bypassI = new Intent(this, Bypasses.class);
        startActivity(bypassI);
    }

    public void careless (View view){
        Intent carelessI = new Intent(this, CarelessTalk.class);
        startActivity(carelessI);
    }

    public void damogran (View view){
        Intent damogranI = new Intent(this, Damogran.class);
        startActivity(damogranI);
    }

    public void deepthought (View view){
        Intent deepI = new Intent(this, DeepThought.class);
        startActivity(deepI);
    }

    public void arthur (View view){
        Intent arthurI = new Intent(this, Arthur.class);
        startActivity(arthurI);
    }

    public void earth (View view){
        Intent earthI = new Intent(this, Earth.class);
        startActivity(earthI);
    }

    public void thumb (View view){
        Intent thumbI = new Intent(this, ElectronicThumb.class);
        startActivity(thumbI);
    }

    public void heartofgold (View view){
        Intent hogI = new Intent(this, HeartofGold.class);
        startActivity(hogI);
    }

    public void igg (View view){
        Intent iggI = new Intent(this, GalactivGov.class);
        startActivity(iggI);
    }

    public void iid (View view){
        Intent iidI = new Intent(this, IID.class);
        startActivity(iidI);
    }

    public void jeltz (View view){
        Intent jeltzI = new Intent(this, VogonCaptian.class);
        startActivity(jeltzI);
    }

    public void magrathea (View view){
        Intent magI = new Intent(this, Magrathea.class);
        startActivity(magI);
    }

    public void marvin (View view){
        Intent marvinI = new Intent(this, Marvin.class);
        startActivity(marvinI);
    }

    public void tricia (View view){
        Intent triciaI = new Intent(this, Tricia.class);
        startActivity(triciaI);
    }

    public void pggb (View view){
        Intent pggbI = new Intent(this, PGGB.class);
        startActivity(pggbI);
    }

    public void poetry (View view){
        Intent poetryI = new Intent(this, Poetry.class);
        startActivity(poetryI);
    }

    public void ford (View view){
        Intent fordI = new Intent(this, Ford.class);
        startActivity(fordI);
    }

    public void president (View view){
        Intent presidentI = new Intent(this, President.class);
        startActivity(presidentI);
    }

    public void cyber (View view){
        Intent cyberI = new Intent(this, Cyber.class);
        startActivity(cyberI);
    }

    public void nope (View view){
        Intent nopeI = new Intent(this, Slartibartfast.class);
        startActivity(nopeI);
    }

    public void space (View view){
        Intent spaceI = new Intent(this, Space.class);
        startActivity(spaceI);
    }

    public void towel (View view){
        Intent towelI = new Intent(this, Towel.class);
        startActivity(towelI);
    }

    public void vogons (View view){
        Intent vogonsI = new Intent(this, Vogons.class);
        startActivity(vogonsI);
    }

}

