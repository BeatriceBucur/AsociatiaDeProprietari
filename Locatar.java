package AsocProprietari;

import java.io.Serializable;
import java.util.Comparator;

public class Locatar implements Serializable {

    private static final long serialVersionUID = -3934289021575742737L;

    public static class ComparatorName implements Comparator<Locatar> {
        @Override
        public int compare(Locatar locatar1, Locatar locatar2 ) {
            return locatar1.nume.compareTo(locatar2.nume);
        }
    }

    public static class ComparatorApart implements Comparator<Locatar> {
        @Override
        public int compare(Locatar locatar1, Locatar locatar2 ) {
            return locatar1.ap.compareTo(locatar2.ap);
        }
    }

    //field
    String nume;
    Apartament ap;

    //constructor
    public Locatar(String nume, Apartament ap) {
        this.nume = nume;
        this.ap = ap;
    }
    @Override
    public String toString(){
        return "" + nume + " sta la " + ap.getNrAp();
    }

    /*public static void main(String[] args) {
        Apartament ap = new Apartament(4,23);
        Locatar altLocatar = new Locatar("mimi", ap);
        System.out.println(altLocatar);
*/
    }




