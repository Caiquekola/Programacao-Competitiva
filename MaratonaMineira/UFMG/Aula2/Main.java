import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scan = new Scanner(System.in);
        Set<String> lista = new HashSet<>();
        while(scan.hasNext()){
            String letras = scan.next();
            lista.add(letras);
        }
        System.out.println(lista.size());
        scan.close();
    }
 
}