package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }
    public void finalize(){
        System.out.println("A Cat was destroyed");
    }
    //напишите тут ваш код

}

class Dog {
    public void finalize(){
        System.out.println("A Dog was destroyed");
    }//напишите тут ваш код
}
