package com.example.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.databinding.DataBinding1Binding;

import java.util.ArrayList;
import java.util.List;

public class DataBinding extends AppCompatActivity {
    List<User> users = new ArrayList<>();
    private DataBinding1Binding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.data_binding1);
        mainBinding= DataBindingUtil.setContentView(this,R.layout.data_binding1);
        mainBinding.recyler.setLayoutManager(new LinearLayoutManager(this));
        mydata();
        Adapter adapter=new Adapter(this,users);
        mainBinding.recyler.setAdapter(adapter);


    }


    public void mydata(){

        User user= new User("vinay","8586079719","master@gmail.com");
        users.add(user);
        user= new User("sharthak","555","mastcvaer@gmail.com");
        users.add(user);
        user= new User("rahul","8589719","maste");
        users.add(user);
        user= new User("animesh","8586079719","master@gmail.com");
        users.add(user);
        user= new User("vinay","8586079719","master@gmail.com");
        users.add(user);


    }


}
