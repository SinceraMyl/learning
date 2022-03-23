package com.bjsxt;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //实例化ArrayList容器
        List<String> list = new ArrayList<>();
        //添加元素
        boolean flag = list.add("bjsxt");
        boolean flag2 = list.add("itbz");
        list.add("asdasd");
        System.out.println(flag);

        list.add(1,"OldLu");
        //通过指定索引位置获取元素
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println("------------------");
        //通过循环获取集合中所有元素

        //size（）：返回集合中元素个数
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("----------------");

        //根据索引位置删除指定元素
        String value = list.remove(1);
        System.out.println(value);
        System.out.println("----------");
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("-----------------------");
        //删除指定元素
        boolean flag3 = list.remove("itbz");
        System.out.println(flag3);
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("------替换元素------");
        String val = list.set(0, "itbz");
        System.out.println(val);
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("----清空容器---------");
        list.clear();
        System.out.println(list.size());

        System.out.println("-------判断容器是否为空-------");
        list.add("bjsxt");
        list.add("itba");
        list.add("oldLu");
        list.add("itba");
        //如果容器为空则返回true，否则返回false
        boolean flag4 = list.isEmpty();
        System.out.println(flag4);

        System.out.println("--------判断容器中是否包含指定元素---------");
        //如果在容器中包含指定元素返回true，否则返回false
        boolean flag5 = list.contains("itba");
        System.out.println(flag5);

        System.out.println("-------查找元素在容器中的位置--------");
        //indexOf方法返回的是元素在容器中第一次出现的位置
        //如果元素不存在则返回-1
        System.out.println(list.indexOf("itba"));
        System.out.println("-----------元素最后一次出现的位置----------");
        //lastIndexOf返回的是元素最后一次在容器中出现的位置，如果元素不存在则返回-1
        int lastIndex = list.lastIndexOf("itba");
        System.out.println(lastIndex);

        System.out.println("-------将单例集合转换为数组-------");
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("-------转换为object[]---------");
        //将ArrayList转化为object[]
        //但是不能将转换的数组做强制类型转换
        Object[] arr = list.toArray();
        for (int i=0;i< arr.length;i++){
            String str = (String)arr[i];
            System.out.println(str);
        }

        System.out.println("--------将单例集合转换为指定类型的数组--------");
        //可以将单例集合转换为指定类型数组。但是，类型需要参考泛型中的类型
        String[] arr2 = list.toArray(new String[list.size()]);
        for (int i=0;i< arr2.length;i++){
            System.out.println(arr2[i]);
        }

        System.out.println("------容器的并集操作-------");
        //容器的并集操作
        List<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");

        List<String> b = new ArrayList<>();
        b.add("b");
        b.add("c");
        b.add("d");

        //a并b
        boolean flag6 = a.addAll(b);
        System.out.println(flag6);

        for (int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }

        for (String str:a){
            System.out.println(str);
        }

        System.out.println("--------容器的交集操作---------");
        //容器的交集操作
        List<String> a1 = new ArrayList<>();
        a1.add("a");
        a1.add("b");
        a1.add("c");

        List<String> b1 = new ArrayList<>();
        b1.add("b");
        b1.add("c");
        b1.add("d");

        boolean flag7 = a1.retainAll(b1);
        System.out.println(flag7);
        for (String str:a1){
            System.out.println(str);
        }

        System.out.println("------------容器的差集操作----------");
        //容器的差集操作
        List<String> a2 = new ArrayList<>();
        a2.add("a");
        a2.add("b");
        a2.add("c");

        List<String> b2 = new ArrayList<>();
        b2.add("b");
        b2.add("c");
        b2.add("d");

        boolean flag8 = a2.removeAll(b2);
        System.out.println(flag8);
        for (String str:a2){
            System.out.println(str);
        }

        
    }

}
