package com.bjsxt;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //实例化
        Set<Integer> set = new HashSet<>();

        while (true){
            int num = (int)(Math.random()*10+1);
            //将元素添加到容器中，由于Set类型容器是不允许有重复元素的，所以不需要判断
            set.add(num);
            //结束循环
            if (set.size() == 10){
                break;
            }

        }

        for (Integer integer:set){
            System.out.println(integer);
        }

    }
}
