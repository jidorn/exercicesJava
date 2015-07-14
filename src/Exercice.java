/**
 * Created by alexMac on 31/03/15.
 */
public class Exercice {
    class Maillon{
        private int valeur;
        private Maillon suivant;
    }

    private Maillon debut;
    public void ajout (int v){
        Maillon nouveauMaillon = new Maillon();
        nouveauMaillon.valeur = v;
        nouveauMaillon.suivant = debut;
        debut = nouveauMaillon;
    }

}
