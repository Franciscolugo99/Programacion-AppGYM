package GYM;

import java.util.Scanner;

public class Vista {

    public static Cliente agregarCliente() {
        Cliente c = new Cliente();

        Scanner Leer2 = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        c.setNombre(Leer2.nextLine());
        System.out.println("Ingrese su apellido");
        c.setApellido(Leer2.nextLine());
        System.out.println("Ingrese su edad");
        c.setEdad(Leer2.nextInt());
        System.out.println("Ingrese su DNI");
        c.setDNI(Leer2.nextInt());
         c.setCuota(agregarCouta());
        return c ;
    }

    public static  Couta agregarCouta(){
        Couta co = new Couta();
        Scanner Leer = new Scanner(System.in);
        System.out.println("Crear Plan");
        System.out.println("Seleccione un Plan");
        System.out.println("1 - Mes completo  Precio -- $3000");
        System.out.println("2 - Medio Mes     Precio -- $1500");
        int op = Leer.nextInt();
        if (op == 1) {
            System.out.println("Mes completo");
            co.setMesCompleto(3000);
        }
        if (op == 2) {
            System.out.println("Mes completo");
            co.setMesMedio(1500);
        }
        return co;
    }

}
