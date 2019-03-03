package AsocProprietari;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
      /*List<Apartament> listaApartamente = new ArrayList<>();

        Apartament unApartament = new Apartament(3, 5);
        Apartament ap = new Apartament(4, 23);
        listaApartamente.add(unApartament);
        listaApartamente.add(ap);

        Asociatie asoc = new Asociatie(listaApartamente);

        Locatar unLocatar = new Locatar("Zizi", unApartament);
        unApartament.adaugaLocatar(unLocatar);
        Locatar altLocatar = new Locatar("Mimi", ap);
        ap.adaugaLocatar(altLocatar);

        //System.out.println(asoc.getAllLocatarUnsorted());
        System.out.println(asoc.getLocatarByName());
        System.out.println(asoc.getLocatarByApartament());
        asoc.save();
*/
        Asociatie aaa =  Asociatie.load();

        System.out.println(aaa);
        System.out.println(aaa.getLocatarByName());
        System.out.println(aaa.getLocatarByApartament());
    }
}
