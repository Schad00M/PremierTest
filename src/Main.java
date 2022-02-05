import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("******************Exo1*****************");
        Exo1 test = new Exo1();
        System.out.println("Enter the minimal value");
        int premiereValeure = test.askValue();
        System.out.println("Enter the maximal value");
        int secondeValeure = test.askValue();
        double answer = test.calculMoyenne(premiereValeure, secondeValeure);
        System.out.println("The medium is = ");
        System.out.println(answer);

        System.out.println("");
        System.out.println("******************Exo2*****************");
        ArrayList nomCousins = new ArrayList();
        nomCousins.add("Aline");
        nomCousins.add("Bertrand");
        nomCousins.add("Charlene");
        nomCousins.add("Damien");
        nomCousins.add("Erika");
        nomCousins.add("Franky");
        nomCousins.add("Helene");
        nomCousins.add("Ivan");
        nomCousins.add("Juliette");
        nomCousins.add("Karl");
        nomCousins.add("Liliane");
        nomCousins.add("Michel");

         Exo2 test2 = new Exo2();

         test2.afficherMessage(nomCousins);
         test2.calculer(nomCousins);

        System.out.println("");
        System.out.println("******************Exo3*****************");
        System.out.println("Voir le corrigé car c'est long :) ");



    }

}

