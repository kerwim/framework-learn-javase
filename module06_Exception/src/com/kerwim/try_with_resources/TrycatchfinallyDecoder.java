package com.kerwim.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;

public class TrycatchfinallyDecoder {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String path = TrycatchfinallyDecoder.class.getResource("/牛逼.txt").getFile();
            String decodePath = URLDecoder.decode(path,"utf-8");
            br = new BufferedReader(new FileReader(decodePath));

            String str = null;
            while ((str =br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}