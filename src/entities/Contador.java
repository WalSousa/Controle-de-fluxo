package entities;

import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void contandor() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametro1 = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametro2 = scanner.nextInt();

        try {
            contar(parametro1,parametro2);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
    static void contar(int p1, int p2) throws ParametrosInvalidosException {
        int interacao;
        if (p1>p2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }else {
            interacao = p2 - p1;
        }
        for (int i = 1;i<=interacao;i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
