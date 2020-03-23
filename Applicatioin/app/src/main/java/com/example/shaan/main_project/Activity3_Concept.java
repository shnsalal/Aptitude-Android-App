package com.example.shaan.main_project;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity3_Concept extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    ArrayList<Info> arrayList = new ArrayList<Info>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3__concept);

      //  ActionBar actionBar = getSupportActionBar();
//        actionBar.setTitle("Items List");

        title = new String[] {"Number System","HCF & LCM","Average","Age","Percentage","Profit & Loss","Ratio And Propotion","Partnership"
                ,"Chain Rule","Time And Work","Pipes And Cisterns","Time & Distance","Problems On Train","Boat & Stream","Mixtur & Alligation","Simple Interest","Compound Interest"
                ,"Logarithms"};

        listView = findViewById(R.id.listView);

        for (int i =0; i<title.length; i++){
            Info Info = new Info(title[i]);
            //bind all strings in an array
            arrayList.add(Info);
        }

        //pass results to listViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);

        SearchView searchView = (SearchView)findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return false;
            }
        });

    }
    /*

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.action_settings){
            //do your functionality here
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}