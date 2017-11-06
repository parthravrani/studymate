package com.ravrani_software_developers.studymate;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Parth on 11/3/2017.
 */

public class ListViewAdapter extends BaseAdapter {

    Activity context;
    String title[];
    String description[];

    public ListViewAdapter(Activity context, String[] title, String[] description) {
        super();
        this.context = context;
        this.title = title;
        this.description = description;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        TextView textViewTitle;
        TextView textViewDescription;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        LayoutInflater inflater = context.getLayoutInflater();

        if (view == null){
            view = inflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.textViewTitle = (TextView)view.findViewById(R.id.text1);
            holder.textViewDescription = (TextView)view.findViewById(R.id.text2);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        holder.textViewTitle.setText(title[i]);
        holder.textViewDescription.setText(description[i]);
        return view;
    }
}
