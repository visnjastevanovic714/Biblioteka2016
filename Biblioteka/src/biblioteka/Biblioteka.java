package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface {

	LinkedList<Knjigu> knjige = new LinkedList<Knjigu>();
	@Override
	public void dodajKnjigu(Knjigu knjiga) {
		if(knjiga==null || knjige.contains(knjiga))
			throw new RuntimeException("Greska pri unosu knjige");
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjigu knjiga) {
		if(knjiga==null || !knjige.contains(knjiga))
			throw new RuntimeException("Greska pri brisanju knjige");
		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjigu> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjigu> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac) {
		if (autor==null && isbn==null && naslov==null && izdavac==null)
			throw new RuntimeException("Morate uneti bar neki kriterijum za pretragu");
		LinkedList<Knjigu> pronadjene = new LinkedList<Knjigu>();
		for(int i=0;i<knjige.size();i++){
			if(knjige.get(i).getNaslov().equals(naslov))
				pronadjene.add(knjige.get(i));
		}
		return pronadjene;
	}

}
