import java.util.*; 
// Libreria de entrada
// Scanner sirve para ingresar datos

// Metodo main siempre tiene que ir al principio de un codigo
//  System.out.println(x: "Hola mundo");
class Primera_Clase{
    public static void main(String[] args){ // Inicio
    
        Scanner entrada = new Scanner(System.in);
        String n1, n2;
        int edad1, edad2;
        
        System.out.println(x: "Ingrese su nombre y edad");
            n1 = entrada.netLine();
            edad1 = entrada.netInt();

        
        System.out.println(x: "Ingrese su nombre y edad");

            n2 = entrada.netLine();
            edad2 = entrada.netInt();


        System.out.println(x: "Su nombre es"+ n1 +"y su edad es"+ edad1);
        System.out.println(x: "Su nombre es"+ n2 +"y su edad es"+ edad2);
            


       
    }

    // Segundo ejercicio 

    public static void main(String[] args){ // Inicio
        Scanner entrada = new Scanner(System.in);
        
        int = nota1, nota2, nota3;
        System.out.println(x: "Ingrese su nota");
        nota1 = entrada.netInt();
        nota2 = entrada.netInt();
        nota3 = entrada.netInt();

        suma_total = (nota1 + nota2 + nota3);
        promedio = (suma_total/3);

        System.out.println(x: "Su promedio es de ="st + promedio);



    }
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
            String[] nombre = new String [15];
            for(int x = 0; x<nombre.length; x++){
                System.out.println(x: "Ingrese 15 nombres" + "["+x+"]");
                nombre[x] = entrada.netLine();
                
            }

            for (x =0;x>nombre.length;x++){
                System.out.println(x: "Ingrese 15 nombres" + nombre[x]);
                    }

            



    }
}


