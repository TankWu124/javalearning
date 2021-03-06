package com.imooc.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {

    public static void main(String[] args) {
        try {
            int result=test();
            System.out.println("one和two的商是："+result);
        }catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("除数不能为0");
        }catch(InputMismatchException e){
            System.out.println("请输入整数");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("其他异常");
            e.printStackTrace();
        }
        test();
    }
    /**通过throws抛出异常时，针对可能出现的多种异常情况，解决方案
     * 1、throws后面接多个异常类型，中间用逗号分隔
     * 2、throws后接Exception
     * */

    /**
     * 测试接收数据相除结果的方法
     * @return 两个接收数据的商
     * @throws ArithmeticException
     * @throws InputMismatchException
     */
    public static int test() throws ArithmeticException, InputMismatchException  {
        Scanner input=new Scanner(System.in);

            System.out.println("请输入第一个整数");
            int one = input.nextInt();
            System.out.println("请输入第二个整数");
            int two = input.nextInt();
            System.out.println("one和two的商是：" + (one / two));
            return one/two;
        }


//    public static int test() throws Exception{
//        Scanner input=new Scanner(System.in);
//
//        System.out.println("请输入第一个整数");
//        int one = input.nextInt();
//        System.out.println("请输入第二个整数");
//        int two = input.nextInt();
//        System.out.println("one和two的商是：" + (one / two));
//        return one/two;
//    }
}
