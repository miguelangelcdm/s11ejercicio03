/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11ejercicio03;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class S11ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int pos=0;
        int neg=0;
        int c=0;
        double t=0;
        System.out.println("ingrese varios numeros");
        int num=input.nextInt();
        if (num==0) {
            System.out.println("no se ingreso ningun numero");
            System.exit(1);
        }
        while(num!=0){
            System.out.println("no es cero");
            num=input.nextInt();
            if (num>0) {
                pos++;
            }else {neg++;}
            c++;
            t+=num;
            num=input.nextInt();
        }
        double p=t/c;
        System.out.println("positivos: "+pos);
        System.out.println("negativos: "+neg);
        System.out.println("cantidad: "+c);
        System.out.println("total: "+t);
        System.out.println("promedio: "+p);
    }
    
}
