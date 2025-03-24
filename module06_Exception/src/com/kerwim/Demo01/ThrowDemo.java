package com.kerwim.Demo01;

public class ThrowDemo {

    static void checkEligibilty(int stuage){
        if(stuage<18) {
            throw new ArithmeticException("年纪未满 18 岁，禁止观影");
        } else {
            System.out.println("请认真观影!!");
        }
    }

    public static void main(String args[]){

        //Class.forName("com.kerwim.Demo01.Demo");
        checkEligibilty(10);
        System.out.println("愉快地周末..");
    }

    public void myMethod() {
        try {
            // 可能抛出异常
        } catch (ArithmeticException e) {
            // 算术异常
        } catch (NullPointerException e) {
            // 空指针异常
        }
    }

    static void test() {
        int num1, num2;
        try {
            num1 = 0;
            num2 = 62 / num1;
            System.out.println(num2);
            System.out.println("try 块的最后一句");
        } catch (ArithmeticException e) {
            // 算术运算发生时跳转到这里
            System.out.println("除数不能为零");
        } catch (Exception e) {
            // 通用型的异常意味着可以捕获所有的异常，它应该放在最后面，
            System.out.println("异常发生了");
        }
        System.out.println("try-catch 之外的代码.");
    }

    static void test1 () {
        try{
            int arr[]=new int[7];
            arr[4]=30/0;
            System.out.println("try 块的最后");
        } catch(ArithmeticException e){
            System.out.println("除数必须是 0");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界了");
        } catch(Exception e){
            System.out.println("一些其他的异常");
        }
        System.out.println("try-catch 之外");
    }
}