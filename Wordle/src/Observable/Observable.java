package Observable;

import java.util.ArrayList;

import vista.AdministradorVista;

public class Observable {
 private ArrayList<AdministradorVista> administradores;
 
 public Observable() {
	 administradores= new ArrayList<AdministradorVista>();
 }

 public void add(AdministradorVista admin) {
	 this.administradores.add(admin);
 	}
 
 public void notificar() {
	 for (AdministradorVista admin: administradores) {
	  admin.update();
	 }
	 
 }
}
