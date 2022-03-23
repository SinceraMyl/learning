package com.bjsxt.String;

public class Test1 {
    public static void main(String[] args) {
        String str1 = new String("abcdefg");
        String str2 = "abcdefg";
        String str3 = "abcdEFG";
        String str4 = "def";

        System.out.println(str1==str2);
        System.out.println(str1);
        System.out.println(str2 );
        //涉及到字符串比较的时候，都用equals方法
        System.out.println(str1.equals(str2));
        System.out.println(str1.length()); // 7
        //
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(6)); // str2.length()-1
        System.out.println(str2.charAt(str2.length()-1)); //取字符串的最后一个字符
        System.out.println(str2.equals(str3));  //false
        System.out.println(str2.equalsIgnoreCase(str3)); // true

        //从开头到结尾查找，返回找到的第一个子字符串的位置。如未找到，返回-1
        System.out.println(str2.indexOf("def"/*str4*/)); //"abcdefg"
        System.out.println("abcdefgdefg".indexOf("DF"));
        //从末尾开始查找
        System.out.println("abcdefgdefg".lastIndexOf("def"));  //结果：7

        //字符串的替换
        String str5 = "abcdbcd".replace('d','D');
        System.out.println(str5);      //abcDbcD

        String str6 = "abcdbcd".replace("cd","CD");
        System.out.println(str6);      //abCDbCD

        System.out.println("sxt, i love u".startsWith("sxt")); //true
        System.out.println("sxt, i love u".endsWith("sxt"));   //false

        //截取子字符串
        String str7 = "abcdefghijklmnopqrstuvwxyz".substring(6);
        System.out.println(str7); //ghijklmnopqrstuvwxyz
        String str8 = "abcdefghijklmnopqrstuvwxyz".substring(6,11); //6-(11-1)
        System.out.println(str8);        //ghijk

        System.out.println("abcdE".toUpperCase());
        System.out.println("abcdE".toLowerCase());

        String str9 = "  a b  ";    //长度7
        String str10 = str9.trim();
        System.out.println(str10.length());
        System.out.println(str10);

        //String 是不可变字符序列。所有的替换、截取子字符串、去空格，转换大小写等都是生成了新字符串
        System.out.println(str9.replace(" ",""));
        System.out.println(str9);




    }
}
