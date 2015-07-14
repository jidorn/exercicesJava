package formes.formes3D;

import formes.IGeometrie;

/**
 * Created by alexMac on 31/03/15.
 */
public abstract class Geometrie3D implements IGeometrie {
    protected String nom;
    protected int volume;

    public Geometrie3D(String nom, int volume) {
        this.nom = nom;
        this.volume = volume;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Geometrie3D that = (Geometrie3D) o;

        if (volume != that.volume) return false;
        return nom.equals(that.nom);

    }

    @Override
    public int hashCode() {
        int result = nom.hashCode();
        result = 31 * result + volume;
        return result;
    }

    @Override
    public String toString() {
        return "Geometrie3D{" +
                "nom='" + nom + '\'' +
                ", volume=" + volume +
                '}';
    }

    public int volume(){
        int volume=0;
        return volume;
    }

    @Override
    public int aire() {
        return 0;
    }

}
