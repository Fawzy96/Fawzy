package com.mohamedboltia.cargo.Presenter;

import android.content.Context;

import com.mohamedboltia.cargo.Model.Request;
import com.mohamedboltia.cargo.Model.RequestResponse;
import com.mohamedboltia.cargo.Retrofit.ApiCLint;
import com.mohamedboltia.cargo.Retrofit.Apiinterface;
import com.mohamedboltia.cargo.View.RequsetView;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Requset_Presenter {



    RequsetView requsetView;
//    public String header = "Authorization" : "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjEzMywiaXNzIjoiaHR0cDovLzUyLjU5LjIzMS41OC9hcGkvdXNlci9sb2dpbiIsImlhdCI6MTU2MDUzMzE4MSwiZXhwIjo3NTYwNTMzMTgxLCJuYmYiOjE1NjA1MzMxODEsImp0aSI6IlZlWjRpQ2JGbEgwVENiTk0ifQPH4b1oSnO1eo90HJg5qjpdExGOLzInBTX-aK6UqoP9w";


    public Requset_Presenter(Context context, RequsetView requsetView) {
        this.requsetView = requsetView;

    }

    public void requset(Request Re) {
        Map<String, String> queryMap = new HashMap<>();
        queryMap.put("Cargo_type", Re.getCargoType());
        queryMap.put("Pick_Up_Location", Re.getPickUpLocation());
        queryMap.put("Deliver_To", Re.getDeliverTo());
        queryMap.put("quantity", Re.getQuantity());
        queryMap.put("Item_Weight", Re.getItemWeight());
        queryMap.put("Item_Width", Re.getItemWidth());
        queryMap.put("Item_Height", Re.getItemHeight());
        queryMap.put("Item_length", Re.getItemLength());
        queryMap.put("start_date", Re.getStartDate());
        queryMap.put("finish_date", Re.getFinishDate());
        queryMap.put("Total_Weight", Re.getTotalWeight());
        queryMap.put("Total_Volume", Re.getTotalVolume().toString());
        queryMap.put("company_import_export",Re.getCompanyImportExport().toString());
        queryMap.put("CreatedAt", Re.getCreatedAt());
        queryMap.put("UpdatedAt", Re.getUpdatedAt());
        queryMap.put("id", Re.getId().toString());

        Apiinterface apiInterface = ApiCLint.getClient().create(Apiinterface.class);
        Call<RequestResponse> call = apiInterface.request(queryMap);
//        Call<RequestResponse> call = apiInterface.request(queryMap,"Authorization ");
        call.enqueue(new Callback<RequestResponse>() {
            @Override
            public void onResponse(Call<RequestResponse> call, Response<RequestResponse> response) {

                if (response.code()==200) {
                    requsetView.success();
                }
//                else if(response.code()==400){
//                    registerView.EmailisUsed();
//                }

                else {
                    requsetView.Error();
                }
            }
            @Override
            public void onFailure(Call<RequestResponse> call, Throwable t) {
                requsetView.Error();

            }
        });
    }
}
