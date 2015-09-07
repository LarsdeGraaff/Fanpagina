package be.vdab.fanpagina.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.TreeMap;

import be.vdab.fanpagina.R;
import be.vdab.fanpagina.utils.PreferencesHelper;
import timber.log.Timber;

public class MainActivity extends BaseActivity{
    private final static String LANGUAGE_NL = "nl";
    private final static String LANGUAGE_EN = "en";

    public void sendMessage(View view) {
        System.out.println("We are anderlecht! qui ne saute pas, n'est pas bruxellois ");
        Intent intent = new Intent(this, TeamActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("CREATE CREATE CREATE CREATE");
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView imageView= (ImageView)findViewById(R.id.imageView);
        Picasso.with(this).load("https://upload.wikimedia.org/wikipedia/en/thumb/7/77/R.S.C._Anderlecht.svg/1267px-R.S.C._Anderlecht.svg.png").into(imageView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        //java way to add items to menu
        //menu.add(1,1,2,"Hall Of Fame");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.nederlands) {
            PreferencesHelper.setLanguagePreference(this, LANGUAGE_NL);
            setLocale(LANGUAGE_NL);
            return true;
        }

        if (id == R.id.engels) {
            PreferencesHelper.setLanguagePreference(this, LANGUAGE_EN);
            setLocale(LANGUAGE_EN);
            return true;
        }



        return super.onOptionsItemSelected(item);

    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("START START START START");

    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("RESUME RESUME RESUME RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("PAUSE PAUSE PAUSE PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("STOP STOP STOP STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("DESTROY DESTROY DESTROY DESTROY");
    }
}
