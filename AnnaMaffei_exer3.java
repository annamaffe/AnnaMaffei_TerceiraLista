/*
 * calcular media de 500 numeros inseridos
 * Anna Clara
 * 16/05/23
 */
import java.util.Scanner;
public class AnnaMaffei_exer3 {
    public static void main(String [] args){
    Scanner s = new Scanner (System.in); 
        //inicializacao das variaveis e do seu valor
        int contador;
        double soma, media;
        contador = 0;
        soma = media = 0.0;

        //laco em que vai aparecer uma mensagem 500 vezes, pedindo pro usuario digitar um numero
        while(contador<500){
            System.out.println("Digite um número: ");
            soma += s.nextDouble();
            contador++;
        }
        ////variavel recebendo a soma dos numeros, dividindo pela quantidade valores
        media = soma/contador;
        System.out.println("A soma é: " + soma);
        System.out.println("O contador é: " + contador);
        System.out.println("A média é: " + media);

        s.close();
    }  
}
  
