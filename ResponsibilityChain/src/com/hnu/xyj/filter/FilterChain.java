package com.hnu.xyj.filter;

import com.hnu.xyj.filter.interf.Filter;
import com.hnu.xyj.request.Request;
import com.hnu.xyj.response.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xyj on 15/7/6.
 * 过滤链
 */
public class FilterChain implements Filter {
    //保存过滤链中的每个过滤器
    private List<Filter> filterList = new ArrayList<Filter>();
    //用于调用下一个过滤器
    private int index = 0;

    public FilterChain addFilter(Filter filter) {
        filterList.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        //判断index是否越界
        if (index >= filterList.size()) return;
        //取得下一个过滤器
        Filter filter = filterList.get(index);

        index++;

        filter.doFilter(request, response, this);
    }
}
