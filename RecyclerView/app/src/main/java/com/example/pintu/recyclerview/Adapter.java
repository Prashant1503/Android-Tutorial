package com.example.pintu.recyclerview;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private  List<LauncherActivity.ListItem> listItems;

    public List<LauncherActivity.ListItem> getListItems() {
        return listItems;
    }

    public Context getContext() {
        return context;
    }

    public Adapter(List<LauncherActivity.ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    private Context context;



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        LauncherActivity.ListItem listItem = listItems.get(i);

        viewHolder.textViewHeading.setText(listIte);









    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewHeading;
        public TextView textViewDesc;




        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewHeading =(TextView)itemView.findViewById(R.id.textViewHeading);
            textViewDesc =(TextView)itemView.findViewById(R.id.textViewDesc);


        }
    }



}
