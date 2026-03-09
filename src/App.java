import classi.ElencoDiInteri;

public class App {
    public static void main(String[] args) {
        int[] number = new int[] { 1, 2, 4, 6, 10 };

        ElencoDiInteri elenco = new ElencoDiInteri(number);

        ElencoDiInteri secondoElenco = new ElencoDiInteri();

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        System.out.println(elenco.getElementoSuccessivo() + " sei arrivato alla fine? " + elenco.hasAncoraElementi());

        secondoElenco.addNumber(34);

        secondoElenco.addNumber(3);

        secondoElenco.addNumber(87);

        secondoElenco.addNumber(6);

        secondoElenco.addNumber(9);

        secondoElenco.addNumber(94);

        while (!secondoElenco.hasAncoraElementi()) {
            System.out.println(secondoElenco.getElementoSuccessivo());

        }

    }
}