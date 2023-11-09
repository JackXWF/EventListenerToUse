package com.jack.demo.test;

public class TableInfoContext {

    public final static ThreadLocal<String> TL = new ThreadLocal<>();


    public static void setInfo(String info) {
        TL.set(info);
    }


    public static String getInfo() {
        return TL.get();
    }


    public static void remove() {
        TL.remove();
    }
}
