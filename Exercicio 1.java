//Luis Fernando Fernandes e Kauã Carvalho
//Somar os números ímpares entre 0 e 30
//Multiplicar os pares entre 0 e 30
//Questao 1 - Escreva um programa que imprima na tela a soma dos números ímpares entre 0 e 30 e a multiplicação dos números pares entre 0 e 30.
public class Ex_1 {
    public static void main(String[] args){
        int totalImpar = 0;
        long totalPar = 1; //Começa em 1 porquê não é possível multiplicar se começar em 0
        int num;
      
        for(num = 0; num <= 30; num++) { //For para verificar, somar ou multiplicar
          if((num % 2 == 1)) { //Se o número dividido por 2 for 1
            totalImpar += num; //Soma se o número for ímpar
          }else{
            totalPar *= num; //Multiplica se o número for par
          }
       }        
       System.out.println("Multiplicação dos pares: " + totalPar);
       System.out.println("Soma dos ímpares: " + totalImpar); //Exibe os resultados        
    }
}