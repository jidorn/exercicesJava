package formes.formes2D;

import formes.IGeometrie;

/**
 * Created by alexMac on 31/03/15.
 */
public abstract class Geometrie2D implements IGeometrie{
    protected String name;
    protected int largeur;
    protected int longueur;


    public Geometrie2D() {
    }

    public Geometrie2D(String name, int largeur, int longueur) {
        this.name = name;
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Geometrie2D that = (Geometrie2D) o;

        if (largeur != that.largeur) return false;
        if (longueur != that.longueur) return false;
        return name.equals(that.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + largeur;
        result = 31 * result + longueur;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int aire(int largeur, int longueur) {
        int result = largeur*longueur;
        return result;
    }

    public int perimetre(){
        int perimetre = 0;
        return perimetre;
    }

}
