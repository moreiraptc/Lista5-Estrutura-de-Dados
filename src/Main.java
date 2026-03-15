import java.util.Scanner;

public class Main {

    public static void main(){

        System.out.print("Digite o número do exercício que deseja rodar ou 0 para sair: ");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        while (option !=0){
            switch (option){
                case 1:
                    Question1.main();
                    break;
                case 2:
                    Question2.main();
                    break;
                case 3:
                    Question3.main();
                    break;
                case 4:
                    Question4.main();
                    break;
                case 5:
                    Question5.main();
                    break;
            }
            System.out.println("");
            System.out.print("Digite o número do exercício que deseja rodar ou 0 para sair: ");

            option = sc.nextInt();
        }
        sc.close();
    }
}