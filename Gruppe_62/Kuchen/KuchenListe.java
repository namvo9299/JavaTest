package Kuchen;

import java.util.ArrayList;

public class KuchenListe {
	
	//ArrayListe erstellen
	private ArrayList <KuchenInformation> liste;
    public KuchenListe ( ) {
	
	//Neue Daten eingeben
	liste = new ArrayList<KuchenInformation> ();
	liste.add(new KuchenInformation ( "Vanille", "Rund",true, 4.5));
	liste.add(new KuchenInformation ( "Schokolade", "Herz", true, 5.9));
	liste.add(new KuchenInformation ( "Schokolade", "Rund", true, 6.5));
	liste.add(new KuchenInformation ( "Obst", "Rechteckig", false, 4.5));
	
	
	
}

public ArrayList<KuchenInformation> getListe() {
	return liste; 
}

}
