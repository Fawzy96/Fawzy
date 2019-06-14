package com.mohamedboltia.cargo.Retrofit;

import com.mohamedboltia.cargo.Model.LoginResponse;
import com.mohamedboltia.cargo.Model.RegisterResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface Apiinterface {

    @POST("user/register")
    Call<RegisterResponse> register(@QueryMap Map<String, String> queryMab);

    @POST("user/login")
    Call<LoginResponse> login(@QueryMap Map<String, String> queryMab);

}
