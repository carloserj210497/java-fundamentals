public class Operator {
    public static void main(String[] args) {
        
        double x = 10;
        double y = 5;
        
        System.out.println("--- Operadores Aritméticos Básicos ---");
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " % " + y + " = " + (x % y)); // Módulo (resto de la división)

        System.out.println("\n--- Operadores de Asignación Compuesta ---");
        // Reiniciamos x a 10 para que los resultados sean fáciles de seguir
        x = 10; 
        
        x += y; // Equivalente a: x = x + y
        System.out.println("x += y  -> x ahora vale: " + x);
        
        x -= y; // Equivalente a: x = x - y
        System.out.println("x -= y  -> x ahora vale: " + x);
        
        x *= y; // Equivalente a: x = x * y
        System.out.println("x *= y  -> x ahora vale: " + x);
        
        x /= y; // Equivalente a: x = x / y
        System.out.println("x /= y  -> x ahora vale: " + x);
        
        x %= y; // Equivalente a: x = x % y
        System.out.println("x %= y  -> x ahora vale: " + x);  
        
        System.out.println("\n--- Operadores de Incremento y Decremento ---");
        x = 10; // Reiniciamos x a 10 nuevamente
        
        x++; // Incrementa el valor de x en 1
        System.out.println("x++     -> x ahora vale: " + x);
        
        x--; // Decrementa el valor de x en 1
        System.out.println("x--     -> x vuelve a valer: " + x);
    }
}