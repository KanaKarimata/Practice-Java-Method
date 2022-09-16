package com.practice;

public class Method {
    public static void main(String[] args) {
        System.out.println("メソッドを呼び出します");
        //int ans = add(100, 10);
        //System.out.println(ans);
        //int returnValue = methodA();
        //System.out.println(returnValue);
        //hello("Kana");
        //hello("Naoki");
        //add(100, 2);
        //add(100, 5);
        //int[] array = {1, 2, 3};
        //printArray(array);
        /*int[] array = {1, 2, 3};
        incArray(array);
        for (int i : array) {
            System.out.println(i);
        }*/
        /*int[] array = makeArray(3);
        for (int i : array) {
            System.out.println(i);
        }*/
        //introduceOneself();
//        String title  = "hello";
//        String address = "kana.com";
//        String text = "Nice to meet you";
//        email(title, address, text);
//
//        email(address, text);
        double triangleArea = calcTriangleArea(10, 8);
        System.out.println(triangleArea);

        double circleArea = calcCircleArea(3.14, 4);
        System.out.println(circleArea);
        System.out.println("メソッドの呼び出しが終わりました");
    }

    public static double calcTriangleArea(double bottom, double height) {
        double ans = (bottom * height) / 2;
        return ans;
    }

    public static double calcCircleArea(double PI, double radius) {
        double ans = (radius * radius) * PI;
        return ans;
    }

    /*public static void email(String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
    }*/

    /*public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }*/
    /*public static void introduceOneself() {
        String name = "Kana";
        int age = 24;
        double height = 163.0;
        char animal = '丑';
        System.out.println(name + age + height + animal);
    }*/

    /*public static int[] makeArray(int size) {
        int[] newArray = new int[size];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }*/
    /*public static void incArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }*/

    /*public static void printArray(int[] array) {
        for (int element: array) {
            System.out.println(element);
        }
    }*/

    /*public static int methodA() {
        int x = 100;
        return x;
    }*/

    /*public static int add(int x, int y) {
        int ans = x + y;
        return ans;
    }*/

    /*public static void add(int x, int y){
        int ans = x + y;
        System.out.println(x + "+" + y + "=" + ans);
    }*/

    /*public static void hello(String name) {
        System.out.println("Hello!" + name);
        howAreYou();
    }

    public static void howAreYou() {
        System.out.println("How are you?");
    }*/


}
