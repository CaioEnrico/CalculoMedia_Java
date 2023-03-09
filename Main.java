import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double NP1, NP2;

        double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("NP1: ");

        NP1 = sc.nextDouble();

        System.out.println("NP2: ");

        NP2 = sc.nextDouble();

        media = (NP1 + NP2)/2;

        System.out.println("Média: "+(int)media);

        sc.close();

    }
}
