import service.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main implements Menu {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao {Hotel}");
        Scanner scanner = new Scanner(System.in);
        String nome = null;
        try {
            System.out.println("qual o seu nome?");
            nome = scanner.next();
            System.out.println("qual a senha?");
            int senha = scanner.nextInt();
            
            if (senha !=  2678) {
                System.out.println("Senha incorreta");
                Main.main(args);
            }
        }catch (InputMismatchException error){
            System.out.println("Entrada de dados invalida");
            Main.main(args);
        }
        
        Menu.menu(nome);

    }
}