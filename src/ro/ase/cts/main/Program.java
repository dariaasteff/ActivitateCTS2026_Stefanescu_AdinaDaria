package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.loaders.AngajatiLoader;
import ro.ase.cts.clase.loaders.AplicantiLoader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = new AngajatiLoader().load("angajati.txt");
			for (Aplicant angajat : listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afisareFinantare();
				angajat.afisareStatut();
				}
			}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
