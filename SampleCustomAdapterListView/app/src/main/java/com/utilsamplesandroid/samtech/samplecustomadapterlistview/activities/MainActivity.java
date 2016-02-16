package com.utilsamplesandroid.samtech.samplecustomadapterlistview.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.utilsamplesandroid.samtech.samplecustomadapterlistview.R;
import com.utilsamplesandroid.samtech.samplecustomadapterlistview.adapters.ListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListAdapter mListApdater;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<String> listValues = new ArrayList<String>();
        listValues.add("value a");
        listValues.add("value b");
        listValues.add("value c");

        mListApdater = new ListAdapter(this, R.layout.item_list ,listValues);

        mListView = (ListView) findViewById(R.id.list);

        mListView.setAdapter(mListApdater);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Tiempo promedio +- 40min", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
