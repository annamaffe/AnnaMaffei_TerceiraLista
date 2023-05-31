/*
 * Algoritmo que mostra um número n n vezes
 * Anna Clara
 * 30/05/23
 */
import java.util.Scanner;

public class AnnaMaffei_Desf2{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);

        //inicializacao das variaveis e do seu valor
        int num = 0;

        //teste para "obrigar" o usuario digitar um valor maior que 1
        while(num <= 1){
            //recebendo um valor digitado pelo usario e guardando na memoria
            System.out.print("Digite um valor maior que 1: ");
            num = n.nextInt();
        }
        //cria var cont, ela vai receber o mesmo valor que o usuario digitou, ficando no laco a quantidade de vezes digitada pelo usuario
        for(int cont = num; cont > 0; cont--){
            System.out.println(num);
        }
        n.close();
    }
}