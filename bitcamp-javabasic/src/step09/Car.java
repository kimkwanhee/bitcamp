package step09;

public class Car {
    private static Car2 instance;

    System.out.println("-----------------");
    
    Car2 x1 = Car2.getInstance();
    Car2 x2 = Car2.getInstance();
    Car2 x3 = Car2.getInstance();
    if (x1 == x2) System.out.println("x1 == x2");
    if (x1 == x2) System.out.println("x1 == x2");
    }
}