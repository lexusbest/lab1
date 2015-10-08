package lab1;

import java.util.*;

public class PelikulaKatalogoa {
	private HashMap lista;
	private static PelikulaKatalogoa nirePelikulaKatalogoa;
	
	private PelikulaKatalogoa(){
		this.lista=new HashMap<String,Pelikula>();
	}
	
	public static PelikulaKatalogoa getNirePelikulaKatalogoa(){
		  if(PelikulaKatalogoa.nirePelikulaKatalogoa==null){
			  PelikulaKatalogoa.nirePelikulaKatalogoa=new PelikulaKatalogoa();
		  }
		  return nirePelikulaKatalogoa;
		 }
	
	public void pelikulaTxertatu(Pelikula p){
		if (!this.lista.containsKey(p.getIzenburua())){
			this.lista.put(p.getIzenburua(),p);
		}
	}
	
	

}
