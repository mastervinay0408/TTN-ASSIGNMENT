package com.example.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinding.databinding.CardLayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    @NonNull


    private Context context;
    private List<User> users = new ArrayList<>();

    public Adapter(@NonNull Context context, List<User> users) {
        this.context = context;
        this.users = users;
    }


    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        CardLayoutBinding cardLayoutBinding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()),R.layout.card_layout,viewGroup,false);
                MyViewHolder myViewHolder  = new MyViewHolder(cardLayoutBinding);

                return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        User user = users.get(i);
        viewHolder.cardLayoutBinding.setUser(user);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }






    public static class MyViewHolder extends RecyclerView.ViewHolder {

        CardLayoutBinding cardLayoutBinding;


        public MyViewHolder(@NonNull CardLayoutBinding itemView) {
            super(itemView.getRoot());
            cardLayoutBinding=itemView;




        }
    }
}
