package com.kerwim.immutableClass;

public class WriterDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("C语言程序设计");
        book.setPrice(79);

        Writer writer = new Writer("谭浩强",58, book);
        System.out.println("定价：" + writer.getBook());
        writer.getBook().setPrice(59);
        System.out.println("促销价：" + writer.getBook());
    }
}