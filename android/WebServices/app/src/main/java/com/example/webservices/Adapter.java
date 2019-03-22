package com.example.webservices;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Model> mPostList;

    public Adapter(List<Model> mPostList) {
        this.mPostList = mPostList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Model post = mPostList.get(i);

        myViewHolder.tvMessage.setText(post.getMessage());
        myViewHolder.tvName.setText(post.getName());
        Context context = myViewHolder.ivProfile.getContext();

        if (context != null) {
            Glide.with(context)
                    .load(post.getProfileImage())
                    .apply(new RequestOptions().placeholder(R.drawable.ic_launcher_background))
                    .into(myViewHolder.ivProfile);
        }

    }

    @Override
    public int getItemCount() {
        return mPostList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivProfile;
        TextView tvName, tvMessage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ivProfile = itemView.findViewById(R.id.imageView);
            tvMessage = itemView.findViewById(R.id.editText2);
            tvName = itemView.findViewById(R.id.editText);
        }
    }
}
