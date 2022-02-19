/**
 * Gorila
 */
class Gorila extends Mamifero {

    public Gorila() {
        super();
    }

    public void lanzarAlgo() {
        System.out.println("El Gorila arrojó algo");
        setNivelDeEnergia(getNivelDeEnergia() - 5);
    }

    public void comerBananas() {
        System.out.println("Gorila complacido con las bananas");
        setNivelDeEnergia(getNivelDeEnergia() + 10);
    }

    public void escalar() {
        System.out.println("Gorila trepó al árbol");
        setNivelDeEnergia(getNivelDeEnergia() - 10);
    }

}