
public class ClasseAutomotores {
	
	String corAt;
	String marcaAt;
	String modeloAt;
	String tipoAt;
	
	  public ClasseAutomotores() {
	    }
	  
	  public ClasseAutomotores(String corPar) {
		  this.corAt = corPar;
	  }
	  
	  public String pegarCor() {
		  return corAt;
	  }
	  
	  public void alterarCor(String corPar) {
		  this.corAt = corPar;
	  }
	  
	 
	  public ClasseAutomotores(String marcaPar) {
		  super(corPar);
		  
		  this.marcaAt = marcaPar;
	  }
	
	  
		 
	  public ClasseAutomotores(String modeloPar) {
		  super(corPar);
		  
		  this.marcaAt = modeloPar;
	  }
	
	  
		 
	  public ClasseAutomotores(String tipoPar) {
		  super(corPar);
		  
		  this.marcaAt = tipoPar;
	  }
	

}
