package Pract_1_1.tests;

import Pract_1_1.models.Book;

public class TestBook {

    public void runTest() {
        Book book1 = new Book("book1", "author1");
        Book book2 = new Book("book2", "author2");
        System.out.println(book1.toString());
        book1.setName("rofl");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
