public class Djen {
    public static void main(String[] args) {
        // работа с массивом целых чисел
        Integer []m1 = {1, 2, 3, 4, 5};
        Mass<Integer> mi = new Mass<>(m1);
        try {
            System.out.print(mi.elemByInd(3));
            //mi.obr();
            mi.print();
            mi.chast(2);
        }
        catch (ArrayIndexOutOfBoundsException e)
            //S.O.P.
        {e.getMessage();}
        // работа с массивом вещественных
        Double []m2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        Mass <Double> md = new Mass<>(m2);
        try {
            System.out.println(md.elemByInd(3));
            //mi.obr();
            md.print();
            md.chast(2);
        } catch(ArrayIndexOutOfBoundsException e)
            // S.O.P
        {e.getMessage();}

        // работа с массивом строк
        String []m3 = {"123", "234", "345"};
        Mass <String> ms = new Mass<>(m3);
        try {
            System.out.println(ms.elemByInd(3));
            // mi.obr();
            ms.print();
            ms.chast(2);
        }
        catch (ArrayIndexOutOfBoundsException e)
        // S.O.P()
        {e.getMessage();}
    }
    // задание - написать метод разворота массива, добавить
}
