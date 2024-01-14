import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] names = new String[0];
        showMenu();

        while (true) {

            int t = readValue();
            if (t == 1) {
                showNames(names);
            } else if (t == 2) {
                names = addNames(names);
                showNames(names);
            } else if (t == 3) {
                names = deleteNames(names);
                showNames(names);
            } else if (t == 0) {
                System.exit(-1);
            }
            showMenu();


        }


    }

    public static int readValue() {
        return new Scanner(System.in).nextInt();
    }

    public static void showMenu() {
        System.out.println();
        System.out.println("Tanlang: ");
        System.out.println(" 0. exit; \n 1. show elements; \n 2. add elements; \n 3. delete elements;");
    }

    public static void showNames(String[] strings) {
        System.out.println();
        for (int i = 0; i < strings.length; i++) {
            System.out.println(i + 1 + " - " + strings[i]);
        }
    }

    public static String[] addNames(String[] strings) {
        System.out.println("enter name:");
        String s = new Scanner(System.in).next();
        String[] strings1 = new String[strings.length + 1];
        System.arraycopy(strings, 0, strings1, 0, strings.length);
        strings1[strings.length] = s;
        return strings1;
    }

    public static String[] deleteNames(String[] strings) {
        showNames(strings);
        System.out.println("enter index:");
        int i = new Scanner(System.in).nextInt() - 1;
        String[] strings1 = new String[strings.length - 1];
        int r = 0;
        for (int j = 0; j < strings.length; j++) {
            if (i != j) {
                strings1[r++] = strings[j];
            }
        }
        showNames(strings1);
        return strings1;
    }


}