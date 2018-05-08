package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.quakereport.R.layout.quake_list_item;

public class QuakeAdapter extends ArrayAdapter<Quake> {

    QuakeAdapter(Context context, ArrayList<Quake> quakes) {
        super(context, 0, quakes);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    quake_list_item, parent, false);
        }

        // Get the {@link Quake} object located at this position in the list
        Quake currentQuake = getItem(position);

        // Find the TextView in the quake_list_item.xml layout with the ID mag_text_name
        TextView magTextView = listItemView.findViewById(R.id.mag_text_view);
        // Get the magnitude from the current Quake object and
        // set this text on the name TextView
        magTextView.setText(currentQuake.getMagnitude());

        // Find the TextView in the lquake_ist_item.xml layout with the ID place_text_view
        TextView placeTextView = listItemView.findViewById(R.id.place_text_view);
        // Get the place from the current Quake object and
        // set this text on the number TextView
       placeTextView.setText(currentQuake.getLocation());

        // Find the date in the quake_list_item.xml layout with the ID time_text_view
        TextView dateTextView =  listItemView.findViewById(R.id.time_text_view);
        // Get the datefrom the current Quake object and
        // set the text to time
        dateTextView.setText(currentQuake.getTime());

        // Return the whole list item layout (containing 3TextViews )
        // so that it can be shown in the ListView
        return listItemView;
    }
}
