/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad05;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Actividad05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int V1 = solicitaEntero("número entero");
        double V2 = solicitaDouble ("número decimal");
        String V3 = solicitaString ("frase");
        System.out.println(V1);
        System.out.println(V2);
        System.out.println(V3);
 }
    public static int solicitaEntero(String mensaje){
        Scanner T = new Scanner (System.in);
        int varentera = 0;
        boolean flag;
        do{
        System.out.println("Escriba " + mensaje);
        try{
        varentera = T.nextInt();
        flag = false;
    }catch (Exception ex){
            System.out.println("Escribio una variable incorrecta " + ex);
            flag = true;
            T.nextLine();
    } 
  } while (flag); 
    return varentera;
    }
    public static double solicitaDouble (String mensaje){
        Scanner T = new Scanner (System.in);
        double vardouble = 0;
        boolean flag;
        do{
        System.out.println("Escriba " + mensaje);
        try{
        vardouble = T.nextDouble();
        flag = false;
    }catch (Exception ex){
            System.out.println("Escribio una variable incorrecta " + ex);
            flag = true;
            T.nextLine();
    } 
  } while (flag); 
    return vardouble;
    }
    public static String solicitaString (String mensaje){
        Scanner T = new Scanner (System.in);
        String varstring = null;
        boolean flag;
        do{
        System.out.println("Escriba " + mensaje);
        try{
        varstring = T.nextLine();
        flag = false;
    }catch (Exception ex){
            System.out.println("Escribio una variable incorrecta " + ex);
            flag = true;
            T.nextLine();
    } 
  } while (flag); 
    return varstring;
    }
   }
    

