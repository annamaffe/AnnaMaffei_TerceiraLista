/*
 * mostre numeros de 0 a 200, e mostre uma mensagem a cada multiplo de 10
 * Anna Clara
 * 30/05/23
 */
public class AnnaMaffei_Desf1{
    public static void main(String [] args){
        //inicializacao das variaveis e do seu valor
        int cont1, cont2;
        cont1 = cont2 = 0 ;

        //vai mostrar os numeros ate 200
        while(cont1<200){
        System.out.println(cont1);
        cont1++;
        cont2++;
            
            //se o numero for igual a 10, mostra que é multiplo
            if( cont2 == 10 ){
                System.out.println("O número " + cont1 + " é múltiplo de 10");
                cont2 = 0;
            }
    
        }
    }   
}   


