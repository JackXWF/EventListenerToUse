package com.jack.demo.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class Test {

    private Map<String, List<String>> hashMap = new ConcurrentHashMap();


    public void addItem(String key) {
        hashMap.computeIfAbsent(key, k -> new ArrayList<>());
    }

    public List<String> getItem(String key) {
        return hashMap.get(key);
    }
}
