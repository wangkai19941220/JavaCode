/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package reflect;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/17
 */
public class ClassDemo3 {
    public static void main(String[] args){
        String s="33";
        ClassUtill.printClassMethodMessage(s);
        System.out.println("---------------------");
        ClassUtill.printFieldMessage(s);
        System.out.println("---------------------");

        ClassUtill.printConMessage(s);
    }

}