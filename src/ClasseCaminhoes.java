public class ClasseCaminhoes extends ClasseAutomotores {
    float cargaSuportadaAt;

    public ClasseCaminhoes() {
        super();
    }

    public ClasseCaminhoes(String corAt, String marcaAt, String modeloAt, String tipoAt, float cargaSuportadaAt) {
        super(corAt, marcaAt, modeloAt, tipoAt);
        this.cargaSuportadaAt = cargaSuportadaAt;
    }

    public float getCargaSuportadaAt() {
        return cargaSuportadaAt;
    }

    public void setCargaSuportadaAt(float cargaSuportadaAt) {
        this.cargaSuportadaAt = cargaSuportadaAt;
    }
}