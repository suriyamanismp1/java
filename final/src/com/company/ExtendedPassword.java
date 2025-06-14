package com.company;

public class ExtendedPassword extends Password {
    private int decrytedPassword;

    public ExtendedPassword(int Password) {
        super(Password);
        this.decrytedPassword=Password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as "+this.decrytedPassword);
//    }
}
