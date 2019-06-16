package com.mohamedboltia.cargo.Retrofit;

import com.mohamedboltia.cargo.Model.LoginResponse;
import com.mohamedboltia.cargo.Model.RegisterResponse;
import com.mohamedboltia.cargo.Model.RequestResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface Apiinterface {


    @POST("user/register")
    Call<RegisterResponse> register(@QueryMap Map<String, String> queryMab);

    @POST("user/login")
    Call<LoginResponse> login(@QueryMap Map<String, String> queryMab);

//

    @Headers({ "Content-Type: application/json"})
    @POST("request/store")
    Call<RequestResponse> ShowCart(@QueryMap Map<String,String> queryMab,@Header("Authorization") String auth);

    Call<RequestResponse> request(Map<String, Object> queryMap);
    // @Headers("Authorization : Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjEzMywiaXNzIjoiaHR0cDovLzUyLjU5LjIzMS41OC9hcGkvdXNlci9sb2dpbiIsImlhdCI6MTU2MDUzMzE4MSwiZXhwIjo3NTYwNTMzMTgxLCJuYmYiOjE1NjA1MzMxODEsImp0aSI6IlZlWjRpQ2JGbEgwVENiTk0ifQ.PH4b1oSnO1eo90HJg5qjpdExGOLzInBTX-aK6UqoP9w")
//    @Headers({ "multipart/form-data; boundary=--------------------------211242770175566030037627"})
   // @POST("request/store")
   // Call<RequestResponse> request(@QueryMap Map<String,Object> queryMab);


   //    @POST("request/store")
//    Call<RequestResponse> request(@QueryMap Map<String, String> queryMab);

}
