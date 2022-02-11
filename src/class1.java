import java.util.Scanner;

public class class1{
    public static void main(String[] args) {
        System.out.println("Quantos numeros quer verificar?");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int vetor[] = new int[count];
        for(int x = 0; x< vetor.length; x++){
            vetor[x] = sc.nextInt();
        }
        System.out.println();
        int menor = smallestnumber(vetor);
        System.out.println(menor);
    }
    public static int smallestnumber(int vetor[]){
        int menor = 0;
        for(int i = vetor.length-1; i>=0; i--){

            if(i == vetor.length-1){
                menor = vetor[i];
            }else if(vetor[i]<menor){
                menor = vetor[i];
            }
        }
        return menor;
    }
}
