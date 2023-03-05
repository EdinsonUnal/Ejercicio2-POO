//Ejercicio resuelto No 5.
public class Ejercicio2 {
    public static void main(String[] args) {
        double suma, x, y;

        suma = 0;
        x = 20;
        suma += x;
        y = 40;
        x = x + Math.pow(y, 2);
        suma = suma + x / y;

        System.out.println("EL VALOR DE LA SUMA ES: " + suma);
    }
}
