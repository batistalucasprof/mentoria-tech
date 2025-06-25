import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada das 8 notas
        System.out.println("Digite as 8 notas do ano:");
        System.out.print("Nota 1: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = entrada.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = entrada.nextDouble();
        System.out.print("Nota 4: ");
        double nota4 = entrada.nextDouble();
        System.out.print("Nota 5: ");
        double nota5 = entrada.nextDouble();
        System.out.print("Nota 6: ");
        double nota6 = entrada.nextDouble();
        System.out.print("Nota 7: ");
        double nota7 = entrada.nextDouble();
        System.out.print("Nota 8: ");
        double nota8 = entrada.nextDouble();

        // Cálculos
        double bimestre1 = (nota1 + nota2) / 2;
        double bimestre2 = (nota3 + nota4) / 2;
        double semestre1 = (bimestre1 + bimestre2) / 2;

        double bimestre3 = (nota5 + nota6) / 2;
        double bimestre4 = (nota7 + nota8) / 2;
        double semestre2 = (bimestre3 + bimestre4) / 2;

        double mediaFinal = (semestre1 + semestre2) / 2;

        // Saída
        System.out.println("\nResultados:");
        System.out.println("1º Bimestre: " + bimestre1);
        System.out.println("2º Bimestre: " + bimestre2);
        System.out.println("1º Semestre: " + semestre1);
        System.out.println("----------------------");
        System.out.println("3º Bimestre: " + bimestre3);
        System.out.println("4º Bimestre: " + bimestre4);
        System.out.println("2º Semestre: " + semestre2);
        System.out.println("----------------------");
        System.out.println("Média Final: " + mediaFinal);

        entrada.close();
    }
}
