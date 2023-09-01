import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

     System.out.println("Sntencias repetitivas");
     System.out.println("setencia while");
     System.out.println("Que tabla de multiplicar desea ver?");
     byte n = lector.nextByte();
     byte x = 1;
     // No permitir valores menores ni iguales a cero

     while (n <= 0){
        System.out.println("No pude ingresar valores menores o igual a cero");
        System.out.println("Que tabla de multiplicar desea ver?");
        n = lector.nextByte();
    
    }

     while (x  <= 10){
      System.out.println(n + " x " + x + " = " + n*x);
      //num++; // num = num + 1; Incremento
     // num--; // num = num - 1; Decremento
      //num = 11;
      x++;
}
       System.out.println("Despues del while");
       System.out.println("Fin");
       lector.close();
    
    
    
    
    }   



 }