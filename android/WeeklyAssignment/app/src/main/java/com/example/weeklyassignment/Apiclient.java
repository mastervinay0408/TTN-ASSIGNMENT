package com.example.weeklyassignment;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apiclient {
    public static final String BASE_URl ="https://reqres.in/";
    public static Retrofit retrofit ;


    public static Retrofit getApiClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URl).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;
    }
}
