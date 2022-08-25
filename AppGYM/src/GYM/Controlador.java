package GYM;

import java.util.ArrayList;

import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        Archivo a = new Archivo();
        Cliente c = new Cliente();
        Cliente c1 = new Cliente("fran", "lugo", 23,46253381, c.getCuota() );
        ArrayList<Cliente> ListaDeCliente = new ArrayList<>();
        // ArrayList<Couta> ListaDeRecibo = new ArrayList<>();

        ListaDeCliente.add(c1);



        boolean bandera = false;
        do {
            ArrayList <String> Clie= new ArrayList<>();
            for (int i = 0; i < ListaDeCliente.size() ; i++) {
                Clie.add(i +" - "+ListaDeCliente.get(i).toString());
            }

            Archivo.guardarArray(Clie,"DatosCliente.txt");

            System.out.println("Gym Zeus");
            System.out.println("-----------------------------------------");
            System.out.println("Menu");
            System.out.println("1- Agregar Nuevo Cliente");
            System.out.println("2- Eliminar Cliente");
            System.out.println("3- Ver Clientes Registrados");
            System.out.println("4- Ver Historial de Pago de Cliente");
            System.out.println("5- Pago de Couta");
            System.out.println("-----------------------------------------");
            var opcM = Leer.nextInt();
            switch (opcM) {
                case 1:
                    System.out.println("1- Agregar Nuevo Cliente");
                        ListaDeCliente.add(Vista.agregarCliente());
                    c.msjDeRegistro();
                    break;
                case 2:
                    System.out.println("2- Eliminar Cliente");
                    System.out.println("Selecione que Cliente desea Eliminar");
                    System.out.println("----------------------------------------------");
                    ArrayList lisDelete = Archivo.cargarArray("DatosCliente.txt");
                    for (int i = 0; i < lisDelete.size(); i++) {
                        System.out.println(lisDelete.get(i));
                    }
                    System.out.println("----------------------------------------------");
                    var rem = Leer.nextInt();
                    ListaDeCliente.remove(rem);
                    lisDelete.remove(rem);

                    break;
                case 3:
                    System.out.println("3- Ver Clientes Registrados");
                    ArrayList lis = Archivo.cargarArray("DatosCliente.txt");
                    for (int i = 0; i < lis.size(); i++) {
                        System.out.println(lis.get(i));
                    }



                    break;
                case 4:
                    System.out.println("4- Ver Historial de Pago de Cliente");
                    System.out.println("| Nombre:    | Apellido:     |   Plan:   | Couta:  | Mes: "  );
                    for (int i = 0; i < ListaDeCliente.size(); i++) {
                        System.out.print("["+i+"] "+ListaDeCliente);
                        break;

                    }
                        }
        } while (bandera == false);



    }


}
