package com.example.exercise5;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class FragmentA extends Fragment {

    RecyclerView mFragmentARV;
    List<ContactUser> data;
    FragmentARVAdapter mAdapter;
    ContactUser contactUserModel;
    ICommunicator communicator;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mFragmentARV = view.findViewById(R.id.recycler_view_fragment_a);
        mFragmentARV.setLayoutManager(new LinearLayoutManager(view.getContext()));
        data = new ArrayList<>();
        mAdapter = new FragmentARVAdapter(data);
        mAdapter.setICommunicator(communicator);
        mFragmentARV.setAdapter(mAdapter);
        putData();
        mAdapter.notifyDataSetChanged();

    }

    private void putData() {
        for (int i = 0; i < 5; i++) {
            contactUserModel = new ContactUser();
            contactUserModel.setName("Captain America");
            contactUserModel.setPhone("1234");
            data.add(contactUserModel);
        }
        for (int i = 0; i < 5; i++) {
            contactUserModel = new ContactUser();
            contactUserModel.setName("Iron Man");
            contactUserModel.setPhone("5678");
            data.add(contactUserModel);
        }
        for (int i = 0; i < 5; i++) {
            contactUserModel = new ContactUser();
            contactUserModel.setName("Spiderman");
            contactUserModel.setPhone("90123");
            data.add(contactUserModel);
        }
    }

    public void setICommunicator(ICommunicator communicator) {
        this.communicator = communicator;
    }

    interface ICommunicator {
        void sendData(String a, String b);
    }
}
