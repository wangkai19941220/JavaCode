/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package forObject;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/21
 */
public class BlackListEntity {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BlackListEntity{" +
                "id=" + id +
                '}';
    }
}