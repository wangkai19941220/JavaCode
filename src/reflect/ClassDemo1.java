/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package reflect;

/**
 * 获取类的类类型的三种方式，同时利用反射使用print 方法
 *
 * @author wangkai
 * @created 2019/1/16
 */
public class ClassDemo1 {
    public static void main(String[] args){
        Foo foo=new Foo();

        //1
        Class c1=Foo.class;

        Class c2=foo.getClass();

        Class c3= null;
        try {
            c3 = Class.forName("reflect.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(c1==c2);
        System.out.println(c2==c3);

        Foo foo1= null;
        try {
            foo1 = (Foo)c1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        foo1.print();
    }
}

class Foo{
    void print(){
        System.out.println("33");
    }
}