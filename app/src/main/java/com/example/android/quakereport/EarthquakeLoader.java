package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;


class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private String url;

    EarthquakeLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (url == null)
            return null;

        return QueryUtils.fetchEarthquakeData(url);
    }
}
