import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        float n1, n2, n3, n4, media; 
        System.out.println("Digite a primeira nota: ");
        n1 = scanner.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = scanner.nextFloat(); 
        System.out.println("Digite a terceira nota: ");
        n3 = scanner.nextFloat(); 
        System.out.println("Digite a quarta nota: ");
        n4 = scanner.nextFloat();
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.printf("Sua media final é: %.1f %n ", media);
        
    }
}
