package com.hnu.xyj.response;

/**
 * Created by xyj on 15/7/6.
 * 模拟经过滤链过滤后的response
 */
public class Response {
    private String reponse;

    public Response(String reponse) {
        this.reponse = reponse;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    @Override
    public String toString() {
        return "Response{" +
                "reponse='" + reponse + '\'' +
                '}';
    }
}
