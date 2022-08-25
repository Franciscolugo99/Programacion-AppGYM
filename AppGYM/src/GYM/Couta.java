package GYM;

public class Couta {
    private int mesCompleto;
    private int mesMedio;

    public Couta() {
    }

    public Couta(int mesCompleto, int mesMedio) {
        this.mesCompleto = mesCompleto;
        this.mesMedio = mesMedio;
    }

    public int getMesCompleto() {
        return mesCompleto;
    }

    public void setMesCompleto(int mesCompleto) {
        this.mesCompleto = mesCompleto;
    }

    public int getMesMedio() {
        return mesMedio;
    }

    public void setMesMedio(int mesMedio) {
        this.mesMedio = mesMedio;
    }

    @Override
    public String toString() {
        if (mesCompleto == 0) {
            return "mes :" + mesMedio;
        }
        if (mesMedio == 0) {
            return "mes :" + mesCompleto;
        }
        return "Error";
    }



}
