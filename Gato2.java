import java.util.Scanner;

public class Gato2 {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una cadena de 9 caracteres que incluya solo los caracteres 'X', 'O' y '_'): ");
        String cadena = input.nextLine().toUpperCase();

        if (cadena.length() != 9 || !cadena.matches("[XO_]{9}")) {
            System.out.println("Cadena incorrecta, debe incluir 9 caracteres exactamente 9 ('X','O' y '_').");
            return;
        }
        String marco = " " + cadena.charAt(0) + " | " + cadena.charAt(1) + " | " + cadena.charAt(2) + " \n" +
                       "-----------\n" +
                       " " + cadena.charAt(3) + " | " + cadena.charAt(4) + " | " + cadena.charAt(5) + " \n" +
                       "-----------\n" +
                       " " + cadena.charAt(6) + " | " + cadena.charAt(7) + " | " + cadena.charAt(8) + " \n";


        System.out.println("La cadena ingresada es : " + cadena);
        System.out.println("El marco del juego es :\n" + marco);
    }
}
