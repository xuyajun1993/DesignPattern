package com.hnu.xyj;

import com.hnu.xyj.filter.FilterChain;
import com.hnu.xyj.filter.impl.ListFilter;
import com.hnu.xyj.filter.impl.LoginFilter;
import com.hnu.xyj.request.Request;
import com.hnu.xyj.response.Response;

/**
 * Created by xyj on 15/7/6.
 * 用责任链模式模拟spring中的过滤器
 */
public class Main {

    public static void main(String args[]) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new ListFilter())
                .addFilter(new LoginFilter());

        //模拟request请求
        Request request = new Request("xyj", "1213");
        Response response = new Response("");

        filterChain.doFilter(request, response, filterChain);

        System.out.println(response.getReponse());
    }
}
