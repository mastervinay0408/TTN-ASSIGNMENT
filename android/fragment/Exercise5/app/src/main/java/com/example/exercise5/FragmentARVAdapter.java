package com.example.exercise5;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FragmentARVAdapter extends RecyclerView.Adapter<FragmentARVAdapter.FragmentAViewHolder> {

    private List<ContactUser> dataSet;
    FragmentA.ICommunicator communicator;

    public FragmentARVAdapter(List<ContactUser> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public FragmentAViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new FragmentAViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_fragment_a, parent, false));
    }

    public void setICommunicator(FragmentA.ICommunicator communicator) {
        this.communicator = communicator;
    }

    @Override
    public void onBindViewHolder(FragmentAViewHolder holder, int position) {
        final ContactUser contactUserModel = dataSet.get(position);
        holder.name.setText(contactUserModel.getName());
        holder.phone.setText(contactUserModel.getPhone());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(communicator!=null){
                    communicator.sendData(contactUserModel.getName(), contactUserModel.getPhone());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    class FragmentAViewHolder extends RecyclerView.ViewHolder {
        TextView name, phone;

        public FragmentAViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.row_a_name_tv);
            phone = itemView.findViewById(R.id.row_a_phone_tv);
        }
    }
}
