package com.example.lib;

public class Callback {
    public static void main(String[] args) {
        Button button = new Button(new LoginClickListener());
        button.buttonClicked();

    }
}
class LoginClickListener implements iAutthorization {

    @Override
    public void sendLoginRequest(){
        System.out.println("login request");


    }
}

interface iAutthorization {
    void sendLoginRequest();
}
class Button{
    com.example.lib.iAutthorization iAutthorization;
    public Button(com.example.lib.iAutthorization action){
        this.iAutthorization = action;
    }
    void buttonClicked(){
        iAutthorization.sendLoginRequest();
    }

}
