package com.example.shahwar.coffeepoint;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;



/**
 * Created by Shahwar on 9/29/2017.
 */

public class CoffeeCategory extends ListActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ListView coffelist = getListView();
        ArrayAdapter<CoffeeTypes> listAdapter = new ArrayAdapter<CoffeeTypes>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                CoffeeTypes.coffee

        );
        coffelist.setAdapter(listAdapter);
    }
    public void onListItemClick(ListView listview, View V, int position, long id){

        Intent i = new Intent(CoffeeCategory.this, ListCoffeeCategory.class);
        startActivity(i);

    }

}

