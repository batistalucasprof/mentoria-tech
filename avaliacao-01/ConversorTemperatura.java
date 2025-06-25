import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();

        // Cálculo das conversões
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Saída
        System.out.println("\nTemperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        entrada.close();
    }
}
