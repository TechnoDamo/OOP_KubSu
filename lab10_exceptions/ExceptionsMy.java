import java.util.*;
public class ExceptionsMy {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input day");
        int d = sc.nextInt();
        System.out.println("Input month");
        int m = sc.nextInt();
        System.out.println("Input year");
        int y = sc.nextInt();
        try {
            Data date = new Data(d, m, y);
            //method call
        }
        catch(MyException e)
        {System.out.println(e.getMessage()+" "+e.getDate());}
    }
}
