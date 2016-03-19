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
	@Override
	public String toString() {
		return "Knjigu [naslov=" + naslov + ", isbn=" + isbn + ", autori=" + autori + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjigu other = (Knjigu) obj;
		if (autori == null) {
			if (other.autori != null)
				return false;
		} else if (!autori.equals(other.autori))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (izdanje == null) {
			if (other.izdanje != null)
				return false;
		} else if (!izdanje.equals(other.izdanje))
			return false;
		if (izdavac == null) {
			if (other.izdavac != null)
				return false;
		} else if (!izdavac.equals(other.izdavac))
			return false;
		if (naslov == null) {
			if (other.naslov != null)
				return false;
		} else if (!naslov.equals(other.naslov))
			return false;
		return true;
	}
	
}
