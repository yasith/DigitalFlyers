package com.rambutan.digitalflyers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;

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
    public View getItemView(Deal route, View v, ViewGroup parent) {

        if (v == null) {
            v = View.inflate(getContext(), android.R.layout.simple_list_item_1, null);
        }

        super.getItemView(route, v, parent);

        return v;
    }

}
