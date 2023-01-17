package Kuchen;

import java.util.ArrayList;

public class KuchenInformation {
	

 private String Geschmack;
 private String Form;
 private boolean Vegan = false;
 private double Preis;


 //Konstruktor

 public KuchenInformation(String geschmack, String form, boolean vegan, double preis) {
	super();
	Geschmack = geschmack;
	Form = form;
	Vegan = vegan;
	Preis = preis;
}
public String getGeschmack() {
	 return this.Geschmack; }
 
 
public String getForm() {
	 return this.Form; }
 
 public double getPreis() {
	 return this.Preis; }

public boolean getVegan(boolean b) {
	return this.Vegan;
}

//public initialize () {
	//return this.

public ArrayList<KuchenInformation> setDefaultCloseOperation(int exitOnClose) {
	
	return null;
}
public static void add(KuchenInformation k1) {
	// TODO Auto-generated method stub
	
}
 
 /*public static void main (String [] argg) {*/
	/* KuchenInformation k1 = new KuchenInformation(" Vanille ", "Rund ", true, 4.50);
	 KuchenInformation k2 = new KuchenInformation(" Schokolade ", " Herz ", false, 5.90);
	 KuchenInformation k3 = new KuchenInformation(" Obst ", "Rechteckig ", true, 6.50);*/
	 
	
	
	 
 }


 

