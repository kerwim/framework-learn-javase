package com.kerwim.String;

public class Test4ArrayConcatenation {
    public static void main(String[] args) {
        //定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
        //并在控制台输出结果。例如，数组为 int[] arr = {1,2,3};
        //执行方法后的输出结果为：[1, 2, 3]


        int[] arr = {1, 2, 3, 4, 5};

        String str = arrToString(arr);
        System.out.println(str);

    }


    //作用：把一个数组变成字符串
    public static String arrToString(int[] arr) {
        String s = "";
        //拼接左括号 //此时是拿着长度为0的字符串，跟[进行拼接，产生一个新的字符串。
        s = s + "[";
        //把新的字符串再赋值给s，此时变量s记录的就是新的字符串"["的地址值

        //下面我想得到数组里面的每一个元素并进行拼接
        //那么就需要遍历数组，得到每一个元素才行
        for (int i = 0; i < arr.length; i++) {
            //假设第一次循环:i = 0 获取的就是0索引上的元素
            //在拼接的时候："[" + 1 + ", " 拼接完毕之后产生一个新的字符串 "[1, "
            //第二次循环：i = 1 获取的就是1索引上的元素
            //在拼接的时候： 此时s就是第一次循环结束后拼接完毕的结果："[1, "
            //在拼接的时候："[1, " + 2 + ", " 拼接完毕之后产生一个新的字符串 "[1, 2, "
            //...
           if(i == arr.length - 1){
               //如果是最后一个元素，那么不需要拼接逗号空格
               s = s + arr[i];
           }else{
               //如果不是最后一个元素，需要拼接元素和逗号空格
               s = s + arr[i] + ", ";
           }
        }

        //等循环结束之后，再拼接最后一个右括号
        s = s + "]";

        return s;

    }


    //用来遍历数组
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");

        //[1, 2, 3, 4, 5]
        //我们现在要知道，这个最终结果是怎么来的？
        //从到右依次打印得来的。
    }
}