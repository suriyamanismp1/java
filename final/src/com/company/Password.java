package com.company;

public class Password {
    private static final int key=123456789;
    private final int encryptedPassword;

    public Password(int Password) {
        this.encryptedPassword = encryptDecrypt(Password);

    }
    private int encryptDecrypt(int password){
        return password*key;
    }
    public final void storePassword(){
        System.out.println("Saving password as "+this.encryptedPassword);
    }
    public boolean letMeIn(int password){
        if(encryptDecrypt(password)==this.encryptedPassword){
            System.out.println("welcome");
            return true;
        }else{
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}
