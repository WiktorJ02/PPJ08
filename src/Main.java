import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Random r = new Random();
        System.out.println("*** ZAD 1 ***");
        int tab1[] = new int[random(10)];
        int tab2[] = new int[random(10)];
        int tab3[] = new int[random(10)];


        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = random(10);
            System.out.print(tab1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = random(10);
            System.out.print(tab2[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < tab3.length; i++) {
            tab3[i] = random(10);
            System.out.print(tab3[i] + " ");
        }
        int tabWiel[][] = new int[3][];
        tabWiel[0] = tab1;
        tabWiel[1] = tab2;
        tabWiel[2] = tab3;
        System.out.println("");
        System.out.println("------------");
        for (int i = 0; i < tabWiel.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < tabWiel[i].length; j++) {
                System.out.print(tabWiel[i][j] + " ");

            }
            System.out.println("}");
        }


        System.out.println("*** ZAD 2 ***");
        int temp = 0;
        int temp2 = 0;
        int x = 7;
        int tabWiel2[][] = new int[8][8];
        for (int i = 0; i < tabWiel2.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < tabWiel2[i].length; j++) {
                tabWiel2[i][j] = random(9);
                System.out.print(tabWiel2[i][j] + " ");
            }
            System.out.println("}");
            temp += tabWiel2[i][i];
            temp2 += tabWiel2[i][x];
            x--;
        }
        System.out.println(temp);
        System.out.println(temp2);

        System.out.println("*** Zad3 ***");
        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };
        int length = tab[0].length + tab[1].length + tab[2].length;
        int[] newTab = new int[length];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                newTab[j] = tab[i][j];
                System.out.print(newTab[j]);
                System.out.print(" ");
            }
        }
        System.out.println("");
        System.out.println("*** Zad4 ***");
        int tabWiel3[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        for (int i = 0; i < tabWiel3.length; i++) {

            System.out.print(tabWiel3[0][i] + " ");
        }

        System.out.print(tabWiel3[1][3] + " ");
        System.out.print(tabWiel3[2][3] + " ");
        for (int i = 3; i > -1; i--) {

            System.out.print(tabWiel3[3][i] + " ");
        }
        System.out.print(tabWiel3[2][0] + " ");
        for (int i = 0; i < 3; i++) {

            System.out.print(tabWiel3[1][i] + " ");
        }


        System.out.print(tabWiel3[2][2] + " ");
        System.out.print(tabWiel3[2][1] + " ");
        System.out.println(" ");

        System.out.println("*** Zad5 ***");
        show(0);


        System.out.println("*** Zad6 ***");
        int wrt = 5;
        modifyValue(wrt);

        System.out.println("*** Zad7 ***");
        findMax(0, 0, 0);
    }


    public static int random(int i) {
        i = (int) ((Math.random() * i) + 1);
        return i;
    }

    public static void show(int a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc: ");
        a = scanner.nextInt();
        System.out.println("Podana wartosc to: " + a);
    }

    public static void modifyValue(int wrt) {
        System.out.println(wrt);
        wrt = wrt * 5;
        System.out.println(wrt);
    }

    public static void findMax(int a, int b, int c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = scanner.nextInt();
        System.out.println("Podaj b: ");
        b = scanner.nextInt();
        System.out.println("Podaj c: ");
        c = scanner.nextInt();
        if ((a > b) && (a > c)) {
            System.out.println(a);
        }
        if ((b > a) && (b > c)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}


