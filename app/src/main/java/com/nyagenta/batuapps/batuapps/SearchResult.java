package com.nyagenta.batuapps.batuapps;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Ais on 2/10/2017.
 */

public class SearchResult extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        handleIntent(getIntent());
    }

    protected void onNewIntent(Intent intent){
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {

        if(Intent.ACTION_SEARCH.equals(intent.getAction())){
            String query = intent.getStringExtra(SearchManager.QUERY);
        }

    }

}
