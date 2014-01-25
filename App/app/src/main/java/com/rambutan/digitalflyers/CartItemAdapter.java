package com.rambutan.digitalflyers;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by yasith on 1/25/2014.
 */
public class CartItemAdapter extends ArrayAdapter<CartItem>{

    private final ArrayList<CartItem> mItems;
    private final Context mContext;
    private final int mView;

    public CartItemAdapter(Context context, int view, ArrayList<CartItem> items) {
        super(context, view, items);
        this.mItems = items;
        this.mContext = context;
        this.mView = view;
    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {
       if(view == null)  {
           LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           view = inflater.inflate(mView, null);
       }

        CartItem item = mItems.get(position);

        TextView name = (TextView) view.findViewById(R.id.item_name);
        TextView price = (TextView) view.findViewById(R.id.item_price);
        TextView  store = (TextView) view.findViewById(R.id.item_store);

        name.setText(item.name);
        price.setText(item.price);
        store.setText(item.store);

        ImageView image = (ImageView) view.findViewById(R.id.item_image);

        Picasso.with(mContext).load(item.image).resize(150,150).centerCrop().into(image);

        return view;
    }
}
