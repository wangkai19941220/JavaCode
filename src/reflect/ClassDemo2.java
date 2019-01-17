/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package reflect;

/**
 * 编译时刻加载类是静态加载类，运行时刻加载类是动态加载类
 *
 * 如果通过if判断，去new几个不同的对象，如果对象不存在，javac 编译的时候就会通不过，因为new创建对象 是静态加载类，在编译时刻就需要加载所有的可能使用到的类
 * 编译的时候一定要带包名
 * javac reflect/ClassDemo2.java
 * java reflect/ClassDemo2 reflect.Word
 * @author wangkai
 * @created 2019/1/17
 */
public class ClassDemo2 {

    public static void main(String[] args){

        Class c= null;
        try {
            c = Class.forName(args[0]);
            OfficeAble able=(OfficeAble)c.newInstance();
            able.work();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}