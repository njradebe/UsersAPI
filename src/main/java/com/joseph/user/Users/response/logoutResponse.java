package com.joseph.user.Users.response;


public class logoutResponse {

    private String token;

    public logoutResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
