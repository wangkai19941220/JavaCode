/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package CollectionErgodic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/3/11
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("hello");
        list.add("wangkai");
        list.add("xiaoming");

        //1  第一种遍历方法foreach
        for (String str:list){
            System.out.println(str);
        }
        //2 第二种使用链表进行遍历
         String[] strArray=new String[list.size()];
         list.toArray(strArray);
         for (int i=0;i<strArray.length;i++){
             System.out.println(strArray[i]);
         }
         //3 使用迭代器进行相关遍历
         Iterator<String> ite=list.iterator();
         while (ite.hasNext()){
             System.out.println(ite.next());
         }
    }
}