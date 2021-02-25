package televisao;

public class Televisao {
    private int canal;
    private int volume;

    public Televisao(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void aumentaCanal() {
        canal++;
    }

    public void diminuiCanal() {
        canal--;
    }

    public int getVolume() {
        return volume;
    }

    public void aumentaVolume() {
        volume++;
    }

    public void diminuiVolume() {
        volume--;
    }

    @Override
    public String toString() {
        return "Canal: " + canal + " Volume: " + volume;
    }
}
