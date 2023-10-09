// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        for(int i = 0; i < 120; i++)
        {
            for(int j = 0; j < 100; j++)
            {
                money m = new money(i, j);
                m.print();
                System.out.println();
            }
        }

        }
    }
