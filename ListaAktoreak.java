package lab1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaAktoreak {
	private ArrayList<Aktorea> lista;
	
	public ListaAktoreak(){
		this.lista=new ArrayList<Aktorea>();
	}
	
	private Iterator<Aktorea> getIteradorea(){
		  return this.lista.iterator();
		 }

	public boolean aktoreHauDu(Aktorea a) {
		boolean baDago=false;
		Aktorea aktore1=null;
		Iterator<Aktorea>itr;
		itr=this.getIteradorea();
		while(itr.hasNext()&&!baDago){
		   aktore1=itr.next();
		   if(aktore1.equals(a)){
		      baDago=true;
		   }
		  }
		return baDago;
	}

	public void gehituAkt(Aktorea a) {
		this.lista.add(a);	
	}

}
