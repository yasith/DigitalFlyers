package com.rambutan.digitalflyers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;

import org.w3c.dom.Text;

/**
 * Created by yasith on 1/24/2014.
 */
public class DealQueryAdapter extends ParseQueryAdapter<Deal> {

    public DealQueryAdapter(Context context) {
        super(context, new ParseQueryAdapter.QueryFactory<Deal>() {
            public ParseQuery<Deal> create() {
                // Get all routes as a ParseQuery
                ParseQuery query = new ParseQuery("Deal");
                return query;
            }
        });
    }

    @Override
    public View getItemView(Deal deal, View v, ViewGroup parent) {

        if (v == null) {
            v = View.inflate(getContext(), R.layout.deal_item, null);
        }

        super.getItemView(deal, v, parent);

        TextView name = (TextView) v.findViewById(R.id.item_name);
        TextView price = (TextView) v.findViewById(R.id.item_price);
        TextView discount = (TextView) v.findViewById(R.id.item_discount);
        TextView store = (TextView) v.findViewById(R.id.item_store);

        return v;
    }

}