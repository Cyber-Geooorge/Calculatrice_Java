import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calculatrice  = new Calculatrice() ;


        System.out.print ("Entrez un premier nombre : " );
        double nombre1 = scanner.nextDouble();


        System.out.print("Choisir  un opérateur (+, -, *, /): ") ;
        String operateur = scanner.next();


        System.out.print(" Entrez un deuxième nombre : " );
        double nombre2 = scanner.nextDouble();




        double resultat = calculatrice.calculer(nombre1, nombre2, operateur) ;
        System.out.println(" Résultat : " + nombre1 + " " + operateur + " " +  nombre2 + " = " + resultat);



        scanner.close();
    }
}