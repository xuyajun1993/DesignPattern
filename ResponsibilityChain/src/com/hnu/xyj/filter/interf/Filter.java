package com.hnu.xyj.filter.interf;

import com.hnu.xyj.filter.FilterChain;
import com.hnu.xyj.request.Request;
import com.hnu.xyj.response.Response;

/**
 * Created by xyj on 15/7/6.
 */
public interface Filter {
    /**
     * 过滤
     */
    public void doFilter(Request request, Response response, FilterChain chain);
}
