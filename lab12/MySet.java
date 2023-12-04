import java.util.*;
public class MySet {
    TreeSet <Integer> set;
    MySet(TreeSet<Integer> set) {
        this.set = set;
    }

    TreeSet<Integer> getSet() {
        return set;
    }

    void fillSet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы множенства");
        int x = sc.nextInt();
        while (x != 0) {
            set.add(x);
            x = sc.nextInt();
        }
    }

    void print() {
        Iterator it = set.iterator();
        System.out.print("My set: ");
        while (it.hasNext()) {
            System.out.println();
        }
        System.out.println();
    }


    MySet simple() {
        // получить новое множество, состоящее только из не простых элементов исходного

        TreeSet<Integer> set1 = new TreeSet<Integer>(set);
        Iterator it = set1.iterator();
        while (it.hasNext()) {
            int k = 0;
            Integer x = (Integer) it.next();
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    k++;
                }
                if (k == 2) {
                    it.remove();
                }
            }
        }

        return new MySet(set1);
    }
    // объединение 2 множеств
    MySet union(MySet a)
    {
        TreeSet<Integer> set1 = a.getSet();
        TreeSet<Integer> res = new TreeSet<Integer>(set);
        Iterator it = set1.iterator();
        while (it.hasNext()) {
            res.add((Integer) it.next());
        }
        return new MySet(res);
    }


}
// получить новое множество, состоящее из простых элементов исходного
// получить новое множество, как результат пересечения двух множеств
// получить новое множество, как результат разности двух множеств
