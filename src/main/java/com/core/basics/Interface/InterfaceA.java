package com.core.basics.Interface;

public interface InterfaceA {
    public static final String getMsg22 = "private";
    //protected String getMsg26 = "private";
    //private String getMsg27 = "private";

    String print();

   default String getMsg() {

      return "";
   }

    private String getMsg2() {

        return "";
    }

    static void getM() {

    }

    /*protected String getMsg22() {

        return "";
    }*/
}
