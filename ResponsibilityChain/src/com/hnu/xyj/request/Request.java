package com.hnu.xyj.request;

/**
 * Created by xyj on 15/7/6.
 */
public class Request {
    private String usename;
    private String password;

    public Request(String usename, String password) {
        this.usename = usename;
        this.password = password;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Request{" +
                "usename='" + usename + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
