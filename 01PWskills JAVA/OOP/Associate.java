package pillers;
class Book {
    int page_no;
    String name;
    float price;
    String writerName;

    public Book(int page_no, String name, String writerName) {
        this.page_no = page_no;
        this.name = name;
        this.writerName = writerName;
    }


    public Book(int page_no, String name, float price, String writerName) {
        this.page_no = page_no;
        this.name = name;
        this.price = price;
        this.writerName = writerName;
    }
}
    class student
    {
        String name;
        int roll_no;
        Book[] book;

        public student(String name, int roll_no, Book[] book)
        {
            this.name = name;
            this.roll_no = roll_no;
            this.book = book;
        }

    }

    public class Associate
    {
        public static void main(String[] args)
        {

            Book[] array = new Book[2];
            array[0] = new Book(324, "GOT", "martin");
            array[1] = new Book(647, "harry potter", 245.5f, "jk rowling");
            student s = new student("ram", 2345, array);
            student s1 = new student("ram", 2345,array );
            System.out.println(s.name);
            System.out.println(s.book[0].name);


        }
    }
