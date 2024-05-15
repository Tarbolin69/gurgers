import componentes.Extra;
import componentes.Medallon;
import hamburguesas.HamburguesaDoble;
import hamburguesas.HamburguesaFlex;

public class Main {
    public static void main(String[] args) {
        // Medallones
        Medallon carneVacuna = new Medallon(900);
        Medallon carneBlanca = new Medallon(700);
        Medallon deVegetales = new Medallon(500);
        // Extras
        Extra huevoFrito = new Extra(250);
        Extra quesoCheddar = new Extra(300);
        Extra berenjena = new Extra(250);
        Extra lechugaTomate = new Extra(300);
        Extra cebollaCaramelizada = new Extra(400);
        // Hamburguesa
        HamburguesaDoble burgerDoble= new HamburguesaDoble(2500);
        burgerDoble.addMedallon(carneVacuna);
        burgerDoble.addExtra(quesoCheddar);
        burgerDoble.addMedallon(carneBlanca);
        burgerDoble.addExtra(berenjena);
        System.out.println("El precio de la burger doble es: $" + burgerDoble.getPrecio());
        // Ejemplo de HamburguesoFlex
        HamburguesaFlex laBestia = new HamburguesaFlex(5000);
        for (int i = 0; i <= 100; i++) {
            laBestia.addMedallon(carneVacuna);
            laBestia.addExtra(quesoCheddar);
            laBestia.addExtra(lechugaTomate);
            laBestia.addExtra(huevoFrito);
            laBestia.addExtra(cebollaCaramelizada);
            laBestia.addExtra(berenjena);
            // Le subimos el precio porque si
            carneVacuna.cambiarPrecioBase(carneVacuna.getPrecio() + 100);
        }
        System.out.println("El precio de la bestia es: $" + laBestia.getPrecio());
    }
}