package com.core.basics.Interface;

public interface InterfaceB {
    String print();

    default String getMsg() {

       return "";
   }

    static void getM() {

    }
}
