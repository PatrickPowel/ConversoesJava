package br.com.rpires;
import java.util.Scanner;

public class Conversoes {
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = entrada.nextDouble();
        System.out.println(num);
        int a = 5;
        Integer b = Integer.valueOf(a);
        int x = 10;
        Integer y = x; // autoboxing (conversão automática)
        double primitivo2 = num;


    }
}
