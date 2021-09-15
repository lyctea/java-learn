package com.jupiter;

import java.util.HashMap;

public class MyMapping {
    public static HashMap<String, String> mapping = new HashMap<String, String>();

    static {
        mapping.put("/mytomcat", "com.jupiter.MyServlet");

    }

    public HashMap<String, String> getMapping() {
        return mapping;
    }
}
