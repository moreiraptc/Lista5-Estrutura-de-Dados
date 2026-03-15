public class Question4 {
    int listItems[] = {1, 3, 4, 5, 3, 5, 8, 9,10,10};

    public static void main() {
        Question4 q = new Question4();
        q.checkRepeat(q.listItems);
    }

    public void checkRepeat(int list[]) {
        int listItemsRemove[] = new int[list.length];
        for (int k = 0; k < listItemsRemove.length; k++) listItemsRemove[k] = -1;

        boolean temDuplicado = false;

        for (int i = 0; i < list.length; i++) {
            int countRepeat = 0;
            int itemI = list[i];

            for (int j = 0; j < i; j++) {
                int itemJ = list[j];

                if (itemI == itemJ) {
                    countRepeat++;
                    break;
                }
            }

            if (countRepeat > 0) {
                listItemsRemove[i] = i;
                temDuplicado = true;
            }
        }

        if (temDuplicado) {
            deleteItemRepeat(listItemsRemove);
        } else {
            System.out.println("sem elementos duplicados");
        }
    }

    public void deleteItemRepeat(int listRemove[]) {
        int countKeep = 0;
        for (int i = 0; i < listItems.length; i++) {
            boolean shouldRemove = false;
            for (int j = 0; j < listRemove.length; j++) {
                if (i == listRemove[j]) {
                    shouldRemove = true;
                    break;
                }
            }
            if (!shouldRemove) countKeep++;
        }

        int[] newList = new int[countKeep];

        int newPos = 0;
        for (int i = 0; i < listItems.length; i++) {
            boolean shouldRemove = false;
            for (int j = 0; j < listRemove.length; j++) {
                if (i == listRemove[j]) {
                    shouldRemove = true;
                    break;
                }
            }
            if (!shouldRemove) {
                newList[newPos] = listItems[i];
                newPos++;
            }
        }
        printList(newList);
    }

    public void printList(int list[]) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}