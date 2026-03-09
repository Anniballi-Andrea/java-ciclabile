package classi;

public class ElencoDiInteri {
    private int[] elenco;
    private int count;

    public ElencoDiInteri(int[] number) {
        this.elenco = number;
        this.count = -1;

    }

    public ElencoDiInteri() {
        this.elenco = new int[0];
        this.count = -1;
    }

    public void getElenco() {
        for (int i = 0; i < this.elenco.length; i++) {
            System.out.println("il numero alla posizione " + i + " è: " + this.elenco[i]);
        }
    }

    public int getElementoSuccessivo() {
        
        this.count = count + 1;

        return this.elenco[count];

    }

    public boolean hasAncoraElementi() {
        if (this.count >= this.elenco.length - 1) {
            this.count = -1;
            return true;
        } else {

            return false;
        }

    }

    public void addNumber(int number) {
        int[] newElenco = new int[this.elenco.length + 1];
        for (int i = 0; i < elenco.length; i++) {
            newElenco[i] = this.elenco[i];

        }
        newElenco[this.elenco.length] = number;

        this.elenco = newElenco;
    }

}
