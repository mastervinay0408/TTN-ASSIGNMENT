package simple_rec_app.simplerecyclerapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyContactsAdapter extends RecyclerView.Adapter<MyContactsAdapter.ViewHolder> {

    private List<MyContactsModel> contactNamesList;

    public MyContactsAdapter(List<MyContactsModel> contactNamesList){
    this.contactNamesList=contactNamesList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        Log.i("MyContactsAdapter","onCreateViewHolder"+ String.valueOf(i));
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_info_row_item,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Log.i("MyContactsAdapter","onBindViewHolder"+String.valueOf(position));
        MyContactsModel myContactsModel = contactNamesList.get(position);
        viewHolder.tvName.setText(myContactsModel.getName());
        viewHolder.tvContactNo.setText(myContactsModel.getContactNumber());
    }

    @Override
    public int getItemCount() {
        return contactNamesList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{


        TextView tvName;
        TextView tvContactNo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.text_view_contact_name);
            tvContactNo = itemView.findViewById(R.id.text_view_contact_number);
        }


    }
}
