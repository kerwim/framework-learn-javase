package com.kerwim.try_with_resources;

class MyResourceOutThrow implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw  new Exception("close()");
    }

    public void out() throws Exception{
        throw new Exception("out()");
    }

    public static void main(String[] args) {
        try (MyResourceOutThrow resource = new MyResourceOutThrow();) {
            resource.out();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}