/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.Scanner;

public class PSC_Exercicio_01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int A, B;

        System.out.println("Digite o primeiro valor: ");
        A = leitor.nextInt();
        System.out.println("Digite o Segundo valor: ");
        B = leitor.nextInt();

        if (A > B) {
            System.out.println("O Número maior é: " + A);
        } else {
            if (A == B) {
                System.out.println("Os numeros são iguais.");
            }
            else {
            System.out.println("O numero maior é: "+ B);}
        }

    }

}
