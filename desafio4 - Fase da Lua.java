package desafios;

import java.util.Scanner;

class desafio4 {



        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            int inicio = leitor.nextInt();
            int fim = leitor.nextInt();

            if (inicio >= 0 && fim <= 2) {
                System.out.println("nova");
            } else if (fim > inicio && fim <= 96) {
                System.out.println("minguante"); //implemente o código aqui
            } else if (inicio >= fim && fim <= 96) {
                System.out.println("minguante"); //implemente o código aqui
            } else {
                System.out.println("cheia");  //implemente o código aqui
            }
        }

    }
