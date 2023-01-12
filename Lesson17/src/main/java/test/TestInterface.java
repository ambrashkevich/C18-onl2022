package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestInterface {

    public static void main(String[] args) {

        List list = new ArrayList();

        int value;
        int color;

        Scanner scan = new Scanner(System.in);

        String menu = "Menu\n" + "1 - Make list\n" + "2 - Show massive\n" + "3 - Show number of elements\n"
                + "4 - Show cards by the value\n" + "5 - Show cards by color\n" + "6 - Remove\n" + "7 - Quit\n";

        System.out.println(menu);

        boolean isQuit = false;
        while (!isQuit) {
            byte functuion = scan.nextByte();

            switch (functuion) {

                case 1:
                    // list.makeList();
                    System.out.println("list.makeList();");
                    break;

                case 2:
                    // list.showList();
                    System.out.println("list.showList();");
                    break;

                case 3:
                    System.out.println("Number of elements: ");
                    // list.showNumberOfElements();
                    break;

                case 4:
                    System.out.println("Enter value for search: ");
                    scan.nextLine();
                    value = scan.nextInt();
                    // list.showByValue(value);
                    break;

                case 5:
                    System.out.println("Enter color for search: ");
                    scan.nextLine();
                    color = scan.nextInt();
                    // list.showByColor(color);
                    break;

                case 6:
                    System.out.println("Enter value of card that you want to remove: ");
                    value = scan.nextInt();
                    System.out.println("Enter color of card that you want to remove: ");
                    color = scan.nextInt();
                    // list.remove(value, color);
                    break;

                case 7:
                    isQuit = true;
                    break;

                default:
                    System.out.println("No such menu");
                    break;
            }

            System.out.println(menu);
        }

    }

}