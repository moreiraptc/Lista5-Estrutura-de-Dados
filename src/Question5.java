import java.util.Scanner;

public class Question5 {
    static int firstList[] = {1, 2, 3, 4, 5};
    static int secondlist[] = {1, 3, 5, 7, 88, 99};
    static int thirdList[] = new int[firstList.length + secondlist.length];

    public static void main() {
        generateNewList(firstList, secondlist);
    }

    public static void generateNewList(int list1[], int list2[]) {
        int i = 0, j = 0, k = 0;

        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j]) {
                thirdList[k] = list1[i];
                i++;
            } else {
                thirdList[k] = list2[j];
                j++;
            }
            k++;
        }


        while (i < list1.length) {
            thirdList[k++] = list1[i++];
        }


        while (j < list2.length) {
            thirdList[k++] = list2[j++];
        }

        showNewList(thirdList);
    }

    public static void showNewList(int list[]) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}