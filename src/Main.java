public class Main {
    public static void main(String[] args) {

        int suma = 0; // declaro la variable
        int i = 1;    // contador inic en 1

        while (i <= 10) {
            suma += i; // Sumar i a suma
            i++;       // Incrementar 1
        }
        System.out.println("La suma de los números enteros del 1 al 10 es: " + suma);
    }
}
