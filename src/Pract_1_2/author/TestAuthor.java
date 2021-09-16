package Pract_1_2.author;

public class TestAuthor {

    public void runTest() {
        Author author = new Author("naaame", "sjjdj@jdjdjd.adjdj", 'M');
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());
        author.setEmail("djdjdiiw@djdjs.ds");
        System.out.println(author);
    }
}
