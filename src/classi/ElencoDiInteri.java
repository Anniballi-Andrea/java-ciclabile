package classi;

public class ElencoDiInteri {
    private int[] elenco;

    public ElencoDiInteri(int[] number) {
        this.elenco = number;
    }

    public void getElenco() {
        for (int i = 0; i < this.elenco.length; i++) {
            System.out.println(this.elenco[i]);
        }
    }

    public int getElementoSuccessivo(int i) {

        if (i > this.elenco.length) {
            i = 0;
        }
        System.out.println(this.elenco[i]);
        return i = i++;

    }
}
