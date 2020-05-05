package com.javarush.task.task12.task1215;

public class B extends A{
    public int i = 10;

    @Override
    public int getI() {
        return super.getI();
    }

    @Override
    public void setI(int i) {
        super.setI(i);
    }
}
