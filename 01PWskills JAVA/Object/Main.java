import OOP.student;

class student {
    int rollnum;
    String name;
}

public class Main {
    public static void main(String[] args) {

        student obj1 = new student();
        obj1.rollnum = 1;
        obj1.name = "rohan";
        System.out.println(obj1.rollnum);
        System.out.println(obj1.name);

        student obj2 = new student();
        obj2.rollnum = 2;
        obj2.name = "mohan";
        System.out.println(obj2.rollnum);
        System.out.println(obj2.name);
    }
}