package com.rambutan.digitalflyers;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;

/**
 * Created by yasith on 1/24/2014.
 */

@ParseClassName("Deal")
public class Deal extends ParseObject {
    public Deal(){}

    public String getName(){
        return getString("name");
    }

    public double getPrice() {
        return getDouble("price");
    }

    public int getDiscount() {
        return getInt("discount");
    }

    public String getStore() {
        return getString("store");
    }

    public String getImage() {
        return "http://tuxv.net/images/" + getString("image");
    }
}
