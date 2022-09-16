package com.practice;

public class Method {
    public static void main(String[] args) {
        System.out.println("メソッドを呼び出します");
        //hello("Kana");
        //hello("Naoki");
        add(100, 2);
        add(100, 5);
        System.out.println("メソッドの呼び出しが終わりました");
    }

    public static void add(int x, int y){
        int ans = x + y;
        System.out.println(x + "+" + y + "=" + ans);
    }

    /*public static void hello(String name) {
        System.out.println("Hello!" + name);
        howAreYou();
    }

    public static void howAreYou() {
        System.out.println("How are you?");
    }*/


}
