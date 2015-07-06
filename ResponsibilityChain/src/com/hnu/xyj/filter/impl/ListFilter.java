package com.hnu.xyj.filter.impl;

import com.hnu.xyj.filter.FilterChain;
import com.hnu.xyj.filter.interf.Filter;
import com.hnu.xyj.request.Request;
import com.hnu.xyj.response.Response;

/**
 * Created by xyj on 15/7/6.
 */
public class ListFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        //实现相关逻辑，比如判断是否在黑名单中

        //调用下一个过滤器
        chain.doFilter(request, response, chain);

        //处理Response
        response.setReponse(response.getReponse() + "--ListFilter");
    }
}
