import java.util.Scanner;

public class Question2 {

    static int list[] = new int[5];

    public static void main() {

        list[0] = 10;
        list[1] = 20;
        list[2] = 30;
        list[3] = 40;
        list[4] = 50;

        System.out.println("quantidade de elementos preenchidos");

        Scanner s = new Scanner(System.in);
        int elements = Integer.parseInt(s.nextLine());

        checklist(elements);
    }

    public static void checklist(int elementList) {

        int lengthList = list.length;
        int newValue = 4;

        if (lengthList == elementList) {

            int newList[] = new int[lengthList * 2];


            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }


            newList[elementList] = newValue;

            System.out.println("tamanho novo array: " + newList.length);

            for (int i = 0; i < newList.length; i++) {
                System.out.println(newList[i]);
            }

        } else {

            list[elementList] = newValue;

            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]);
            }
        }
    }
}