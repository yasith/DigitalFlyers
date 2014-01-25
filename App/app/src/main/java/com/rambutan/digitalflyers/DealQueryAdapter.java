package com.rambutan.digitalflyers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.parse.GetDataCallback;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseImageView;
import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

/**
 * Created by yasith on 1/24/2014.
 */
public class DealQueryAdapter extends ParseQueryAdapter<Deal> {

    public DealQueryAdapter(Context context, final String store) {
        super(context, new ParseQueryAdapter.QueryFactory<Deal>() {
            public ParseQuery<Deal> create() {
                // Get all routes as a ParseQuery
                ParseQuery query = new ParseQuery("Deal");
                if (!store.toLowerCase().contentEquals("all")) {
                    query.whereEqualTo("store", store);
                }
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
        //TextView discount = (TextView) v.findViewById(R.id.item_discount);
        TextView store = (TextView) v.findViewById(R.id.item_store);
        ImageView image = (ImageView) v.findViewById(R.id.item_image);

        name.setText(deal.getName());
        price.setText(deal.getPrice());
        //discount.setText(Integer.toString(deal.getDiscount()));
        store.setText(deal.getStore());

        if (image == null) {
            image = new ImageView(getContext());
        }
        String url = deal.getImage();

        Picasso.with(getContext()).load(url).resize(150,150).centerCrop().into(image);

        return v;
    }

}
