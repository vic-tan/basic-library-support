package com.tlf.basic.support.okhttp.builder;


import com.tlf.basic.support.okhttp.OkHttpUtils;
import com.tlf.basic.support.okhttp.request.OtherRequest;
import com.tlf.basic.support.okhttp.request.RequestCall;

/**
 * Created by tanlifei on 16/3/2.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers).build();
    }
}
