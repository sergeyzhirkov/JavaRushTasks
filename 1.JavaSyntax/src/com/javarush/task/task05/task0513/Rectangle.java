package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int top, left, width, height;
    public void initialize(int top, int left, int width, int height){
        this.height = height;
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public void initialize(int top, int left, int width){

        this.left = top;
        this.top = top;
        this.width = width;
    }
    public void initialize(int top, int left){

        this.left = left;
        this.top = top;
            }
    public void initialize(int top, Rectangle recc){
          this.top = recc.height;

    }
    public static void main(String[] args) {

    }
}
