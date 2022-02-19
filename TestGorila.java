/**
 * TestGorila
 */
class TestGorila {

    public static void main(String[] args) {
        
        // Simulaciones de la aplicación
        
        // Prueba creación de instancia y de la clase
        Gorila g = new Gorila();
        
        // Prueba gorila arroja tres cosas
        System.out.println("\n----- Prueba gorila arroja tres cosas -----");
        g.lanzarAlgo();
        g.lanzarAlgo();
        g.lanzarAlgo();
        
        // Prueba gorila come plátanos dos veces
        System.out.println("\n----- Prueba gorila come plátanos dos veces -----");
        g.comerBananas();
        g.comerBananas();

        // Prueba gorila trepa una vez
        System.out.println("\n----- Prueba gorila trepa una vez -----");
        g.escalar();
        
        // Prueba mostramos el nivel de energía del gorila al final
        System.out.println("\n----- Prueba mostramos el nivel de energía del gorila al final -----");
        System.out.println("Nivel de energía: " + g.getNivelDeEnergia());
    }
}