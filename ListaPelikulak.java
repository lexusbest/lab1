package lab1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPelikulak {
	private ArrayList<Pelikula> lista;
	
	public ListaPelikulak(){
		this.lista=new ArrayList<Pelikula>();
	}
	
	private Iterator<Pelikula> getIteradorea(){
		  return this.lista.iterator();
		 }

	public boolean pelikulaHauDu(Pelikula p) {
		boolean baDago=false;
		Pelikula pelikula1=null;
		Iterator<Pelikula>itr;
		itr=this.getIteradorea();
		while(itr.hasNext()&&!baDago){
		   pelikula1=itr.next();
		   if(pelikula1.equals(p)){
		      baDago=true;
		   }
		  }
		return baDago;
	}

	public void gehituPel(Pelikula p) {
		this.lista.add(p);
		
	}

	public void pelikulakBueltatu() {
		Pelikula pelikula1=null;
		Iterator<Pelikula>itr;
		itr=this.getIteradorea();
		while(itr.hasNext()){
			pelikula1=itr.next();
			System.out.println(pelikula1.getIzenburua());
		}
	}

}
