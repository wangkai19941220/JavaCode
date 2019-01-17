/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package reflect;

import java.lang.reflect.Method;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/17
 */
public class MethodDemo1 {
    public static void main(String[] args){
        //A a1=new A();
        //Class c=a1.getClass();
        Class c= null;
        try {
            c = Class.forName("reflect.A");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Method m = c.getMethod("print",int.class,int.class);
            m.invoke(null,2,3);
            System.out.println("==================");

            Method m1=c.getMethod("print",String.class,String.class);
            m1.invoke(null,"A","B");//静态方法可省略对象，直接用null替代
            System.out.println("==================");

            Method m4=c.getMethod("print");
            m4.invoke( null);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
class A{
    public static void print(){
        System.out.println("hello world");
    }

    public static void print(int a,int b){
        System.out.println(a+b);
    }

    public static void print(String a,String b){
        System.out.println(a.toLowerCase()+","+b.toLowerCase());
    }
}