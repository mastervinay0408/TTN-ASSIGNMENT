package com.example.weeklyassignment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder> {

    private List<Datum> vinay;

    public void setVinay(List<Datum> vinay) {
        this.vinay = vinay;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new AdapterViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder adapterViewHolder, int i) {
        Datum item = vinay.get(i);

        adapterViewHolder.Id.setText(String.valueOf(item.getId()));
        adapterViewHolder.firstname.setText(item.getFirstName());
        adapterViewHolder.lastname.setText(item.getLastName());
    }

    @Override
    public int getItemCount() {
        return vinay.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView Id;
        TextView firstname;
        TextView lastname;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_imageView);
            Id = itemView.findViewById(R.id.textView2);
            firstname = itemView.findViewById(R.id.textView3);
            lastname = itemView.findViewById(R.id.textView4);
        }
    }

}
