package com.kerwim.SerializableDemo;

import java.io.*;

/**
 *
 */
public class KerwimDemo {

    public static void main(String[] args) {
        // 初始化
        Kerwim kerwim = new Kerwim();
        kerwim.setName("kerwim");
        kerwim.setAge(18);
        System.out.println(kerwim);

        // 把对象写到文件中
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo01"));){
            oos.writeObject(kerwim);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Kerwim.pre = "周芷若";

        // 从文件中读出对象
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("demo01")));){
            Kerwim kerwim1 = (Kerwim) ois.readObject();
            System.out.println(kerwim1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
