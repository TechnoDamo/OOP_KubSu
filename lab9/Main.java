import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Amount of students: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            String fio, adress, fackulty;
            int year;
            System.out.println("fio: ");
            fio = sc.next();
            System.out.println("adress: ");
            adress = sc.next();
            System.out.println("fackulty: ");
            fackulty = sc.next();
            System.out.println("year: ");
            year = sc.nextInt();
            System.out.println("grades(0 when finish): ");
            ArrayList<Integer> grades = new ArrayList<Integer>();
            int gr = 2;
            while(gr!=0)
            {
                gr = sc.nextInt();
                grades.add(gr);
            }
            grades.remove(grades.size()-1);
            Student st = new Student(fio, adress, fackulty, year, grades);
        }
    }
}