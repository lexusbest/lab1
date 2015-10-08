package lab1;

public class Irakurri {
	
	public Irakurri(){	
		
	}
	
	public void kargatu(String fitx)throws Exception{
		try{
			 Scanner entrada = new Scanner(new FileReader(nomF));
			 String linea;
			 while (entrada.hasNext()) {
				 linea = entrada.nextLine();
			 
			 }
			 entrada.close();
			 }
			 catch(IOException e) {e.printStackTrace();}
	}

}
