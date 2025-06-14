package com.company;

public class staticInitailziationBlocktest {
    public static final String owner;
    static{
        owner="tim";
        System.out.println("staticInitalizaitonBlocktest  static initialization block called");
    }

    public staticInitailziationBlocktest() {
        System.out.println("static initizlier block is called");
    }
}
