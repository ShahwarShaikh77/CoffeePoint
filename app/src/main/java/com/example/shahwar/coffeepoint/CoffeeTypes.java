package com.example.shahwar.coffeepoint;

import android.os.Bundle;

/**
 * Created by Shahwar on 9/29/2017.
 */

public class CoffeeTypes {
    private String name;
    private String desc;
    private int imgID;

    public static final CoffeeTypes[] coffee={

            new CoffeeTypes("Affogato", "An affogato is a simple dessert coffee that is treat during summer and after dinner. It is made by placing one big scoope of vanilla ice cream within a single or double shot of espresso",R.drawable.affogato),
            new CoffeeTypes("Café Latte","A café latte, or “latte” for short, is an espresso based drink with steamed milk and micro-foam added to the coffee.This coffee is much sweeter compared to an espresso.",R.drawable.newcafelatte),
            new CoffeeTypes("Cappuccino","A cappuccino is similar to a latte. However the key difference between a latte and cappuccino is that a cappuccino has more foam and chocolate placed on top of the drink.",R.drawable.newcappuccino),
            new CoffeeTypes("Double Espresso (Doppio)","A double espresso (aka “Doppio”) is just that, two espresso shots in one cup. Therefore a double espresso consists of:2 shots of espresso in an espresso cup",R.drawable.newdoubleespresso),
            new CoffeeTypes("Espresso (Short Black)","The espresso (aka “short black”) is the foundation and the most important part to every espresso based drink. ",R.drawable.newespressoshortblack),
            new CoffeeTypes("Flat White","A flat white is a coffee you’ll primarily find in Australia and New Zealand. It is made the same as a cappuccino expect it does not have any foam or chocolate on top.",R.drawable.newflatwhite),
            new CoffeeTypes("Long Black (Americano)","A long black (aka “americano”) is hot water with an espresso shot extracted on top of the hot water.",R.drawable.newlongblack),
            new CoffeeTypes("Long Macchiato.","A long macchiato is the same as a short macchiato but with a double shot of espresso.",R.drawable.newlongmacchiato),
            new CoffeeTypes("Mocha","A mocha is a mix between a cappuccino and a hot chocolate. It is made by putting mixing chocolate powder with an espresso shot and then adding steamed milk and micro-foam into the beverage.",R.drawable.newmochacoffee),
            new CoffeeTypes("Piccolo Latte","A piccolo latte is a café latte made in an espresso cup. This means it has a very strong but mellowed down espresso taste.",R.drawable.newpiccololatte),
            new CoffeeTypes("Ristretto.","A ristretto is an espresso shot that is extracted with the same amount of coffee but half the amount of water.",R.drawable.newristretto),
            new CoffeeTypes("Short Macchiato.","A short macchiato is similar to an espresso but with a dollop of steamed milk and foam to mellow the harsh taste of an espresso.",R.drawable.newshortmacchiato)



    };

    CoffeeTypes(String name, String desc, int imgID){
        this.name=name;
        this.desc=desc;
        this.imgID=imgID;
    }

    public String getDesc(){

        return desc;
    }
    public String getName(){

        return name;
    }
    public int getImgID(){

        return imgID;
    }
    public String toString(){
        return this.name;
    }

    public void onCreate(Bundle savedInstanceState) {
    }
}
