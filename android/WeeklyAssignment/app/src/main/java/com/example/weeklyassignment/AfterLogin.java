package com.example.weeklyassignment;

import android.media.session.PlaybackState;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class AfterLogin extends AppCompatActivity implements DataManager.IDataManagerComm {

    List<Datum> users;
    RecyclerView recyclerView;
    Adapter adapter;
    DataManager dataManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        recyclerView = findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter();
        adapter.setVinay(new ArrayList<Datum>());
        recyclerView.setAdapter(adapter);

        dataManager = new DataManager();
        dataManager.setiDataManagerComm(this);
        dataManager.getData();

    }

    @Override
    public void onDataReceived(List<Datum> datumList) {
        adapter.setVinay(datumList);
        adapter.notifyDataSetChanged();
    }
}
