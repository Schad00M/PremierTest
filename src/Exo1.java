import java.util.Random;
import java.util.Scanner;

public class Exo1 {
    Scanner clavier = new Scanner(System.in);
    Random generateur = new Random();
    public int askValue (){
        int value = 0;
        int sortirBoucle = 1;
        System.out.println("Enter a value =");
        /*try catch boucle*/  /*Essayer d'implementer 3 méthodes try catch*/
            do {
                try {
                    value = clavier.nextInt();
                    sortirBoucle = 2;
                } catch (NumberFormatException e) {
                    System.out.println("Erreur, veuillez reessayer!");
                }
            } while (sortirBoucle == 1);
            sortirBoucle = 1;
        return value;
    }

    public double calculMoyenne(int min, int max){
        double moyenne = 0, nombreIteration = 0, sortirBoucle = 1, nombreGenere =0;
        ;

        System.out.println("Enter the number of value to generate");

            do {
                try {
                    nombreGenere = clavier.nextInt();
                    sortirBoucle = 2;
                } catch (Exception e) {
                    System.out.println("Erreur, veuillez reessayer!");
                }
            } while (sortirBoucle == 1);
            sortirBoucle = 1;


        for ( int i = 0 ; i <= nombreGenere; i++){
            int random_int = min + (int)(Math.random() * ((max - min) + 1));
            moyenne += random_int;

        }
        moyenne = moyenne/nombreGenere;
        return moyenne;

    }
}