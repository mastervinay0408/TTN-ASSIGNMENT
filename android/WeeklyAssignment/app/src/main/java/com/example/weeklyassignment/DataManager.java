package com.example.weeklyassignment;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataManager {

    IDataManagerComm iDataManagerComm;

    public void setiDataManagerComm(IDataManagerComm iDataManagerComm) {
        this.iDataManagerComm = iDataManagerComm;
    }

    public void getData() {
        ApiInterface apiInterface = Apiclient.getApiClient().create(ApiInterface.class);

        Call<UserModel> call = apiInterface.getUserModel();
        call.enqueue(new Callback<UserModel>() {
            @Override
            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                if (iDataManagerComm != null) {
                    if (response.body() != null) {
                        iDataManagerComm.onDataReceived(response.body().getData());
                    }
                }
            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {

            }
        });
    }

    interface IDataManagerComm {
        void onDataReceived(List<Datum> datumList);
    }
}