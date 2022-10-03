package com.example.lib;

public class abstraction {

}

abstract class Bird{

    abstract void walk();

}

interface IFlyingBird{
    void fly();
}

class Crown extends Bird implements IFlyingBird{

    @Override
    void walk() {

    }

    @Override
    public void fly() {

    }
}
class Papugai extends Bird implements IFlyingBird{

    @Override
    void walk() {

    }

    @Override
    public void fly() {

    }
}

class Penguin extends Bird{

    @Override
    void walk() {

    }


}


