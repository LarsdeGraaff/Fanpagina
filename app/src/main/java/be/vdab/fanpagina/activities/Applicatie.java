package be.vdab.fanpagina.activities;

import android.app.Application;

import be.vdab.fanpagina.BuildConfig;
import timber.log.Timber;

/**
 * Created by jeansmits on 4/09/15.
 */
public class Applicatie extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }


    }
}
