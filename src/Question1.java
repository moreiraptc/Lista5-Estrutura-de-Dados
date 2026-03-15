//Questão 1.– Implemente um algoritmo que realize o deslocamento de elementos em um array de inteiros para simular a inserção em uma posição específica. O programa deve receber um array, o número
//de elementos preenchidos e o índice desejado. A partir dessa posição, todos os elementos subsequentes
//devem ser deslocados uma casa para a direita para abrir espaço. Ao final, insira o novo valor e exiba
//o array. Este exercício ilustra o custo de inserção O(n) em estruturas sequenciais.

import java.util.Scanner;

public class Question1 {
    static int list[] = new int[10];

    static void main() {

        list[0] = 10;
        list[1] = 20;
        list[2] = 30;
        list[3] = 40;
        list[4] = 50;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos preenchidos");
        int elementosPreenchidos = Integer.parseInt(s.nextLine());

        System.out.println("Digite a posição");
        int positionElement = Integer.parseInt(s.nextLine());

        System.out.println("Digite o valor para inserir");
        int valueElement = Integer.parseInt(s.nextLine());

        moveElementsList(elementosPreenchidos, positionElement, valueElement);
    }

    public static void moveElementsList(int elementosPreenchidos, int positionElement, int valueElement) {

        for (int i = elementosPreenchidos; i > positionElement; i--) {
            list[i] = list[i - 1];
        }

        list[positionElement] = valueElement;

        showNewList(elementosPreenchidos + 1);
    }

    public static void showNewList(int total) {
        for (int i = 0; i < total; i++) {
            System.out.print(list[i] + " ");
        }
    }
}