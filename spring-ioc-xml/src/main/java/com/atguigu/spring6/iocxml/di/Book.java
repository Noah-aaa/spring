package com.atguigu.spring6.iocxml.di;

/**
 * @author longteng
 * @date 2023/9/22 11:51
 **/
public class Book {
    private String name;
    private String author;
    private String others;
    // 生成set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public Book(){
        System.out.println("无参构造启动了");
    }
    public Book(String name,String author){
        this.name = name;
        this.author = author;
        System.out.println("有参构造启动了");
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // 原生写法 set方法
        Book book = new Book();
        book.setName("java");
        book.setAuthor("longteng");
        System.out.println(book.name+book.author);
        // 构造器构造也就是有参构造
        Book book1 = new Book("C++","long");
        System.out.println(book1);
        System.out.println(book1.name+book1.author);
    }
}
