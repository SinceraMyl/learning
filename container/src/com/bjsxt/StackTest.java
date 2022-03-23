package com.bjsxt;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        //实例化栈容器
        Stack<String> stack = new Stack<>();
        //将元素添加到栈容器中
        stack.push("a");
        stack.push("b");
        stack.push("c");
        //判断容器是否为空
        System.out.println(stack.empty());
        //查看栈顶元素
        System.out.println(stack.peek());
        //返回元素在栈容器中得位置
        System.out.println(stack.search("a"));


        String p1 = stack.pop();
        System.out.println(p1);
        String p2 = stack.pop();
        System.out.println(p2);
        String p3 = stack.pop();
        System.out.println(p3);
        boolean flag1 = stack.empty();
        System.out.println(flag1);

        System.out.println("----------------------------");
        StackTest stackTest = new StackTest();
        stackTest.symmetry();


    }

    //匹配符号得对称性
    public void symmetry(){
        String str = "...{.....[....(....)...]....}..(....)..[...]..()()().";
        //实例化stack
        Stack<String> stack = new Stack<>();
        //假设修正法
        boolean flag = true; //假设是匹配的
        //拆分字符串获取字符
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (c == '{'){
                stack.push("}");
            }

            if (c == '['){
                stack.push("]");
            }

            if (c == '('){
                stack.push(")");
            }

            //判断符号是否匹配
            if (c=='}'||c==']'||c==')'){
                if (stack.empty()){
                    //修正处理
                    flag = false;
                    break;
                }

                String x = stack.pop();
                if (x.charAt(0) != c){
                    //修正处理
                    flag = false;
                    break;
                }
            }
        }

        if (!stack.empty()){
            //修正处理
            flag = false;
        }

        System.out.println(flag);








    }


}
