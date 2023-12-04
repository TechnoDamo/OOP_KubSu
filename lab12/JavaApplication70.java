import java.util.*;

public class JavaApplication70 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        MySet myset = new MySet(set);
        myset.fillSet();
        myset.print();
        MySet simple = myset.simple();
        System.out.println("Новое множество");
        simple.print();
        TreeSet<Integer> s = new TreeSet<Integer>();
        MySet ms = new MySet(s);
        ms.fillSet();
        MySet union = myset.union(ms);
        System.out.println("Объединение");
        union.print();
    }
}
