import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input amount of elements: ");
        int k = sc.nextInt();
        capabilities[] ar = new capabilities[k];
        for(int i = 0; i < k; i++)
        {
            //для ввода и вывода значений писать дохера, общая логика и так понятна
            System.out.print("1-plane, 2-duck, 3-person, 4-fish, 5-dog: ");
            int p = sc.nextInt();
            if(p==1)
            {
                plane P = new plane();
                ar[i] = P;
            }
            else if(p==2)
            {
                duck D = new duck();
                ar[i] = D;
            }
            else if(p==3)
            {
                person P = new person();
                ar[i] = P;
            }
            else if(p==4)
            {
                fish F = new fish();
                ar[i] = F;
            }
            else if(p==5)
            {
                dog D = new dog();
                ar[i] = D;
            }
        }
    }
}