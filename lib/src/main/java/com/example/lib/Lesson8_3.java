package com.example.lib;

public class Lesson8_3 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        try{
            shop.setAge(19);
        }catch (ChildException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println(shop.getAge());
        }
    }
}

class Shop{
    private int age;

    public int getAge() {
        return age;
    }
   public void setAge(int age)throws ChildException {
        if (age < 18) {
            throw new ChildException("you are child");
        }else {
            this.age=age;
            System.out.println("alcohol sold");
        }
    }
}



class ChildException extends Exception{
    private String message;

    ChildException(String massage) {
        this.message = massage;
    }

    public String getMessage(){
        return message;
        }

}

