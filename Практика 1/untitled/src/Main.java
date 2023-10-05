import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ship s = new ship();
        s.print();
        militaryShip sMil = new militaryShip();
        sMil.print();
        System.out.println();
        sMil.setName("Good");
        sMil.print();
    }
}