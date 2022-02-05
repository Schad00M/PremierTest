import java.util.ArrayList;

public class Exo2 {
    public void afficherMessage(ArrayList quelquenoms){
        for (int i =0; i< quelquenoms.size() ; i++) {
            System.out.println("Joyeux Noel " + quelquenoms.get(i));
        }
    }
    public void calculer (ArrayList quelquenoms){
        double prixCumul;
        int caract= 0;
        for (int i =0; i< quelquenoms.size() ; i++) {
        String nom= (String)quelquenoms.get(i);
        caract += (nom.length() +10);
        }
        //System.out.println(caract);
        double transfo = cout(caract);
        double transfo1 = calculTaxe(transfo);

        System.out.println("Le prix, taxe incluse, est = " + transfo1);
    }
    public double cout(int nbreCaract){
        double prix = 0.08*nbreCaract + 1.5*12;
        return prix;
    }

    public double calculTaxe(double nombre){
        double prix = nombre*0.15 +nombre;
        return prix;
    }

}
