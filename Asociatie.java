package AsocProprietari;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asociatie implements Serializable {

    private static final long serialVersionUID = 9063601868027962743L;
    //fields -
    //bucata de cod de mai jos imi spune ca definesc ca field, o lista  (care poate fi doar de tip Apartament)
    //si ii dau numele de apList.
    List<Apartament> apList;

    //constructor - "primeste lista de apartamente" tot ce pun intre parantezele rotunde
    public Asociatie(List<Apartament> apList) {
        //ce trebuie sa faca constructorul cu lista primita
        this.apList = apList;
    }

    @Override
    public String toString() {
        return "" + apList;
    }

    public List<Locatar> getAllLocatarUnsorted() {
        //creem o lista temporara de locatari
        List<Locatar> tmpList = new ArrayList<>();
        //pentru fiecare apartament din lista
        for (int i = 0; i < apList.size(); i++) {
            //Obtinem locatarii apartamentului curent ( pentru ca ii vizitez cu FOR mai sus
            List<Locatar> obj = apList.get(i).getLocatar();
            //dupa ce i-am obtinut ii adaug in lista mea temporara
            tmpList.addAll(obj);
        }
        return tmpList;
    }

    public List<Locatar> getLocatarByName() {
        List<Locatar> tmpListLocSorted = getAllLocatarUnsorted();
        Collections.sort(tmpListLocSorted, new Locatar.ComparatorName());
        return tmpListLocSorted;
    }

    public List<Locatar> getLocatarByApartament() {
        List<Locatar> tmpListLocSorted = getAllLocatarUnsorted();
        Collections.sort(tmpListLocSorted, new Locatar.ComparatorApart());
        return tmpListLocSorted;
    }
    public void save(){
        try{
            FileOutputStream file = new FileOutputStream("asoc.db");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(this);

            out.close();
            file.close();
        }

        catch (IOException ex){
            System.out.println("IOException is caught");
        }
    }
    public static Asociatie load(){

        Asociatie obj = null;
        try{
            FileInputStream file = new FileInputStream("asoc.db");
            ObjectInputStream in = new ObjectInputStream(file);

            obj = (Asociatie)in.readObject();

            in.close();
            file.close();
        }

        catch (IOException ex){

            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}



