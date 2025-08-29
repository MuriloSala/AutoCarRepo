
public class ClasseAutomotores {
	
	String corAt;
	String marcat;
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
	  
	  public void alterarCor2(String corPar) {
		  this.corAt = corPar;
	  }
	

}
