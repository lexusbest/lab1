package lab1;

public class PelikulaKatalogoa {
	private ListaPelikulak lista;
	private static PelikulaKatalogoa nirePelikulaKatalogoa;
	
	private PelikulaKatalogoa(){
		this.lista=new ListaPelikulak();
	}
	
	public static PelikulaKatalogoa getNirePelikulaKatalogoa(){
		  if(PelikulaKatalogoa.nirePelikulaKatalogoa==null){
			  PelikulaKatalogoa.nirePelikulaKatalogoa=new PelikulaKatalogoa();
		  }
		  return nirePelikulaKatalogoa;
		  
		 }

}
