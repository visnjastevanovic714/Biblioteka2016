package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjigu;

public interface BibliotekaInterface {

	public void dodajKnjigu(Knjigu knjiga);
	public void obrisiKnjigu(Knjigu knjiga);
	public LinkedList<Knjigu> vratiSveKnjige();
	public LinkedList<Knjigu> pronadjiKnjigu(Autor autor,String isbn,String naslov, String izdavac);
}
