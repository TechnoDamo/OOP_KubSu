import java.util.*;
public class AbstractBody {
    public static void main(String[] args){
        Body[] b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount of elements: ");
        int k = sc.nextInt();
        b = new Body[k];
        for(int i=0; i<k; i++)
        {
            System.out.println("1-shar, 2-paralellogram");
            int p = sc.nextInt();
            if(p==1)
            {
                System.out.println("Input r");
                double r = sc.nextDouble();
                Shar shar = new Shar(r);
                b[i] = shar;
            }
            if(p==2)
            {
                System.out.print("Input 3 sides");
                double a = sc.nextDouble();
                double bl = sc.nextDouble();
                double c = sc.nextDouble();
                Paral paral = new Paral(a, bl, c);
                b[i] = paral;
            }
        }
        for(int i = 0; i < k; i++)
        {
            b[i].print();
            System.out.println("S = "+b[i].S() + " " +"V = " + b[i].V());
        }
    }
}
