package com.bjsxt.test;

public class Test6 {
    public static void main(String[] args) {
        ShowMsg showMsg = new ShowMsg();
        Generic<Integer> generic = new Generic<>();
        generic.setFlag(20);
        showMsg.showFlag(generic);

        Generic<Number>generic1 = new Generic<>();
        generic1.setFlag(50);
        showMsg.showFlag(generic1);





    }
}
