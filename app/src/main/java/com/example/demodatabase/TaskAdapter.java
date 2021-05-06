package com.example.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TaskAdapter  extends ArrayAdapter<Task> {
    private ArrayList<Task> item;
    private Context context;
    private TextView tvId, tvDescription, tvDate;

    public TaskAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);
        item = objects;
        this.context = context;
    }
    @Override
    public View getView(int position, @Nullable View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvId = rowView.findViewById(R.id.tvId);
        tvDescription = rowView.findViewById(R.id.tvDescription);
        tvDate = rowView.findViewById(R.id.tvDate);

        Task currentItem = item.get(position);

        tvId.setText("Item: " + currentItem.getId());
        tvDescription.setText("Desc: " + currentItem.getDescription());
        tvDate.setText("Date: " + currentItem.getDate());

        return rowView;
    }
}