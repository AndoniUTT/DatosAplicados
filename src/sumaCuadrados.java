import java.util.Scanner;

public class sumaCuadrados {
    public static int sumaCuadrados(int y, int z) {
        if (y > z) {
            return 0;
        } else {
            int c = y * y;
            return c + sumaCuadrados(y + 1, z);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y,z;
        System.out.println("-----Programa que suma los cuadrados-----");
            System.out.print("Ingrese el valor inicial: "); y = scanner.nextInt();
            System.out.print("Ingrese el valor limite "); z = scanner.nextInt();

            int result = sumaCuadrados(y, z);
            System.out.println("La suma de los cuadrados de " + y + " a " + z + " es: " + result);

            }
}

