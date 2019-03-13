package simple_rec_app.simplerecyclerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerBasicActivity extends AppCompatActivity {

    private List<MyContactsModel> myContactsModelList;
    private MyContactsAdapter contactsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        RecyclerView recyclerViewContactList = findViewById(R.id.recycler_view_list);
        recyclerViewContactList.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewContactList.setHasFixedSize(true);

        myContactsModelList = new ArrayList<>();

        contactsAdapter = new MyContactsAdapter(myContactsModelList);
        recyclerViewContactList.setAdapter(contactsAdapter);

        initData();

    }

    private void initData() {
        MyContactsModel myContactsModel;
        myContactsModel = new MyContactsModel();
        myContactsModel.setContactNumber("98XXXXXXXX");
        myContactsModel.setName("Emmy");
        myContactsModelList.add(myContactsModel);

        myContactsModel = new MyContactsModel();
        myContactsModel.setContactNumber("98XXXXXXXX");
        myContactsModel.setName("John");
        myContactsModelList.add(myContactsModel);

        myContactsModel = new MyContactsModel();
        myContactsModel.setContactNumber("98XXXXXXXX");
        myContactsModel.setName("Martina");
        myContactsModelList.add(myContactsModel);

        myContactsModel = new MyContactsModel();
        myContactsModel.setContactNumber("98XXXXXXXX");
        myContactsModel.setName("Chris");
        myContactsModelList.add(myContactsModel);

        myContactsModel = new MyContactsModel();
        myContactsModel.setContactNumber("98XXXXXXXX");
        myContactsModel.setName("Lilly");
        myContactsModelList.add(myContactsModel);

        myContactsModel = new MyContactsModel();
        myContactsModel.setContactNumber("98XXXXXXXX");
        myContactsModel.setName("Robbin");
        myContactsModelList.add(myContactsModel);

        myContactsModel = new MyContactsModel();
        myContactsModel.setContactNumber("98XXXXXXXX");
        myContactsModel.setName("Emmy");
        myContactsModelList.add(myContactsModel);

        myContactsModel = new MyContactsModel();
        myContactsModel.setContactNumber("98XXXXXXXX");
        myContactsModel.setName("John");
        myContactsModelList.add(myContactsModel);


        myContactsModel = new MyContactsModel();
        myContactsModel.setContactNumber("98XXXXXXXX");
        myContactsModel.setName("Martina");
        myContactsModelList.add(myContactsModel);


        myContactsModel = new MyContactsModel();
        myContactsModel.setContactNumber("98XXXXXXXX");
        myContactsModel.setName("Sam");
        myContactsModelList.add(myContactsModel);

        contactsAdapter.notifyDataSetChanged();

    }
}
