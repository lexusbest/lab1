package lab1;

public class AktoreKatalogoa {
	private ListaAktoreak lista;
	private static AktoreKatalogoa nireAktoreKatalogoa;
	
	private AktoreKatalogoa(){
		this.lista=new ListaAktoreak();
	}
	
	public static AktoreKatalogoa getNireAktoreKatalogoa(){
		  if(AktoreKatalogoa.nireAktoreKatalogoa==null){
			  AktoreKatalogoa.nireAktoreKatalogoa=new AktoreKatalogoa();
		  }
		  return nireAktoreKatalogoa;
		  
		 }

}
