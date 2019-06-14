package com.mohamedboltia.cargo.View;

import com.mohamedboltia.cargo.Model.User;

public interface LoginView {

    void success(User userRegister);
    void Token(String token);
    void Error();
}
