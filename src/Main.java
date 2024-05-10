
public class Main {
    public static class Polimorfismo {
        public static void main(String[] args) {
            Animal miAnimal = new Perro();
            miAnimal.hacerSonido(3); // Ladrar 3 veces
            miAnimal = new Gato();
            miAnimal.hacerSonido(2); // Maullar 2 veces
        }
    }
}