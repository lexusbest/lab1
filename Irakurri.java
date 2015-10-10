package lab1;

import java.util.*;
import java.io.*;

public class Irakurri {
	
	public Irakurri(){	
		
	}
	
	public void kargatu(String fitx)throws Exception{
		Aktorea aktore=null;
		int i;
		Pelikula peli=null;
		try{
			 Scanner sarrera = new Scanner(new FileReader(fitx));
			 String lerroa;
			 while (sarrera.hasNext()) {
				 i=0;
				 lerroa = sarrera.nextLine();
				 String[] hitzak=lerroa.split(" ### ");
				 aktore= new Aktorea(hitzak[i]);
				 AktoreKatalogoa.getNireAktoreKatalogoa().aktoreaTxertatu(aktore);
				 i++;
				 while(i<hitzak.length){
					 if (!PelikulaKatalogoa.getNirePelikulaKatalogoa().pelikulaDago(hitzak[i])){
						 peli= new Pelikula(hitzak[i]);
						 PelikulaKatalogoa.getNirePelikulaKatalogoa().pelikulaTxertatu(peli);
						 aktore.gehituPelikula(peli);
					 }
					 else{
						 peli=PelikulaKatalogoa.getNirePelikulaKatalogoa().bilatuPelikula(hitzak[i]);
						 aktore.gehituPelikula(peli);	 
					 }
					 peli.gehituAktorea(aktore);
					 i++;
				 }
			 }
			 sarrera.close();
			 }
			 catch(IOException e) {e.printStackTrace();}
	}

}
