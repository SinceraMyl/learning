package com.bjsxt.testInterface;

/**
 * 测试默认方法
 */

public class TestDefaultMethod {
    public static void main(String[] args) {
        B b = new Test_B();
        b.moren();
    }

}
interface B{

    default void moren(){
        System.out.println("我是接口A中的默认方法");
    }
}

class Test_B implements B{
    @Override
    public void moren() {
        System.out.println("Test_B.moren");
    }
}
