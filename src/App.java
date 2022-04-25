public class App {
    public static void main(String[] args) throws Exception {
        //Suma(2,2,2);
        Coche miCoche = new Coche();
        miCoche.NuevaPuertas();
        miCoche.NuevaPuertas();
        miCoche.NuevaPuertas();
        miCoche.NuevaPuertas();
        System.out.println("El numero de puertas es:"+miCoche.numPuerta);
    }
    public static void Suma(int a, int b, int c ) {
        int resultado = 0;
        resultado = a + b + c;
        System.out.println("El resultado de la suma es: "+resultado);
    }
}
class Coche {
    public int numPuerta = 0;

    public void  NuevaPuertas() {
        numPuerta++;
    }
}