/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma.de.numeros;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SumaDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //impleamos la entada de texto
        System.out.println("ingrese un valo: ");
        int num = leer.nextInt();
        int suma = 0;
        //cliclo for y nombamos la vaiabl i
        for(int i =0; i <= num; i++ ){
            suma = suma + i;  
        }
        System.out.print("la suma es " +suma);     
    }
        
}
