import java.util.Scanner;

public class Question3 {
    static int list[] = {1, 2, 3, 4, 5};

    public static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("{1, 2, 3, 4, 5}");
        System.out.println("digite um valor para remover");
        int elementRemove = Integer.parseInt(s.nextLine());

        moveElementsList(elementRemove);
    }

    public static void moveElementsList(int valueElement) {
        int indexFound = -1;

        for (int i = 0; i < list.length; i++) {
            if (list[i] == valueElement) {
                indexFound = i;
                break;
            }
        }


        if (indexFound != -1) {
            for (int i = indexFound; i < list.length - 1; i++) {
                list[i] = list[i + 1];
            }

            list[list.length - 1] = 0;
        }

        showNewList(list);
    }

    public static void showNewList(int list[]) {
        for (int i = 0; i < list.length; i++) {
            if(list[i] != 0){
                System.out.print(list[i] + " ");
            }

        }
    }
}