package GYM;

import java.util.Scanner;

public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private int DNI ;

    private Couta cuota;

//    private String AbonadoFull;
//    private String AbonadoMediotiempo;



    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int edad , int DNI ,Couta cuota  ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.cuota = cuota;
//        AbonadoFull = abonadoFull;
//        AbonadoMediotiempo = abonadoMediotiempo;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Couta getCuota() {
        return cuota;
    }

    public void setCuota(Couta cuota) {
        this.cuota = cuota;
    }

    public void msjDeRegistro() {
        System.out.println("Nuevo Cliente Registrado Correctamente");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", cuota=" + cuota +
                '}';
    }
}

