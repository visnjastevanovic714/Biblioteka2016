package biblioteka;

import java.util.LinkedList;

public class Knjigu {

	String naslov;
	String isbn;
	LinkedList<Autor> autori = new LinkedList<Autor>();
	String izdavac;
	String izdanje;
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public String getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(String izdanje) {
		this.izdanje = izdanje;
	}
	
}
