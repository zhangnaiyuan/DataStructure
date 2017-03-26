package com.yuan.node;

/**
 * Created by Yuan on 2017/3/26,17:12.
 * Description: 位置接口
 */
public interface Position {
    /**
     *  返回存放在该位置的元素
     * @return 该位置的元素
     */
    Object getElem();

    /**
     * 将给定元素存放在该位置,并且返回之前的元素
     * @param obj 给定的元素
     * @return 之前的元素
     */
    Object setElem(Object obj);
}
