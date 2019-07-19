package com.example.shahwar.coffeepoint;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.shahwar.coffeepoint.R.drawable.*;

public class ListCoffeeCategory extends CoffeeTypes {
    ImageView imgv;
    TextView txt1;
    TextView txt2;

    private ListCoffeeCategory(String name, String desc, int imgID) {



        super(name, desc, imgID);


    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_coffee_category);



    }

    private void setContentView(int activity_list_coffee_category) {
        getImgID();
        getName();
        getDesc();

        imgv.findViewById(R.drawable.affogato);
        txt1.getText();
        txt2.getText();



    }


}
