package com.java.effective.common;

/**
 * Created by wushu on 2017/4/7.
 * 第49条：基本类型优先于装箱基本类型
 */
public class BoxedPrimitiveDemo {
    static Integer i;

    public static void main(String[] args){
        Integer a = new Integer(42);
        Integer b = new Integer(42);
        if(a == b){
            System.out.println("a与b完全相同");
        }else{
            System.out.println("a与b值相同");
        }
        //↑打印结果为：a与b值相同

        Integer c = 127;
        Integer d = 127;

        if(c == d) {
            System.out.println("c == d");
        } else {
            System.out.println("c != d");
        }

        Integer e = 129;
        Integer f = 129;
        if(e == f){
            System.out.println("e == f");
        }else {
            System.out.println("e != f");
        }
        /*↑打印结果为：
            c == d
            e != f
        */

        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        if(str1 == str2){
            System.out.println("str1 == str2");
        }else {
            System.out.println("str1 != str2");
        }

        if(str1 == str3){
            System.out.println("str1 == str3");
        }else{
            System.out.println("str1 != str3");
        }

        /**
         * 打印结果：
         * str1 == str2
         * str1 != str3
         */

        Long sum = 0L;
        for(long len = 0; len < Integer.MAX_VALUE; len++){
            sum += len;
        }
        System.out.println(sum);
        //↑此处运行非常缓慢，因为执行了非常多的拆箱、装箱操作

        long sum1 = 0;
        for(long len = 0; len < Integer.MAX_VALUE; len++){
            sum1 += len;
        }
        //↑相比之下，此处快多了
        System.out.println(sum);


        if(i == 42){
            System.out.println("");
        }
        //↑此处会抛异常,Exception in thread "main" java.lang.NullPointerException
        //  at com.java.effective.common.BoxedPrimitiveDemo.main(BoxedPrimitiveDemo.java:20)
    }
}
