package palabra.modelo;

import java.util.Random;

public class PalabraSecreta {
	private String palabra;
	
	String[] palabras= 
		{"acuno","acuso","afeas","aguda","agudo","Aland","albas","albos","alces","aleja","algas","almas","alojo","altas","altos","amina","ancas","andas","andes","anima","animo","aojar","aojas","aojos","apees","apoda","apodo","aptas","arces","arcos","ardan","ardas","ardes","arias","arios","arlas","arlos","armes","arpas","artes","Aruba","asate","ascos","asees","aseos","asida","asido","asnos","asolo","aspee","atoja","atojo","autos","avale","avara","bagas","bajas","bajes","bajos","balas","bales","bares","barre","basca","baste","batas","bates","bayas","bebed","bebes","besen","beses","besos","betas","bodas","bogad","bogas","bogue","bojar","bojas","bojos","bolar","bondi","bonos","borre","boses","botad","botan","botas","boten","botes","boyas","bozos","bramo"};
	
	public PalabraSecreta() {
		palabra= generarPalabra();
	}
	
	private String generarPalabra() {
		Random numRandom= new Random();
		return palabras[(numRandom.nextInt(palabras.length-1))];}
	
	
	private boolean comprobarPalabra(String palabra) {
		return this.palabra.equals(palabra);
		}
	
	
	
	
		
	
		}
	

	
