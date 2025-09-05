public class ClasseCarros extends ClasseAutomotores {

    public ClasseCarros() {
        super();
    }

    public ClasseCarros(String corAt, String marcaAt, String modeloAt, String tipoAt) {
        super(corAt, marcaAt, modeloAt, tipoAt);
 
    }
    
    public String getCorAt() {
        return corAt;
    }

    public void setCorAt(String corAt) {
        this.corAt = corAt;
    }

    public String getMarcaAt() {
        return marcaAt;
    }

    public void setMarcaAt(String marcaAt) {
        this.marcaAt = marcaAt;
    }

    public String getModeloAt() {
        return modeloAt;
    }

    public void setModeloAt(String modeloAt) {
        this.modeloAt = modeloAt;
    }

    public String getTipoAt() {
        return tipoAt;
    }

    public void setTipoAt(String tipoAt) {
        this.tipoAt = tipoAt;
    }

}