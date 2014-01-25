package com.rambutan.digitalflyers;

import com.activeandroid.Model;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by yasith on 1/25/2014.
 */

@Table(name = "Items")
public class CartItem extends Model{
    @Column(name = "name")
    public String name;

    @Column(name = "price")
    public String price;

    @Column(name = "image")
    public String image;

    @Column(name = "store")
    public String store;


    public CartItem() {
        super();
    }
}
