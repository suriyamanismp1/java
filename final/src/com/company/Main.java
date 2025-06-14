package com.company;
public class Main {
    public static void main(String[] args) {
        SomeClass one=new SomeClass("one");
        SomeClass two=new SomeClass("two");
        SomeClass three=new SomeClass("three");
        int pw =12345;
        Password password=new ExtendedPassword(pw);
        password.storePassword();
        password.letMeIn(pw-10);
        password.letMeIn(pw);
    }
}
