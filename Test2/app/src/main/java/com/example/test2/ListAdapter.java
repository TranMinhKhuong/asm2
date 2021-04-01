package com.example.test2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ListAdapter extends ArrayAdapter {
    private Context context;
    public ListAdapter(@NonNull Context context, List item) {
        super(context, android.R.layout.simple_list_item_1,item);
        this.context = context;
    }
    /**
     * Holder for the list items.
     */
    private class ViewHolder{
        TextView titleModel,nameModel;
        ImageView imageModel;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        Modell item = (Modell) getItem(position);
        View viewToUse = null;
        // This block exists to inflate the settings list item conditionally based on whether
        // we want to support a grid or list view.
        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            viewToUse = mInflater.inflate(R.layout.model, null);
            holder = new ViewHolder();
            holder.titleModel = (TextView) viewToUse.findViewById(R.id.title);
            holder.nameModel = (TextView) viewToUse.findViewById(R.id.name);
            holder.imageModel = (ImageView) viewToUse.findViewById(R.id.imageView1);
            viewToUse.setTag(holder);
        } else {
            viewToUse = convertView;
            holder = (ViewHolder) viewToUse.getTag();
        }
        holder.titleModel.setText(item.getTitle());
        holder.nameModel.setText(item.getName());
        holder.imageModel.setImageResource(item.getImage());
        return viewToUse;
    }
}
