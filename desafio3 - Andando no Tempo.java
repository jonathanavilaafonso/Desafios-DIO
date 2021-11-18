package desafios;
import java.util.Scanner;
import java.io.IOException;

class desafio3 {

        public static void main(String[] args) throws IOException {

            Scanner leitor = new Scanner(System.in);

            int a = leitor.nextInt();

            int b = leitor.nextInt();

            int c = leitor.nextInt();

            if (a + b == c || a + c == b || a + b + c == 0 || a == b || b-a+c == 0 || c-a+b == 0 ) //complete com o código nos espaços em branco

                System.out.println("S");

            else

                System.out.println("N");

        }

    }

