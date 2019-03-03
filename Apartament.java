package AsocProprietari;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Apartament implements Comparable<Apartament>, Serializable {

    private static final long serialVersionUID = 762805935415564116L;
    //fields
    int numarCamere;
    List<Locatar> listaLocatari;
    int numarApart;

    //constructor
    public Apartament(int numarCamere, int numarApart) {
        this.numarCamere = numarCamere;
        this.listaLocatari = new ArrayList<>();
        this.numarApart = numarApart;
    }

    //method
    public void adaugaLocatar(Locatar loc){
        listaLocatari.add(loc);
    }

    public void stergeLocatar(Locatar loc){
        listaLocatari.remove(loc);
    }

     public List<Locatar>  getLocatar(){
        return listaLocatari;
    }

    public int getNrAp(){
        return numarApart;
    }
    @Override
    public String toString(){
        return "apartamentul "+ numarApart + " care are " + numarCamere + " camere " + listaLocatari;
     }


    @Override
    public int compareTo(Apartament o) {
        return this.numarApart-o.numarApart;
    }
}

