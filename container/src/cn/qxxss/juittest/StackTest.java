package cn.qxxss.juittest;

import java.util.Stack;

public class StackTest {
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
