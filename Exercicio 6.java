//Luis Fernando Fernandes e Kauã Carvalho
//Converter de quilos para libras e vice-versa
//Questão 6  Existem 454 gramas em uma libra, e 1000 gramas em um quilo. Faça um programa que converta quilos para libras e vice-versa. (Dica: use um caractere indicando a ordem da conversão, exemplo "java q 1000" seria o comando para converter 1000 quilos para libra, e "java l 1000" seria o comando para converter 1000 libras para quilo)

import java.util.Scanner; //Importar Scanner

public class Ex_6 {
    public static void main(String[] args){
        float peso; //Variáveis
        String tipo;
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite um peso(Libras ou Quilos): "); //Entrada
        peso = Ler.nextFloat();
        System.out.println("Digite o tipo de peso('l' = Libras / 'q' = quilos): ");
        tipo = Ler.next();

        if (tipo == "l"){
            System.out.println("Quilos: " + (peso - (peso * 2.2046)));
            System.out.println("Libras: " + peso * 2.2046); 
        }else{
            System.out.println("Libras: " + peso * 2.2046);
            System.out.println("Quilos: " + (peso - (peso * 2.2046)));
        }
        Ler.close();
    }
}