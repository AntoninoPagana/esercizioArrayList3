import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        //Creazione LinkedList e aggiunta di 4 elementi
        LinkedList<Fruit> lista = new LinkedList<>();
        lista.add(new Fruit("Mela"));
        lista.add(new Fruit("Banana"));
        lista.add(new Fruit("Caco"));
        lista.add(new Fruit("Pera"));

        //Stampa LinkedList iniziale
        System.out.println("Lista di base: " + lista);

        //Aggiunta elemento all'inizio della LinkedList + stampa
        lista.addFirst(new Fruit("Arancia"));
        System.out.println("Lista aggiornata con primo elemento: " + lista);

        //Aggiunta elemento alla fine della LinkedList + stampa
        lista.addLast(new Fruit("Melone"));
        System.out.println("Lista aggiornata con ultimo elemento elemento: " + lista);
    }
}
