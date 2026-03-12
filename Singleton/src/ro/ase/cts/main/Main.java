package ro.ase.cts.main;

import ro.ase.cts.lazy.Hotel;

public class Main {
    public static void main(String[] args){
        Hotel h1=Hotel.getInstance("Hotelul 1 are: ",2, 40);
        Hotel h2=Hotel.getInstance("Hotelul 2 are: ", 2, 45);

        h1.afisareInchiriereCamere();
        h2.afisareInchiriereCamere();

        h1.afisareInchiriereCamere();
        h2.afisareInchiriereCamere();

        h1.afisareDescriere();
        h2.afisareDescriere();

        //Hotel h3= new Hotel(); //de testat ca sa apara eroare, sa ne dam seama daca e singletone
    }
}
