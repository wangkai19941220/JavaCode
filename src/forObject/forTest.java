/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package forObject;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象在循环内实例化和在循环外实例化不一样
 *
 * @author wangkai
 * @created 2019/1/21
 */
public class forTest {

    public static void main(String[] args){
        List<Integer> actorIdList = new ArrayList<>();
        actorIdList.add(1);
        actorIdList.add(2);
        List<BlackListEntity> blackListEntityList=new ArrayList<>();
/*
        BlackListEntity blackListEntity=new BlackListEntity();
*/

        for (int i=0;i<actorIdList.size();i++){
            BlackListEntity blackListEntity=new BlackListEntity();
            blackListEntity.setId(i);
            blackListEntityList.add(blackListEntity);
        }
        System.out.println(blackListEntityList.toString());
    }
}