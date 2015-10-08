package lab1;

public abstract class Pelikula implements Comparable<Pelikula>{
	private String izenburua;
	private ListaAktoreak lista;
	
	public Pelikula(String pIzenburua){
		this.izenburua=pIzenburua;
		this.lista=new ListaAktoreak();
	}
	
	public boolean equals(Pelikula p){
		if (this.izenburua.equals(p.izenburua)){
			return true;
		}
		else{ return false;}
	}
	
	public int compareTo(Pelikula p){
		return this.izenburua.compareTo(p.izenburua);
	}
	
	public void gehituAktorea(Aktorea a){
		if (!this.lista.aktoreHauDu(a)){
			this.lista.gehituAkt(a);
		}
	}
	
	public void kenduAktorea(Aktorea a){
		if (this.lista.aktoreHauDu(a)){
			this.lista.kenduAkt(a);
		}
	}
	
	public ListaAktoreak aktoreakBueltatu() {
		return this.lista;
	}

}
