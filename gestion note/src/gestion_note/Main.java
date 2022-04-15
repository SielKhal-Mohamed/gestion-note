package gestion_note;

public class Main {

	public static void main(String[] args) {
		etudiant ayoub = new etudiant(3214, "ayoub", 20);
		etudiant hamid = new etudiant(2818, "hamid", 19);
		etudiant simo = new etudiant(1010, "simo");
		System.out.println(ayoub.toString());
		System.out.println(hamid.toString());
		System.out.println(simo.toString());
		System.out.println(ayoub.equals(hamid));
		System.out.println(ayoub.equals(simo));
		System.out.println(ayoub.equals(ayoub));
		System.out.println(ayoub.compareTo(ayoub));
		System.out.println(hamid.compareTo(simo));
		System.out.println(simo.compareTo(hamid));
		ListEtudiant liste =new ListEtudiant();
		liste.add(ayoub);
		liste.add(simo);
		liste.add(hamid);
		liste.add(ayoub);

		


	}

}
