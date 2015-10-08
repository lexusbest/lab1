package lab1;

import java.util.*;

public class AktoreKatalogoa {
	private HashMap lista;
	private static AktoreKatalogoa nireAktoreKatalogoa;
	
	private AktoreKatalogoa(){
		this.lista=new HashMap<String,Aktorea>();
	}
	
	public static AktoreKatalogoa getNireAktoreKatalogoa(){
		  if(AktoreKatalogoa.nireAktoreKatalogoa==null){
			  AktoreKatalogoa.nireAktoreKatalogoa=new AktoreKatalogoa();
		  }
		  return nireAktoreKatalogoa;
		  
		 }
	
	public Aktorea aktoreaBilatu(String pIzen){
		Aktorea aktore1=null;
		if (this.lista.containsKey(pIzen)){
			aktore1=(Aktorea)this.lista.get(pIzen);
		}
		return aktore1;
	}
	
	public void aktoreaTxertatu(Aktorea a){
		if (!this.lista.containsKey(a.getIzena())){
			this.lista.put(a.getIzena(),a);
		}
	}
	
	public void quickSort(Aktorea[] taula){
		quickSort(taula,0,taula.length-1);
	}
	
	private void quickSort(Aktorea[] taulaBat,int hasiera,int bukaera){
		if (bukaera-hasiera>0){
			int indizeaZatiketa=zatiketa(taulaBat,hasiera,bukaera);
			quickSort(taulaBat,hasiera,indizeaZatiketa-1);
			quickSort(taulaBat,indizeaZatiketa-1,bukaera);
		}
	}
	private int zatiketa(Aktorea[] taula,int i,int f){
		Aktorea lag=taula[i];
		int ezker=i;
		int eskuin=f;
		while(ezker<eskuin){
			while(taula[ezker].compareTo(lag)<=0 && ezker<eskuin)
				ezker++;
			while(taula[eskuin].compareTo(lag)>0)
				eskuin--;
			if (ezker<eskuin)
				swap(taula,ezker,eskuin);
		}
		taula[i]=taula[eskuin];
		taula[eskuin]=lag;
		return eskuin;
	}
	

}



