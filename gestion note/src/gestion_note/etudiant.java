package gestion_note;

public class etudiant implements Comparable<etudiant> {
	private int id;
	private String nom;
	private double note;

	public etudiant(int id, String nom) {
		this.id = id;
		this.nom = nom;
		this.note = 10;
	}

	public etudiant(int id, String nom, double note) {
		this.id = id;
		this.nom = nom;
		this.note = note;
	}

	public String toString() {
		return this.nom + " : " + this.note;

	}

	public boolean equals(etudiant hamid) {
		return this.id == hamid.id;

	}

	@Override
	public int compareTo(etudiant hamid) {
		if (this.note > hamid.note)
			return 1;
		if (this.note == hamid.note)
			return 0;
		return -1;
	}

}
