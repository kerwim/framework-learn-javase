package com.kerwim.try_with_resources;

public class TrywithresourcesCustom {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            resource.out();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("关闭自定义资源");
    }

    public void out() throws Exception{
        System.out.println("kerwim，Java牛马");
    }
}