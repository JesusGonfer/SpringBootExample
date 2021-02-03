package com.jesusgonfer.backend.models;


/**
 * Persona
 */
public class Persona {

    private int edad;
    private String nombre;
    private double altura;

    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
    public double getAltura(){
        return altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }


    
}