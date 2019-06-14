package com.mohamedboltia.cargo.Presenter;

import android.content.Context;

import com.mohamedboltia.cargo.Model.RegisterResponse;
import com.mohamedboltia.cargo.Model.UserRegister;
import com.mohamedboltia.cargo.Retrofit.ApiCLint;
import com.mohamedboltia.cargo.Retrofit.Apiinterface;
import com.mohamedboltia.cargo.View.RegisterView;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Register_Presenter {

    RegisterView registerView;

    public Register_Presenter(Context context, RegisterView registerView) {
        this.registerView = registerView;

    }

    public void register(UserRegister user) {
        Map<String, String> queryMap = new HashMap<>();
        queryMap.put("email", user.getEmail());
        queryMap.put("name", user.getName());
        queryMap.put("password", user.getPassword());
        queryMap.put("type", user.getType());
        queryMap.put("tax_card", user.getTax_card());
        queryMap.put("tax_file_number", user.getTax_file_number());
        queryMap.put("tax_register_number", user.getTax_register_number());
        queryMap.put("fax", user.getFax());
        queryMap.put("image", user.getImage());
        queryMap.put("address", user.getAddress());
        queryMap.put("cargo_specialization", user.getCargo_specialization());
        Apiinterface apiInterface = ApiCLint.getClient().create(Apiinterface.class);
        Call<RegisterResponse> call = apiInterface.register(queryMap);
        call.enqueue(new Callback<RegisterResponse>() {
            @Override
            public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {

                if (response.code()==201) {
                    registerView.success();
                }
//                else if(response.code()==400){
//                    registerView.EmailisUsed();
//                }

                else {
                    registerView.Error();
                }
            }
            @Override
            public void onFailure(Call<RegisterResponse> call, Throwable t) {
                registerView.Error();

            }
        });
    }


}
