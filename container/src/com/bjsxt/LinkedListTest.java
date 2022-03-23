package com.bjsxt;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        //添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

        //获取元素
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----------------");
        for (String str:list){
            System.out.println(str);
        }

        /*System.out.println("-----------LinkedList-------------");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("a");
        linkedList.addFirst("b");
        linkedList.addFirst("c");
        for (String str:linkedList){
            System.out.println(str);
        }*/
        System.out.println("-------------");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("a");
        linkedList.addLast("b");
        linkedList.addLast("c");
        for (String str:linkedList){
            System.out.println(str);
        }

        System.out.println("-----------");
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println("---------------");
        linkedList.removeFirst();
        linkedList.removeLast();
        for (String str:linkedList){
            System.out.println(str);
        }

        System.out.println("-------------");
        linkedList.addFirst("c");
        linkedList.pop();
        for (String str:linkedList){
            System.out.println(str);
        }

        System.out.println("----------");
        linkedList.push("h");
        for (String str:linkedList){
            System.out.println(str);
        }
        System.out.println(linkedList.isEmpty());





    }

}
