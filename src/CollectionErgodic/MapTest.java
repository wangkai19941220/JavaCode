/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package CollectionErgodic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/3/11
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("1","value1");
        map.put("2","value2");
        map.put("3","value3");
        map.put("4","value4");

        // 1 第一种 普遍使用，二次取值
        for (String key:map.keySet()){
            System.out.println(map.get(key));
        }

        Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry=it.next();
            System.out.println(entry.getKey()+entry.getValue());
        }

        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }

        for (String v:map.values()){
            System.out.println(v);
        }
    }
}