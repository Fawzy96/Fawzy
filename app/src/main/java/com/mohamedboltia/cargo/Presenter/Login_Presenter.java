package com.mohamedboltia.cargo.Presenter;

import android.content.Context;

import com.mohamedboltia.cargo.Model.LoginResponse;
import com.mohamedboltia.cargo.Retrofit.ApiCLint;
import com.mohamedboltia.cargo.Retrofit.Apiinterface;
import com.mohamedboltia.cargo.View.LoginView;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login_Presenter {
    LoginView LoginView;

    public Login_Presenter(Context context, LoginView registerView) {
        this.LoginView = registerView;

    }

    public void login(String email,String Password){
        Map<String, String> queryMap = new HashMap<>();
        queryMap.put("email", email);

        queryMap.put("password", Password);

        Apiinterface apiInterface = ApiCLint.getClient().create(Apiinterface.class);
        Call<LoginResponse> call = apiInterface.login(queryMap);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                if (response.code()==200) {
                    LoginView.success(response.body().getUser());
                    LoginView.Token(response.body().getToken());
                }
//                else if(response.code()==400){
//                    registerView.EmailisUsed();
//                }

                else {
                    LoginView.Error();
                }
            }
            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                LoginView.Error();

            }
        });
    }
}
