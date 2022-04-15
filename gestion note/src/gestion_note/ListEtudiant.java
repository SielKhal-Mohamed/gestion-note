package gestion_note;

import java.util.ArrayList;

public class ListEtudiant extends ArrayList<etudiant> {
	public boolean add(etudiant hamid) {
		if (this.contains(hamid)) {
			super.set(indexOf(hamid), hamid);
			return true;
		}
		return super.add(hamid);
	}

}
