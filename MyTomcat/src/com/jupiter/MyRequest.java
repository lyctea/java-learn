package com.jupiter;

import java.io.InputStream;

public class MyRequest {
    //请求方法 GET/POST
    private String requestMethod;
    private String requestUrl;

    public MyRequest(InputStream inputStream) throws Exception {
        // 定义缓冲区
        byte[] buffer = new byte[1024]; //字符数组
        //读取数据的长度
        int len = 0;
        // 定义请求的变量
        String str = null;
        if ((len = inputStream.read(buffer)) > 0) {
            str = new String(buffer, 0, len);
        }
        String data = str.split("\n")[0];
        String[] params = data.split(" ");
        this.requestMethod = params[0];
        this.requestUrl = params[1];
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }
}
