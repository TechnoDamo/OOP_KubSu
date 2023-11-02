import java.util.*;
public class StudentProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        StudentGroup sg = new StudentGroup();
        System.out.println("Input the amount of students: ");
        int n=sc.nextInt();
        for(int j = 0; j < n; j++)
        {
            System.out.println("Input last name: ");
            String f = scL.next();
            System.out.println("Input adress: ");
            String ad = scL.next();
            System.out.println("Input fackulty: ");
            String fak = scL.next();
            System.out.println("Input year: ");
            int kurs = scL.nextInt();
            System.out.println("Input amount of grades: ");
            int k = scL.nextInt();
            int []m = new int[k];
            System.out.println("Input grades: ");
            for(int i = 0; i < k; i++)
            {
                m[i] = sc.nextInt();
            }
            Student st = new Student(f, ad, fak, kurs, m);
            sg.add(st);
        }
        System.out.println("Whom to delete from the list?");
        String f = scL.next();
        sg.del(f);
        sg.print();
        sg.sortByKurs();
        sg.print();
        sg.print();

    }
}