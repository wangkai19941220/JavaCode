/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/17
 */
public class ClassUtill {
    public static void printClassMethodMessage(Object obj){
        Class c=obj.getClass();
        System.out.println("类的名字");
        System.out.println(c.getName());
        System.out.println("类的不含包的名字");
        System.out.println(c.getSimpleName());
        //获取所有的类
        Method[] methods=c.getMethods();
        for(int i=0;i<methods.length;i++){
           Class returnType=methods[i].getReturnType();
           //打印类的返回值
           System.out.print(returnType.getName()+" ");
            //打印类的名字
           System.out.print(methods[i].getName()+"(");
           //获取所有参数
           Class[] paramTypes = methods[i].getParameterTypes();
           for (Class class1 : paramTypes) {
                System.out.print(class1.getName()+",");
           }
           System.out.println(")");

        }
    }

    public static void printFieldMessage(Object obj){
        Class c=obj.getClass();

        Field[] fields=c.getDeclaredFields();

        for(Field field:fields){
            Class fieldType=field.getType();
            String typeName=fieldType.getName();

            String name=field.getName();

            System.out.println(typeName+" "+name);
        }
    }

    public static void printConMessage(Object obj){
        Class c=obj.getClass();

        Constructor[] constructors=c.getDeclaredConstructors();
        for (Constructor constructor:constructors){
            System.out.println(constructor.getName()+"(");
            Class[] paramTypes=constructor.getParameterTypes();
            for (Class class1 : paramTypes) {
                System.out.print(class1.getName()+",");
            }
            System.out.println(")");
        }
    }
}