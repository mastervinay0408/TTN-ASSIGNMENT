package com.example.weeklyassignment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {


@GET("api/users?page=2")
Call<UserModel> getUserModel();



}
