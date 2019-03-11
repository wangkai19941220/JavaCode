/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package CollectionErgodic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/3/11
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set.add("333");
        set.add("3333");
        set.add("33333");
        set.add("333333");

        // 1迭代
        Iterator<String> it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //2 for循环
        for (String str:set){
            System.out.println(str);
        }
    }
}