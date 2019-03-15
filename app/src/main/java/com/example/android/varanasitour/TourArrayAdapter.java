package com.example.android.varanasitour;

import android.content.Context;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourArrayAdapter extends ArrayAdapter<Tour> {

    public TourArrayAdapter(Context context, ArrayList<Tour> source) {
        super(context, 0, source);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View currentItemView = convertView;
        if (currentItemView == null) {

            currentItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Tour currentTour = getItem(position);

        TextView textView = (TextView) currentItemView.findViewById(R.id.textOfListItem);
        textView.setText(currentTour.getName());
        ImageView imageView = (ImageView) currentItemView.findViewById(R.id.imageOfListItem);
        imageView.setImageResource(currentTour.getImage());
        return currentItemView;
    }
}
