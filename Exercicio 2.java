//Luis Fernando Fernandes e Kauã Carvalho
//Imprimir números primos de 1 a 123
//Questao 2 - Faça um programa para imprimir os números primos de 1 a 123.

public class Ex_2 { 
    public static void main(String[] args) {    
        for (int num = 2; num <= 123; num++) 
            if ((num % 2) == 0){
                System.out.println(num + " é um número primo!");
        }  
    }
}