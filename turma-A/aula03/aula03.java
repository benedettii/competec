import java.util.Scanner;

public class Aula_03 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        /*
        for (int i=1; i<=1000; i++){
        
            if (i % 10 == 0){
                System.out.println(i);

            }
            
        }
        */
        //int numeros[] = {1,5,6,2,9};
        /* int numeros[] = new int[5];
        numeros[0]= 1;
        numeros[1]= 5;
        numeros[2]= 6;
        numeros[3]= 2;
        numeros[4]= 9;
         */

         //int numeros[] = {1,5,6,2,9};
         //int soma= numeros[2]+numeros[3];
         //System.out.println(soma);
         //imprime: 8

         /*
          * String cidades[] = {"São Paulo", "Rio de Janeiro"};
          char caracteres[] = new char[256];
          */

            //char alfabeto[] = {'a'};
            //int tamanho = alfabeto.lenght();
            //System.out.println(tamanho);
            //imprime 1

        /*
        int numero[] = {2,4,14};
        int soma = numero[0]+numero[1]+numero[2];
        System.out.println(soma);
        */

        /*
        String nomes[] = {"São Paulo", "Londres", "J"};
        for (String n:nomes){
            //System.out.println(n+"");
            System.out.print(n+"");
        }

        String nome[] = {"São Paulo", "Londres", "J", "Nerdola"};
        System.out.println(nomes.length()+""+nome[0]);
        */


        /*
        //dando entrada de valores com arrays
        int val[] = new int[5];

        for(int i = 0; i < val.length; i++) {
            val[i] = scn.nextInt();
        }
        */

        /*
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scn.nextInt();
        int mult = 1;
        double media = 0;

        int val[] = new int[tamanho];

        for (int i = 0; i < val.length; i++) {
            System.out.print("Digite o "+(i+1)+"º número: ");
            val[i] = scn.nextInt();
            mult *= val[i];
            media += val[i];
        }
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Os valores são: ");
        for (int j = 0; j < val.length;j++){
            System.out.print(val[j]+" ");
        }
        System.out.println("");
        System.out.println("A multiplicação dos valores são: "+mult);
        media /= val.length;
        System.out.println("A média dos valores é: "+media);
        */


        



    }
}