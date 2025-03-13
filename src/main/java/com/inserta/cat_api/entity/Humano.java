package com.inserta.cat_api.entity;

public class Humano extends Animal {
    private int id;
    private String nombre;
    private byte edad;
    private String dieta;


    public Humano() {

    }

    public Humano(int id, String nombre, byte edad, String dieta) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.dieta = dieta;
    }

    public Humano(int id, String especie, char alimentacion, String nombre, byte edad, String dieta) {
        super(especie, alimentacion);
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.dieta = dieta;
    }
    public int getid() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return this.edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getDieta() {
        return this.dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public String comer() {
         
        return "Soy un Humano comiendo";
    }

    @Override
    public String dormir() {
        
        return "Soy un Humano durmiendo";
    }

    @Override
    public char getAlimentacion() {
         
        return super.getAlimentacion();
    }

     
    @Override
    public void setAlimentacion(char alimentacion) {
        super.setAlimentacion(alimentacion);
    }

    @Override
    public void setEspecie(String especie) {
        super.setEspecie(especie);
    }

    @Override
    public String toString(){
    return "Humano{" +
                ", id=" + this.id +
                 "especie='" + super.getEspecie() + '\'' +
                ", Alimentación=" + super.getAlimentacion() + '\'' +
                ", nombre='" + this.nombre + '\'' +
                ", edad=" + this.edad +
                ", dieta='" + this.dieta + '\'' +
                '}';
    }

 
    
}
