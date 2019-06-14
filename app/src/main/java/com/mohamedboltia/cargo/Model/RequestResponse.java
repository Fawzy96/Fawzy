package com.mohamedboltia.cargo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestResponse {
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("request")
    @Expose
    private Request request;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
