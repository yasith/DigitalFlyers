package com.rambutan.digitalflyers;

import com.parse.ParseClassName;
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

    public String getPrice() {
        return getString("price");
    }

    public int getDiscount() {
        return getInt("discount");
    }
}
