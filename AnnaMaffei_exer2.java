/*
 * leia dois valores int e mostre os numeros entre eles
 * Anna Clara
 * 16/05/23
 */
import java.util.Scanner;
public class AnnaMaffei_exer2 {
    public static void main(String [] args){
        Scanner v = new Scanner(System.in);

            //recebendo um valor digitado pelo usario e guardando na memoria
            System.out.println("Digite o primeiro valor: ");
            int valor1 = v.nextInt();
            System.out.println("Digite o segundo valor: ");
            int valor2 = v.nextInt();
        //laco que mostra os valores entre eles, do valor 1 ao valor2
        for (int cont=valor1; cont<valor2; cont++){
            System.out.println(cont);
        }
        v.close();
    }
    
}
